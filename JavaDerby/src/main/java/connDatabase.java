import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
/**
 * @author Thabiso K Phetla
 *Demonstrating How to create a data base and also connect to a database
 */
public class connDatabase {
	/**
	 * You have to define your driver in this case the we use derby the embedded Java Drive which comes with java 6+
	 */
	private static final String driver  = "org.apache.derby.jdbc.EmbeddedDriver";
	/**
	 * The protocol to connect with is important other databases have their own protocol check documentation off SQL
	 */
	private static final String protocol = "jdbc:derby:";
	/**
	 * @param args
	 */
	public static void main(String[] args)  {
		try {
			/**
			 * Make the instance of the driver your specified
			 */
			Class.forName(driver).newInstance();
			System.out.println("Loaded the embedded driver");
		} catch (Exception e) {
			System.err.println("FAILED TO LOAD EMBEDDED DRIVER.");
			e.printStackTrace(System.err);
			System.exit(0);
		}
		/**
		 * The Database You are creating and the connection need to be defined
		 */
		String dataBaseName = "kelado";
		Connection conn = null;
		
		try {
			System.out.println("Connecting to and Create the database...");
			/**
			 * To obtain connection tell the driver manager to get you a connection, then pass
			 * the protocol string append wit database string and append with create = true
			 */
			conn = DriverManager.getConnection(protocol+dataBaseName+";create=true");
			System.out.println("Database Created");
			
			/**
			 * Creating a statement object to run SQL Statements
			 */
			Statement s = conn.createStatement();
			int updates = 0;
			/**
			 * This how you create your statements 
			 * We are using s.execute() to create a table and execute the statement
			 */
			s.execute("Drop table names");//We decide to drop the table if it exists
			s.execute("Create table names " +
					"(author varchar(50),author_id int ,"
					+ "url varchar(80))");
			System.out.println("Created names table");
			
			System.out.println("Inserting authors...");
			s.execute("INSERT INTO names "+
					"VALUES ('Thabiso, Phetla',1, 'http://www.phetlathabiso.com')");
			updates+=s.getUpdateCount();
			s.execute("INSERT INTO names "+
					"VALUES ('Sibongile, Mbewe',1,'http://www.SibongileMbewe.com')");
			updates+=s.getUpdateCount();
			s.execute("INSERT INTO names "+
					"VALUES ('tk, Phetla',1,'http://www.tkp.com')");
			updates+=s.getUpdateCount();
			
			System.out.println(updates + " authors added");
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
}
