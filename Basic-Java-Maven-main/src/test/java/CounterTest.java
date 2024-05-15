import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CounterTest {

	private Counter testCounter;

	@Before
	public void setUp() {
		testCounter = new Counter();
	}

	@Test
	public void testReset() {
		for (int i = 0; i < 10; i++) {
			testCounter.increment();
		}

		testCounter.reset();

		assertEquals(testCounter.getCount(), 0);
	}

	@Test
	public void testIncrement() {
		for (int i = 1; i < 10; i++) {
			testCounter.increment();
			assertEquals(testCounter.getCount(), i);
		}
	}

	@Test
	public void testDecrement() {
		for (int i = 1; i < 10; i++) {
			testCounter.decrement();
			assertEquals(testCounter.getCount(), i * -1);
		}
	}

}
