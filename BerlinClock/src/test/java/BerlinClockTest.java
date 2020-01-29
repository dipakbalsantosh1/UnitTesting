import static org.junit.Assert.*;

import org.junit.Test;

public class BerlinClockTest {

	@Test
	public void testForEmptyCheck() {

		try {
			BerlinClock.clock("");
		} catch (Exception e) {
			assertEquals("You must provide timne!!!!!!", e.getMessage());
		}
	}

	@Test
	public void testForLengthCheck() {

		try {
			BerlinClock.clock("23:34:23:");
		} catch (Exception e) {
			assertEquals("You must provide correct time!!!!!!", e.getMessage());
		}
	}

	@Test
	public void testFormattedtime1() throws Exception {
		assertEquals("ORRRRRRROYYRYYRYYRYYYYYY", BerlinClock.clock("23:59:59"));
	}

	@Test
	public void testFormattedtime2() throws Exception {
		assertEquals("YOOOOOOOOOOOOOOOOOOOOOOO", BerlinClock.clock("00:00:00"));
	}

	@Test
	public void testFormattedtime3() throws Exception {
		assertEquals("YRRROROOOYYRYYRYYRYOOOOO", BerlinClock.clock("16:50:06"));
	}

	@Test
	public void testFormattedtime4() throws Exception {
		assertEquals("ORROOROOOYYRYYRYOOOOYYOO", BerlinClock.clock("11:37:01"));
	}
}
