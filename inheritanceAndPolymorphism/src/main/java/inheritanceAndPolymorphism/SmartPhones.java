package inheritanceAndPolymorphism;

import java.text.DecimalFormat;
import java.util.Locale;

public class SmartPhones {
	private String phoneBrand = null;
	private String phoneModel = null;
	private double phoneCost = 0.0;

	public String getPhoneBrand() {
		return phoneBrand;
	}
	public void setPhoneBrand(String phoneBrand) {
		this.phoneBrand = phoneBrand;
	}
	public String getPhoneModel() {
		return phoneModel;
	}
	public void setPhoneModel(String phoneModel) {
		this.phoneModel = phoneModel;
	}
	public double getPhoneCost() {
		return phoneCost;
	}
	public void setPhoneCost(double phoneCost) {
		this.phoneCost = phoneCost;
	}
	public String toString(){
		return phoneBrand +" " +" " +phoneModel+" " + " Will cost you " +
				/*This is how you format to your local currency*/
				DecimalFormat.getCurrencyInstance(new Locale("en","US")).format(phoneCost)
;	}
}
