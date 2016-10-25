package phoneCompany;

import java.text.DecimalFormat;
import java.util.Locale;

import phone.DifferentPhones;
/*NB when implementing an interface remember to define All the methods*/
public class Nokia implements DifferentPhones {
	private String phoneBrand;
	private String phoneModel;
	private double phoneCost;

	public Nokia() {

	}

	public void setPhoneBrand(String phoneBrand) {
		this.phoneBrand = phoneBrand;
	}

	public void setPhoneModel(String phoneModel) {
		this.phoneModel = phoneModel;
	}

	public void setPhoneCost(double phoneCost) {
		this.phoneCost = phoneCost;
	}

	public String getPhoneBrand() {
		return phoneBrand;
	}

	public String getPhoneModel() {
		return phoneModel;
	}

	public double getPhoneCost() {
		return phoneCost;
	}
	public String toString(){
		return phoneBrand+" Model "+phoneModel+" Costs "+DecimalFormat.getCurrencyInstance(new Locale("en", "US")).format(phoneCost)+"\n";
	}

}
