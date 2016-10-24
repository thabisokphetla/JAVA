package moreException;
import org.junit.Test;
/**
 * @author Thabiso 
 * Test if class stringExceptions throws an exception.
 */
public class testString {
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testArrayIndexOutOfBoundsException(){
		stringException.exceptionThrowing();
	}
}