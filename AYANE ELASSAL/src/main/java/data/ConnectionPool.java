package onlinelibrary.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionPool {



	private static ConnectionPool pool = null;
	private static DataSource dataSource = null;

	private ConnectionPool() {
		try {
			InitialContext ic = new InitialContext();
			dataSource = (DataSource) ic.lookup("java:/comp/env/jdbc/onlinelibrary");
		} catch (NamingException e) {
			System.out.println(e);
		}
	}

	public static synchronized ConnectionPool getInstance() {
		if (pool == null) {
			pool = new ConnectionPool();
		}
		return pool;
	}

	public Connection getConnection() {
		Connection con = null;
		String dbName = "onlinelibrary";

		String userName = "kashwath";

		String password = "tigerlion";

		String hostname = "tiger.ceonkd3lm0ub.us-east-2.rds.amazonaws.com";

		String port = "3306";


		String jdbcUrl = "jdbc:mysql://" + hostname + ":" + port + "/" + dbName + "?user=" + userName       + "&password=" + password;
		/*String url = "jdbc:mysql://localhost:3306/onlinelibrary";
		String username = "root";
		String password = "sridevi";*/

		try
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
			}
			catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			con = DriverManager.getConnection(jdbcUrl);
			System.out.println("Post establishing a DB connection - "+con);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		return con;
		/*try {
			return dataSource.getConnection();
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}*/
	}
	public void freeConnection(Connection c) {
		try {
			c.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}