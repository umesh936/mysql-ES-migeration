package migerate.connectionPool;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import lombok.extern.slf4j.Slf4j;
import migerate.ConfigReader;

@Slf4j
public class ConnectionPoolFactory {
	private static final String CLASS_NAME = "ConnectionPoolFactory :";
	private static Map<String, HikariDataSource> connectionPoolMap = new HashMap<>();

	public static Connection getDataSourceConnection(String databaseName) throws SQLException {
		HikariDataSource datasource = connectionPoolMap.get(databaseName);
		if (datasource != null) {
			log.debug(CLASS_NAME + "data source found in cache for database: " + databaseName);
			return datasource.getConnection();
		} else {
			synchronized (ConnectionPoolFactory.class) {
				datasource = intializeConnectionPool(databaseName);
				connectionPoolMap.put(databaseName, datasource);
			}
		}
		return datasource.getConnection();
	}

	private static HikariDataSource intializeConnectionPool(String databaseName) {
		HikariConfig config = new HikariConfig();
		HikariDataSource ds = null;
		String url = ConfigReader.GetParameter("CONNECT_URL", true) + databaseName;
		System.out.println(CLASS_NAME + "connecting with URL : " + url);
		config.setJdbcUrl(url);
		config.setUsername(ConfigReader.GetParameter("CONENCT_USER", true));
		config.setPassword(ConfigReader.GetParameter("CONENCT_PASSWORD", true));
		config.addDataSourceProperty("cachePrepStmts", "true");
		config.addDataSourceProperty("prepStmtCacheSize", "250");
		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
		ds = new HikariDataSource(config);
		return ds;
	}

}
