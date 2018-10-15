package migerate.connectionPool;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.mysql.jdbc.StringUtils;

import migerate.ConfigReader;
import migerate.ES.DTO.Loan;

public class LoanQueryExecutor {
	public  void processQuery(String queryName, Loan loan) throws SQLException, NoSuchFieldException,
			SecurityException, IllegalArgumentException, IllegalAccessException {
		String query = ConfigReader.GetParameter(queryName, false);
		if (query.contains("@")) {
			System.out.println("Variable to  exists in query. " + queryName);
			String patternString = "@([^\\s]{1,})";
			Pattern pattern = Pattern.compile(patternString);
			Matcher matcher = pattern.matcher(query);
			// int index = 0;
			System.out.println(matcher.groupCount());
			while (matcher.find()) {
				String variable = matcher.group(0);
				Field field = loan.getClass().getDeclaredField(variable.substring(1));
				field.setAccessible(true);
				Object object = field.get(loan);
				if (object != null) {
					if (field.getType() == String.class) {
						query = query.replace(variable, "'" + object.toString() + "'");
					} else {
						query = query.replace(variable, object.toString());
					}
				}
			}
		}
		System.out.println("Executing Query : " + query);
		String databaseName = ConfigReader.GetParameter(queryName + "_DB", false);
		try (Connection con = ConnectionPoolFactory.getDataSourceConnection(databaseName);
				PreparedStatement pst = con.prepareStatement(query);
				ResultSet rs = pst.executeQuery();) {
			while (rs.next()) {
				ResultSetMetaData metaData = rs.getMetaData();
				Integer columnCount = metaData.getColumnCount();
				Class<?> objectClass = loan.getClass();
				for (int i = 1; i <= columnCount; i++) {
					Field field = objectClass.getDeclaredField(metaData.getColumnLabel(i));
					field.setAccessible(true);
					if (rs.getMetaData().getColumnClassName(i).equals("String")) {
						if (StringUtils.isEmptyOrWhitespaceOnly(rs.getString(i)))
							continue;
					}
					if (field.getType() == Boolean.class)

						field.set(loan, Boolean.parseBoolean((String) rs.getObject(i)));
					field.set(loan, rs.getObject(i));
				}
			}
		}
	}
}
