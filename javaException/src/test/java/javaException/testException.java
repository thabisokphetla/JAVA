package javaException;
import javaException.stringException;

import static org.junit.Assert.*;

import org.junit.Test;

public class testException {
	@Test
	public void  stringCallOutOfRange(){
		assertEquals("The is an error", stringException.stringExc("THABISO"));
	}
}
