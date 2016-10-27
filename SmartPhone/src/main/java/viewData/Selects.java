package viewData;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.createDatabase;

public class Selects {
	public static void viewAllPhones() throws SQLException {
		Statement s = createDatabase.getConn().createStatement();
		ResultSet rs = null;
		rs = s.executeQuery("SELECT * FROM " + createDatabase.getTablename());
		System.out.println("\n\tRECORDS IN TABLE "+createDatabase.getTablename().toUpperCase());
		while(rs.next()){
			int id = rs.getInt("Brand_id");
			String phoneBrand = rs.getString("PHONE_BRAND");
			String phoneModel = rs.getString("PHONE_MODEL");
			double phoneCost = rs.getDouble("PHONE_COST");
			System.out.println("\t"+id + " " + phoneBrand + " "+ phoneModel+ " " +phoneCost);
		}
	}
}
