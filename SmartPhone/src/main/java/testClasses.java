import java.sql.SQLException;
import java.util.Scanner;

import dataManipulation.Insert;
import database.createDatabase;
import viewData.Selects;
/**
 * 
 * @author Thabiso K Phetla
 * The application is to show how data from database is processed  by using java 
 * I did not do data validation the class Exception handles errors, So use it correctly don't try funny things here
 * Brand ID and Phone cost are numbers not do test chars or strings the program will crush
 */
public class testClasses {
	public static void main(String[] args) throws SQLException {
		createDatabase.embeddedDrive();
		createDatabase.makedatebase();
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int choice;
		/**
		 * if table does not exist uncomment
		 */
		//createDatabase.createTable(); 
		System.out.println("1 INSERT PHONE\n2 VIEW AVAILABLE PHONES");
		choice = keyboard.nextInt();
		switch(choice){
			case 1:
				Insert.insertCellBrand();
				break;
			case 2:
				Selects.viewAllPhones();
				break;
		}
	}
}
