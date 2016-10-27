package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Thabiso K Phetla
 * This class creates a database for SmartPhones and Creates Tables
 * 
 */
public class createDatabase {
	private static final String driver = "org.apache.derby.jdbc.EmbeddedDriver";
	private static final String protocol = "jdbc:derby:";
	static Connection conn = null;
	public static String getProtocol() {
		return protocol;
	}
	private static final String dbName = "Smartphones";
	private static final String tableName = "phones"; //will be used when create table
	public static void embeddedDrive() {
		try {
			Class.forName(driver).newInstance();
			System.out.println("Loaded the embedded driver");
		} catch (Exception e) {
			System.out.println("Failed to load embedded driver");
			System.exit(0);
		}
	}
	public static Connection getConn() {
		return conn;
	}
	public static void setConn(Connection conn) throws SQLException {
		createDatabase.conn = DriverManager.getConnection(protocol+dbName);
	}
	public static void makedatebase() {
		try {		
			System.out.println("Creating database "+dbName);
			conn = DriverManager.getConnection(protocol+dbName+";create = true");
			System.out.println("Database " + dbName +" has been created...");
			System.out.println("connected to Database "+dbName);
			
		} catch (SQLException e) {
			System.out.println("SQL error");
			System.exit(0);
		}
	}
	/**
	 * Create the table for the Smart phone class
	 */
	public static void createTable(){
		/*Create an object to use when for SQL statements*/
		try {
			Statement s = conn.createStatement();
			s.execute("Drop table "+tableName);
			System.out.println("Creating table "+tableName+ "...");
			s.execute("CREATE table "+ tableName +
					" (Brand_ID INT Primary key,PHONE_BRAND varchar(25),PHONE_MODEL varchar(25),PHONE_COST Decimal)");
			System.out.println("Table "+tableName+" has been created ");
		} catch (SQLException e) {
			System.out.println("Failed to create table restart program");
			System.exit(0);
		}
	}
	public static String getTablename() {
		return tableName;
	}
}