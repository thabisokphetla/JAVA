
import org.junit.Test;
import static org.junit.Assert.*;

public class testPhoneBrands {
	@Test
	public void expectingSamsung(){
		assertEquals("Samsung",PhoneBrands.getPhoneName(0));
	}
	@Test
	public void expectingNokia(){
		assertEquals("Nokia",PhoneBrands.getPhoneName(2));
	}
	@Test
	public void expectingIphone(){
		assertEquals("iphone",PhoneBrands.getPhoneName(1));
	}
	@Test (expected = Exception.class)
	public void getSamsung(){
		PhoneBrands.getPhoneName(4);
	}
}
