import static org.junit.Assert.*;

import org.junit.Test;

public class TestPeople {
	@Test
	public void correctPersonReturned(){
		assertEquals("Steve Jobs".toLowerCase(),People.peopleIdentities(2));
	}
	@Test
	public void hashMapReturnAnullIfOutOfBound(){
		assertEquals(null,People.peopleIdentities(54));
	}
}
