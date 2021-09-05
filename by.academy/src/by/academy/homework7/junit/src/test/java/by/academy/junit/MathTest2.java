package by.academy.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(TestRunner.class)
public class MathTest2 extends Assert {
	@Test
	public void mathMinTest1() {
		assertEquals(316, Math.min(316, 316.1), 0.01);
	}

	@Test
	public void mathMinTest2() {
		assertEquals(74.9, Math.min(75.1, 74.9), 0.01);
	}
}
