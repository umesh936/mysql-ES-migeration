package migerate;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.FileEntity;
import org.apache.http.impl.client.HttpClientBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import lombok.SneakyThrows;
import migerate.ES.DTO.Loan;
import migerate.connectionPool.LoanQueryExecutor;

public class QueryExecutor implements Runnable {
	private static final String CLASS_NAME = "QueryExecutor";
	LoanQueryExecutor loanQueryExecutor = new LoanQueryExecutor();;
	private final Integer counter;
	private boolean createNewFile = true;
	private int rowCount = 0;

	private FileWriter fw = null;
	private BufferedWriter bw = null;
	private ObjectMapper objectMapper = new ObjectMapper();

	public QueryExecutor(int counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		String fileNameWithPath = ConfigReader.GetParameter("CSV_PATH", false)
				+ ConfigReader.GetParameter("CSV_FILE_NAME", false) + counter + ".csv";
		String[] processingRecord = null;
		try {
			FileWriter reportWriter = new FileWriter(
					ConfigReader.GetParameter("OUTPUT_PATH", false) + "report_" + counter + ".csv");
			CSVWriter csvReportWriter = new CSVWriter(reportWriter, ',', '\'');
			CSVReader csvReader = new CSVReader(new FileReader(fileNameWithPath));
			while ((processingRecord = csvReader.readNext()) != null) {
				Long startTime = System.currentTimeMillis();
				Loan loan = new Loan();
				loan.setLoanExternalId(processingRecord[0]);
				try {
					if (processingRecord[1] != null) {
						loan.setCurrentAssignedLender(processingRecord[1]);
					}
				} catch (Exception e) {
					System.out.println("Lender not found.");
				}
				Integer totalQueryStr = Integer.parseInt((String) ConfigReader.GetParameter("TOTAL_QUERY", false));
				for (int index = 1; index <= totalQueryStr; index++) {
					try {
						loanQueryExecutor.processQuery("QUERY_" + index, loan);
					} catch (NoSuchFieldException | SecurityException | IllegalArgumentException
							| IllegalAccessException | SQLException e) {
						e.printStackTrace();
					}
				}
				Long endTime = System.currentTimeMillis();
				System.out.println(CLASS_NAME + " Total Time taken _---------------");
				System.out.println(endTime - startTime);
				csvReportWriter.writeNext(processingRecord);
				uploadJsonToES(loan, counter);
			}
			csvReader.close();
			csvReportWriter.close();
			try {
				bw.flush();
				bw.close();
				sendFile(ConfigReader.GetParameter("OUTPUT_PATH", false) + "loan_" + counter + ".json");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

	@SneakyThrows
	private void uploadJsonToES(Loan loan, int counter) {
		String jsonFileWithPath = ConfigReader.GetParameter("OUTPUT_PATH", false) + "loan_" + counter + ".json";
		if (createNewFile) {
			fw = new FileWriter(jsonFileWithPath);
			bw = new BufferedWriter(fw);
			createNewFile = false;
		}

		bw.write(
				"{\"index\":{\"_index\":\"loan\", \"_type\":\"loan\", \"_id\": \"" + loan.getLoanExternalId() + "\"}}");
		bw.write("\n");
		bw.write(objectMapper.writeValueAsString(loan));
		bw.write("\n");

		rowCount++;
		if (rowCount == 1000) {
			rowCount = 0;
			bw.flush();
			bw.close();
			sendFile(jsonFileWithPath);
			createNewFile = true;
		}

	}

	private void sendFile(String fileName) throws Exception {
		String elasticSearchBulkUrl = ConfigReader.GetParameter("ES_BULK_URL", false);
		File jsonFile = new File(fileName);
		HttpEntity entity = new FileEntity(jsonFile);
		HttpPost post = new HttpPost(elasticSearchBulkUrl);
		post.setEntity(entity);

		HttpClientBuilder clientBuilder = HttpClientBuilder.create();
		HttpClient client = clientBuilder.build();

		post.addHeader("content-type", "text/plain");
		post.addHeader("Accept", "text/plain");

		HttpResponse response = client.execute(post);

		System.out.println("Response: " + response);
	}

}
