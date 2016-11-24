package starSigns;

import java.time.LocalDateTime;
/**
 * @author Thabiso K Phetla
 *
 */
public class Stars {
	private static int day, year, month;
	private static String starSign = null;

	public Stars() {
		day = LocalDateTime.now().getDayOfMonth();
		month = LocalDateTime.now().getMonthValue();
		year = LocalDateTime.now().getYear();
	}

	public static int getDay() {
		return day;
	}

	public static void setDay(int day) {
		Stars.day = day;
	}

	public static int getMonth() {
		return month;
	}

	public static void setMonth(int month) {
		Stars.month = month;
	}

	public static int getYear() {
		return year;
	}

	public static void setYear(int year) {
		Stars.year = year;
	}
	public static String signs() {
		if ((month == 12 && day >= 22 && day <= 31) || (month == 1 && day >= 1 && day <= 19))
			starSign = "Capricorn";
		else if ((month == 1 && day >= 20 && day <= 31) || (month == 2 && day >= 1 && day <= 17))
			starSign = "Aquarius";
		else if ((month == 2 && day >= 18 && day <= 29) || (month == 3 && day >= 1 && day <= 19))
			starSign = "Pisces";
		else if ((month == 3 && day >= 20 && day <= 31) || (month == 4 && day >= 1 && day <= 19))
			starSign = "Aries";
		else if ((month == 4 && day >= 20 && day <= 30) || (month == 5 && day >= 1 && day <= 20))
			starSign = "Taurus";
		else if ((month == 5 && day >= 21 && day <= 31) || (month == 6 && day >= 1 && day <= 20))
			starSign = "Gemini";
		else if ((month == 6 && day >= 21 && day <= 30) || (month == 7 && day >= 1 && day <= 22))
			starSign = "Cancer";
		else if ((month == 7 && day >= 23 && day <= 31) || (month == 8 && day >= 1 && day <= 22))
			starSign = "Leo";
		else if ((month == 8 && day >= 23 && day <= 31) || (month == 9 && day >= 1 && day <= 22))
			starSign = "Virgo";
		else if ((month == 9 && day >= 23 && day <= 30) || (month == 10 && day >= 1 && day <= 22))
			starSign = "Libra";
		else if ((month == 10 && day >= 23 && day <= 31) || (month == 11 && day >= 1 && day <= 21))
			starSign = "Scorpio";
		else if ((month == 11 && day >= 22 && day <= 30) || (month == 12 && day >= 1 && day <= 21))
			starSign = "Sagittarius";
		return starSign.toUpperCase();
	}

	public static String veiwSign() {
		return day + "-" + month + "-" + year +" "+ signs();
	}
}
