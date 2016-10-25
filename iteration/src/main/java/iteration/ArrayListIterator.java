package iteration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class ArrayListIterator {
	/* basic arrayList initialization*/
	static	ArrayList<String> mobilePhones = new ArrayList<String>(Arrays.asList("Samsung","Iphone","Nokia"));
	public static void main(String[] args) {
		try {
			System.out.println("These are all in an arraylist and an Iterator has been used.");
			iterateArrayList();
			System.out.println("These are all in a HashMap and Iterator Has been used.");
			iterateHashMap();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
	}
	public static void iterateHashMap(){
		/*Simple declaration of the HashMap */
		HashMap<Integer,String> person = new HashMap<Integer,String>();
		person.put(1, "Dennis Ritchie");
		person.put(2, "Steve Jobs");
		person.put(3, "Bill Gate");
		/*To iterator throw a loop first set the keys so the Iterator can use to iterate throw the values*/
		Set<Integer> key = person.keySet();
		Iterator<Integer> ScanNames = key.iterator();
		while(ScanNames.hasNext()){
			int id  = ScanNames.next();
			System.out.println(id + " " + person.get(id));
		}
	}
	public static void iterateArrayList() throws ArrayIndexOutOfBoundsException{
		/*This is how you iterate using the ListIterator*/
		ListIterator<String> scanBrands = mobilePhones.listIterator();
		
		while(scanBrands.hasNext()){
			System.out.println(scanBrands.next());
		}
	}
}
