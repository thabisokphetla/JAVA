package dataManipulation;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import database.createDatabase;

public class Insert {
	public static void insertCellBrand() throws SQLException{
		/**
		 * This class we will need a connection to the database
		 **/
		int updateCount = 0;
		String sentinal = "Yes";
		Statement s;
		while (sentinal.equalsIgnoreCase("Yes")) {
			@SuppressWarnings("resource")
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Enter the Brand Id : ");
			int bId = keyboard.nextInt();
			keyboard.nextLine();
			System.out.println();
			System.out.print("Enter the Phone Brand  : ");
			String phoneBrnd = keyboard.nextLine();
			System.out.println();
			System.out.print("Enter the phone Mode : ");
			String phoneModel = keyboard.nextLine();
			System.out.println();
			System.out.print("Enter the phone cost : ");
			double cost = keyboard.nextDouble();
			System.out.println();
			s = createDatabase.getConn().createStatement();
			s.execute("INSERT INTO " + createDatabase.getTablename().toUpperCase() + " VALUES (" + bId + ",'" + phoneBrnd.toUpperCase() + "' ,'"
					+ phoneModel.toUpperCase() + "'," + cost + ")");
			updateCount += s.getUpdateCount();
			System.out
					.println("Product ID " + bId + " Has been Inserted .\n1 New Row Inserted.");
			System.out.print("Do you wish to make more Insert Yes/No :");
			sentinal = keyboard.next();
			if(sentinal.equalsIgnoreCase("no")){
				System.out.println(updateCount+" Inserts made.");
				s.close();
			}
			else if(!sentinal.equalsIgnoreCase("no")|| !sentinal.equalsIgnoreCase("yes")){
				System.out.println("WE EXPECTED AN NO/YES");
			}
				
		}
		
	}
}
