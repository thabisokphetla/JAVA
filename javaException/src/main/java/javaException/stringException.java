/**
	The purpose of this program is to display the how exception worked
	The program testException in the test folder will test the funtion
*/
package javaException;

public class stringException {

	public static String stringExc(String name) {
		
		
		String[] applicationName = new String[1];
		applicationName[0] = name;
		try {
			return applicationName[1]; //This will always throw an ArrayIndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException e) {
			return "The is an error";
		}
	}

}
