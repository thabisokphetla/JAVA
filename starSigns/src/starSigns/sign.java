package starSigns;

import java.time.Month;
import java.time.MonthDay;
import java.util.Scanner;

/**
 * @author Thabiso K Phetla
 *
 */
public enum sign {
	CAPRICORN(MonthDay.of(Month.DECEMBER,22),MonthDay.of(Month.JANUARY,19)),	
	AQUARIUS(MonthDay.of(Month.JANUARY,20),MonthDay.of(Month.FEBRUARY,18)),	
	PISCES(MonthDay.of(Month.FEBRUARY,19),MonthDay.of(Month.MARCH,20)),
	ARIES(MonthDay.of(Month.MARCH,21),MonthDay.of(Month.APRIL,19)),
	TAURUS(MonthDay.of(Month.APRIL,20),MonthDay.of(Month.MAY,20)),
	GEMINI(MonthDay.of(Month.MAY,21),MonthDay.of(Month.JUNE,20)),
	CANCER(MonthDay.of(Month.JUNE,21),MonthDay.of(Month.JULY,22)),
	LEO(MonthDay.of(Month.JULY,23),MonthDay.of(Month.AUGUST,22)),
	VIRGO(MonthDay.of(Month.AUGUST,23),MonthDay.of(Month.SEPTEMBER,22)),
	LIBRA(MonthDay.of(Month.SEPTEMBER,23),MonthDay.of(Month.OCTOBER,22)),
	SCORPIO(MonthDay.of(Month.OCTOBER,23),MonthDay.of(Month.NOVEMBER,21)),
	SAGITTARIUS(MonthDay.of(Month.NOVEMBER,22),MonthDay.of(Month.DECEMBER,21));

	private final MonthDay startDate;
	private final MonthDay endDate;
	private sign(MonthDay startDate,MonthDay endDate){
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public static sign getSign(MonthDay dayToSign){
		for(sign S : sign.values()){
			if(dayToSign.compareTo(S.getStartDate())>=0 && dayToSign.compareTo(S.getEndDate())<=0){
				return S;
			}
		}
		return sign.CAPRICORN;
	}
	public MonthDay getStartDate() {
		return startDate;
	}
	public MonthDay getEndDate() {
		return endDate;
	}

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Enter DAY : ");
			int day = keyboard.nextInt();
			System.out.print("Enter MONTH : ");
			int month = keyboard.nextInt();
			
			System.out.println(getSign(MonthDay.of(month, day)));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}