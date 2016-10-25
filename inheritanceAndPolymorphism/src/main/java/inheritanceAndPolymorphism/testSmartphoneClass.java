package inheritanceAndPolymorphism;

import java.util.ArrayList;
import java.util.ListIterator;

import cellphoneCompanies.*;

public class testSmartphoneClass {

	public static void main(String[] args) {
		System.out.println("This is just a test to see if class smartphone functions properly");
		SmartPhones samsung = new SmartPhones();
		samsung.setPhoneBrand("Samsung");
		samsung.setPhoneModel("Galaxy Pocket");
		samsung.setPhoneCost(12);
		System.out.println(samsung.toString()+"\n");
		
		System.out.println("I Have Now Inherited from class smartphone as Samsung");
		SmartPhones sam = new Samsung();
		System.out.println(sam.toString()+"\n");

		System.out.println("I Have Now Inherited from class smartphone as Sony");
		SmartPhones sony = new Sony();
		System.out.println(sony.toString()+"\n");
		
		System.out.println("I Have Now Inherited from class smartphone as Apple");
		SmartPhones apple = new Apple();
		System.out.println(apple.toString()+"\n");
		
		System.out.println("This is a new class called selfDefineBrand which companies can use for other phones");
		SmartPhones unknownBrands = new SelfDefineBrand("huawei", "P8", 900.0);
		System.out.println(unknownBrands.toString()+"\n");
		
		/*An Array List to create and store multiple phones*/
		System.out.println("Using SelfDefinedBrand we add different Phone to an arraylist and Iterating throw it.");
		ArrayList<SmartPhones> phones = new ArrayList<SmartPhones>();
		phones.add(new SelfDefineBrand("Vodafone", "Y2K", 1100.0));
		phones.add(new SelfDefineBrand("Sansui", "Ace j1", 99.0));
		phones.add(new SelfDefineBrand("Toshiba", "VIbe", 95.0));
		phones.add(new SelfDefineBrand("AG mobile", "Selfie", 10.99));
		ListIterator<SmartPhones> phoneScan = phones.listIterator();
		
		while(phoneScan.hasNext()){
	
			System.out.println(phoneScan.next());
		}
}

}
