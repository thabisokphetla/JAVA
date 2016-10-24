package moreException;
/**
 * 
 * @author Thabiso
 * The application demonstrates how exceptions are thrown from a method level
 * exceptionThrowing() is a method that throws an ArrayIndexOutOfBoundsException exception when the function 
 * is called it should be surrounded by a try/catch.
 *
 */
public class stringException {
		public static void main(String[] args){
			try {
				exceptionThrowing();
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array Index out of Bound");
			}
		}
		public static void exceptionThrowing() throws ArrayIndexOutOfBoundsException{
			String[] name = {"Thabiso"};
			
			System.out.println(name[1]);//putting one here will solve the problem
		}
}
