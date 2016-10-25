import java.util.HashMap;
/**
 * 
 * @author Thabiso Phetla 
 * Hash map simple usage
 *
 */
public class People {
	public static void main(String[] args) {
		System.out.println(peopleIdentities(4));
	}
	/**
	 * if the key is unknown a null will be returned
	 * @param Id
	 * @return The name linked to the Id 
	 */
	public static String peopleIdentities(int Id){
			HashMap<Integer, String> person = new HashMap<Integer, String>();
			
			person.put(1,"Dennis Ritchie".toLowerCase());
			person.put(2,"Steve jobs".toLowerCase());
			person.put(3, "Bill Gates".toLowerCase());
			
			System.out.println(person);
			
			return person.get(Id);
	}
}