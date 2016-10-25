package phone;

import phoneCompany.Nokia;
import phoneCompany.Samsung;
/**
 * 
 * @author Thabiso Phetla
 * here we are testing the classes we have created
 *
 */
public class testInterface {
	public static void main(String[] args) {
		Samsung sam = new Samsung();
		sam.setPhoneBrand("Samsung");
		sam.setPhoneModel("E250");
		sam.setPhoneCost(1990);
		System.out.println(sam.toString());
		
		Nokia nokia = new Nokia();
		nokia.setPhoneBrand("Nokia");
		nokia.setPhoneModel("3310");
		nokia.setPhoneCost(10000);
		System.out.println(nokia.toString());
		
		DifferentPhones brands = new Nokia();
		brands.setPhoneBrand("Apple");
		brands.setPhoneModel("Iphone 8");
		brands.setPhoneCost(34343);
		System.out.println(brands.toString());
		
		brands = new Samsung();
		brands.setPhoneBrand("Motorola");
		brands.setPhoneModel("v360");
		brands.setPhoneCost(0.99);
		System.out.println(brands.toString());
	}
}