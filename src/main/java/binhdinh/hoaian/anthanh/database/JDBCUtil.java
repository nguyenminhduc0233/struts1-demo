package binhdinh.hoaian.anthanh.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
	
    private static final String SERVER_NAME = "localhost";
    private static final String PORT = "1433";
    private static final String DATABASE_NAME = "Nuocgiaikhat";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    private static final String URL = "jdbc:sqlserver://" + SERVER_NAME + ":" + PORT + ";databaseName=" + DATABASE_NAME + "encrypt=false;trustServerCertificate=true;";
    
    public static Connection connect() {
    	try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection connect = DriverManager.getConnection(URL);
			System.out.println("connect success");
			return connect;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
    }
    
    public static void close(Connection connect) {
    	try {
			if(connect.isClosed() || connect == null) {
				connect.close();
				System.out.println("close connect");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
     public static void main(String[] args) {
		Connection connect = connect();
		close(connect);
    	 System.out.println("hello");
	}


}
