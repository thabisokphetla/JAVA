package cellphoneCompanies;

import inheritanceAndPolymorphism.SmartPhones;

public class SelfDefineBrand extends SmartPhones {
	public SelfDefineBrand(String brandName,String Model ,double price) {
		this.setPhoneBrand(brandName);
		this.setPhoneModel(Model);
		this.setPhoneCost(price);
	}
}
