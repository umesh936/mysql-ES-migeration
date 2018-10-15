package migerate;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import lombok.SneakyThrows;

public class Application {

	@SneakyThrows
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Usage: mvn exec:java -Dexec.args=\"<no. of threads/csv file you have>\"");
			System.exit(0);
		}
		ConfigReader.intializeProfile();
		Integer totalCount = Integer.parseInt(args[0]);
		ExecutorService executor = Executors.newFixedThreadPool(totalCount);
		for (int i = 1; i <= totalCount; i++) {
			Runnable worker = new QueryExecutor(i);
			executor.execute(worker);
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}
		System.out.println("Finished all threads");
	}
}
