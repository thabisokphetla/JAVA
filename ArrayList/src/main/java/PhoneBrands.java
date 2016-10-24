import java.util.ArrayList;
import java.util.Arrays;
/**
 * 
 * @author Thabiso k Phetla
 *
 */
public class PhoneBrands {
	static ArrayList<String> phoneName = new ArrayList<String>(Arrays.asList("Samsung","Iphone","Nokia")) ;
public static void main(String[] args) {
		try {
			System.out.println(getPhoneName(2));
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
	public static String getPhoneName(int phonePosition) throws ArrayIndexOutOfBoundsException {
		return phoneName.get(phonePosition);
	}
	
}
