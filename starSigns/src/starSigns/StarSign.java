package starSigns;
import java.util.Scanner;
import java.util.Calendar;

public class StarSign{
	static Calendar cal = Calendar.getInstance();
	static Integer year = 2004; // year can be set to any leap-year.  But, it must be leap, so that 29 Feb is legal
	static Integer month;	  // 0 = January
	static Integer day;

	private static String getStarSign() {
		Calendar startStarSign = Calendar.getInstance();

		startStarSign.set(year, 0, 20-1); // Aquarius start date
		if(cal.before(startStarSign)) return "Capricorn";

		startStarSign.set(year, 1, 19-1); // Pisces start date
		if(cal.before(startStarSign)) return "Aquarius";

		startStarSign.set(year, 2, 21-1); // Aires start date
		if(cal.before(startStarSign)) return "Pisces";

		startStarSign.set(year, 3, 20-1); // Taurus start date
		if(cal.before(startStarSign)) return "Aires";

		startStarSign.set(year, 4, 21-1); // Gemini start date
		if(cal.before(startStarSign)) return "Taurus";

		startStarSign.set(year, 5, 22-1); // Cancer start date
		if(cal.before(startStarSign)) return "Gemini";

		startStarSign.set(year, 6, 23-1); // Leo start date
		if(cal.before(startStarSign)) return "Cancer";

		startStarSign.set(year, 7, 23-1); // Virgo start date
		if(cal.before(startStarSign)) return "Leo";

		startStarSign.set(year, 8, 23-1); // Libra start date
		if(cal.before(startStarSign)) return "Virgo";

		startStarSign.set(year, 9, 24-1); // Scorpio start date
		if(cal.before(startStarSign)) return "Libra";

		startStarSign.set(year, 10, 22-1); // Sagittarius start date
		if(cal.before(startStarSign)) return "Scorpio";

		startStarSign.set(year, 11, 22-1); // Capricorn start date
		if(cal.before(startStarSign)) return "Sagittarius";

		return "Capricorn";
	}

	private static void setBirthday() {
		try {
			@SuppressWarnings("resource")
			Scanner keyboard = new Scanner(System.in);
			System.out.print ("Enter Month of your birth (1=January): ");
			month = keyboard.nextInt();
			System.out.print ("Enter Day of Month of your birth (1-31): ");
			day = keyboard.nextInt();

			cal.setLenient(false);
			cal.set(year, --month, day); // NB: month reset to 0=January offset
			cal.getTime(); // this will throw an exception if the set was incorrect
		}
  		catch (Exception e) {
			System.out.println ("Error: "+e.getMessage());
			setBirthday(); // try again if we get an exception
  		}
	
	}

	public static void main(String args[]) {
			setBirthday();
			String s=getStarSign();
			System.out.println("Star Sign is:"+s);
	}   
}
