package starSigns;

import static org.junit.Assert.assertEquals;
import starSigns.sign;
import java.time.MonthDay;
import org.junit.Test;

public class JUTESTING {
	@Test
	public void testStartEndCapricon(){
		assertEquals(sign.CAPRICORN, sign.getSign(MonthDay.of(12,22)));
		assertEquals(sign.CAPRICORN, sign.getSign(MonthDay.of(1,19)));
	}
	@Test
	public void testStartEndAquarius(){
		assertEquals(sign.AQUARIUS, sign.getSign(MonthDay.of(1, 20)));
		assertEquals(sign.AQUARIUS, sign.getSign(MonthDay.of(2, 18)));
	}
	@Test 
	public void testStartEndPisces(){
		assertEquals(sign.PISCES, sign.getSign(MonthDay.of(2, 19)));
		assertEquals(sign.PISCES, sign.getSign(MonthDay.of(3, 20)));
	}
	@Test 
	public void testStartEndAries(){
		assertEquals(sign.ARIES, sign.getSign(MonthDay.of(3, 21)));
		assertEquals(sign.ARIES, sign.getSign(MonthDay.of(4, 19)));
	}
	@Test 
	public void testStartEndTaurus(){
		assertEquals(sign.TAURUS, sign.getSign(MonthDay.of(4, 20)));
		assertEquals(sign.TAURUS, sign.getSign(MonthDay.of(5, 20)));
	}
	@Test 
	public void testStartEndGemini(){
		assertEquals(sign.GEMINI, sign.getSign(MonthDay.of(5, 21)));
		assertEquals(sign.GEMINI, sign.getSign(MonthDay.of(6, 20)));
	}
	@Test 
	public void testStartEndCancer(){
		assertEquals(sign.CANCER, sign.getSign(MonthDay.of(6, 21)));
		assertEquals(sign.CANCER, sign.getSign(MonthDay.of(7, 22)));
	}
	@Test 
	public void testStartEndLeo(){
		assertEquals(sign.LEO, sign.getSign(MonthDay.of(7, 23)));
		assertEquals(sign.LEO, sign.getSign(MonthDay.of(8, 22)));
	}
	@Test
	public void testStartEndVirgo(){
		assertEquals(sign.VIRGO, sign.getSign(MonthDay.of(8, 23)));
		assertEquals(sign.VIRGO, sign.getSign(MonthDay.of(9, 22)));
	}
	@Test
	public void testStartEndLibra(){
		assertEquals(sign.LIBRA, sign.getSign(MonthDay.of(9, 23)));
		assertEquals(sign.LIBRA, sign.getSign(MonthDay.of(10, 22)));
	}
	@Test
	public void testStartEndScorpio(){
		assertEquals(sign.SCORPIO, sign.getSign(MonthDay.of(10, 23)));
		assertEquals(sign.SCORPIO, sign.getSign(MonthDay.of(11, 21)));
	}
	@Test
	public void testStartEndSagittarius(){
		assertEquals(sign.SAGITTARIUS, sign.getSign(MonthDay.of(11, 22)));
		assertEquals(sign.SAGITTARIUS, sign.getSign(MonthDay.of(12, 21)));
	} 
	@Test (expected=Exception.class)
	public void testInvalidMonthDay(){
		sign.getSign(MonthDay.of(13,34));
	}
	@Test (expected=Exception.class)
	public void testInvalidDay(){
		sign.getSign(MonthDay.of(1,32));
	}
	@Test (expected=Exception.class)
	public void testInvalidMonth(){
		sign.getSign(MonthDay.of(0, 12));
	}
	@Test (expected=Exception.class)
	public void testMonthEndWithShortDay(){
		sign.getSign(MonthDay.of(4,31));
	}
	@Test (expected=Exception.class)
	public void testFebruary(){
		sign.getSign(MonthDay.of(2,30));
	}
}