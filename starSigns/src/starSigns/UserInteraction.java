package starSigns;

import java.util.Scanner;

/**
 * @author Thabiso K Phetla
 *
 */
public class UserInteraction {
	private static int day,month;
	static Scanner input = new Scanner(System.in);
	public static void userInformation() throws Exception{
		System.out.print("Enter DAY OF BIRTH (1 - 31) : ");
		day = input.nextInt();
		System.out.print("Enter MONTH OF BIRTH (1 - 12): ");
		month = input.nextInt();
		monthCheck(month);
		daysCheck(day,month);
		Stars.setDay(day);
		Stars.setMonth(month);
	}
	public static void monthCheck(int mn) throws Exception {
			if (mn < 1 || mn >12)
				throw new Exception("Months Range From 1 - 12.");
	}
	public static void daysCheck(int day ,int month) throws Exception{
		if (month == 4 || month == 6 || month == 9 || month == 11){
			if (day > 30)
				throw new Exception("Months 4,6,9 and 11 always end on the 30th.");
		} 
		if (day < 1 || day > 31){
			throw new Exception("Months Range From 1 to 31.");
		}
		if (month == 2){
			if (day > 29){
				throw new Exception("February end on the 29th or 28th.");
			}
		}
	}
}
