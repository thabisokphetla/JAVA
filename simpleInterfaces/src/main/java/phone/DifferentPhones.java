
package phone;
/**
 * 
 * @author thabiso phetla
 *	
 */
/*interface is implemented by Nokia and Samsung*/
public interface DifferentPhones {
	public void setPhoneBrand(String phoneBrand);
	public void setPhoneModel(String phoneModel);
	public void setPhoneCost(double phoneCost);
	public String getPhoneBrand();
	public String getPhoneModel();
	public double getPhoneCost();
	public String toString();
}
