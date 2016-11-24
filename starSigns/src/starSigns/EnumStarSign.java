package starSigns;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Scanner;

/**
 * @author Thabiso K Phetla
 *
 */
public enum EnumStarSign {
	AQUARIUS,CAPRICORN,PISCES,ARIES,TAURUS,GEMINI,
	CANCER,LEO,VIRGO,LIBRA,SCORPIO,SAGITTARIUS;
	private static int year = LocalDateTime.now().getYear();
	static Calendar cal = Calendar.getInstance();

	private static EnumStarSign getStarSign() {
		Calendar startStarSign = Calendar.getInstance();

		startStarSign.set(year,0,20-1);
		if(cal.before(startStarSign)) return EnumStarSign.CAPRICORN;

		startStarSign.set(year, 1, 19-1); 
		if(cal.before(startStarSign)) return EnumStarSign.AQUARIUS;

		startStarSign.set(year, 2, 21-1); 
		if(cal.before(startStarSign)) return EnumStarSign.PISCES;

		startStarSign.set(year, 3, 20-1); 
		if(cal.before(startStarSign)) return EnumStarSign.ARIES;

		startStarSign.set(year, 4, 21-1); 
		if(cal.before(startStarSign)) return EnumStarSign.TAURUS;

		startStarSign.set(year, 5, 22-1); 
		if(cal.before(startStarSign)) return EnumStarSign.GEMINI;

		startStarSign.set(year, 6, 23-1); 
		if(cal.before(startStarSign)) return EnumStarSign.CANCER;

		startStarSign.set(year, 7, 23-1); 
		if(cal.before(startStarSign)) return EnumStarSign.LEO;

		startStarSign.set(year, 8, 23-1); 
		if(cal.before(startStarSign)) return EnumStarSign.VIRGO;

		startStarSign.set(year, 9, 24-1); 
		if(cal.before(startStarSign)) return EnumStarSign.LIBRA;

		startStarSign.set(year, 10, 22-1); 
		if(cal.before(startStarSign)) return EnumStarSign.SCORPIO;

		startStarSign.set(year, 11, 22-1); 
		if(cal.before(startStarSign)) return EnumStarSign.SAGITTARIUS;		
		return EnumStarSign.CAPRICORN;
	}
	public static void main(String[] args) {
		int m = 2,d = 12;
		@SuppressWarnings("resource")
		Scanner key = new Scanner(System.in);
		System.out.print("Enter DAY 	: ");
		d = key.nextInt();
		System.out.print("Enter MONTH : ");
		m = key.nextInt();
		try {
			cal.setLenient(false);
			cal.set(year, m,d);
			cal.getTime();
			System.out.println("\t"+EnumStarSign.getStarSign());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}
}