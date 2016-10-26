import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * 
 * @author Thabiso K Phetla
 *Remember to include the derby from lib.
 *I have copied the kelado database from project javaDerby. 
 */
public class Query {
	
	private static final String driver = "org.apache.derby.jdbc.EmbeddedDriver";
	private static final String protocal = "jdbc:derby:";
	
	public static void displayNameRow(ResultSet rs) throws SQLException{
			int id = rs.getInt("author_id");
			String author = rs.getString("author");
			String url = rs.getString("url");
			System.out.println("ID = "+ id +" Author = "+ author + " url = "+url);
	}
	public static void main(String[] args) {
		/**
		 * First thing is to connect to the embedded drive
		 */
		try{
			Class.forName(driver).newInstance();
			System.out.println("Loaded the embedded driver");
		}
		catch(Exception e){
			
			System.out.println("Unable to load the embedded drive");
			e.printStackTrace(System.err);
			System.exit(0);
		}
		String dbName = "Kelado";
		Connection conn = null;
		
		try {
			System.out.println("Connecting to " + dbName +" database...");
			conn = DriverManager.getConnection(protocal + dbName);
			System.out.println("connected to " + dbName +"...");
			
			Statement s = conn.createStatement();
			/**
			 * ResultSet are returned from executeQuery 
			 */
			ResultSet rs = null;
			System.out.println("All rows :");
			/**
			 * Remember the executeQuery is used to retrieve query
			 */
			rs = s.executeQuery("SELECT author,author_id,url from names");
			/*
			 * Looping through the result set
			 */
			while(rs.next()){
				displayNameRow(rs);
			}
			rs.close();
			
			System.out.println();
			System.out.println("All rows with an ID > 1");
			
			rs = s.executeQuery("SELECT author,author_id,url "+
							"FROM names WHERE author_id > 1");
			while(rs.next()){
				displayNameRow(rs);
			}
			rs.close();
			conn.close();
			
		} catch (SQLException e) {
			System.err.println("SQL Error.");
			e.printStackTrace(System.err);
			System.exit(0);
		} 
	}
}