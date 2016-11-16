package Sunday;

import java.util.Calendar;

/**
 * @author Thabiso K Phetla
 *
 */
public class CountSundays {

	public static void main(String[] args) {
		NumOfSundayUsingAPI(); /*Uses Calendar class*/
		//NumOfSundays();/*Manual manipulation*/
	}	

	/*Manual */
	public static void NumOfSundays(){
		int Sunday = 0,daysInMonth,daysPassed = 0;

		for(int year = 1901;year < 2001;year++){
			for(int month = 1; month <=12;month++){
				if (month == 4 || month == 6 || month == 9 || month == 11){
					daysInMonth = 30;
				}
				else if( month == 2)
				{
					if ( year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
						daysInMonth = 29;
					else
						daysInMonth = 28;			
				}else{
					daysInMonth = 31;
				}
				if(daysPassed % 7 == 0)
					Sunday++;
				daysPassed+=daysInMonth;
			}
		}
		System.out.println("The were "+ Sunday + " Sundays in the 20th century");
	}
	/*Using the calendar Class*/
	public static void NumOfSundayUsingAPI(){
		int Sunday = 0,monday = 0,tuesday = 0 ,wednesday = 0,thur = 0,fri =0,sat = 0;
		Calendar calendar = Calendar.getInstance();
		for( int yr = 2015 ; yr < 2016 ; yr++){
			for(int month = 1 ; month <= 12 ;month++){	
				calendar.set(yr, month, 1);
				if(calendar.getTime().toString().substring(0,3).equalsIgnoreCase("sun")){
					Sunday++;
				}else if(calendar.getTime().toString().substring(0,3).equalsIgnoreCase("sat")){
					sat++;
				}else if(calendar.getTime().toString().substring(0,3).equalsIgnoreCase("mon")){
					monday++;
				}else if(calendar.getTime().toString().substring(0,3).equalsIgnoreCase("tue")){
					tuesday++;
				}else if(calendar.getTime().toString().substring(0,3).equalsIgnoreCase("wed")){
					wednesday++;
				}else if(calendar.getTime().toString().substring(0,3).equalsIgnoreCase("thu")){
					thur++;
				}else if(calendar.getTime().toString().substring(0,3).equalsIgnoreCase("fri")){
					fri++;
				}
			}	
		}
		System.out.println("monday 		= "+ monday );
		System.out.println("Tuesday 	= "+ tuesday);
		System.out.println("Wednesday 	= "+ wednesday);
		System.out.println("Thursday 	= "+ thur);
		System.out.println("Friday		= "+ fri);
		System.out.println("Saturday	= "+ sat);
		System.out.println("Sundays		= "+ Sunday);
		int sum = monday+tuesday+wednesday+thur+fri+sat+Sunday;
		System.out.println("Total Number of days "+sum);
	}
}