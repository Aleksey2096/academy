package by.academy.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(TestRunner.class)
public class MathTest1 {
	@Test
	public void mathPowTest1() {
		Assert.assertEquals(16, Math.pow(4, 2), 0.01);
	}

	@Test
	public void mathPowTest2() {
		Assert.assertTrue(Math.pow(5, 3) == Math.pow(10, 2) + Math.pow(5, 2));
	}
}
