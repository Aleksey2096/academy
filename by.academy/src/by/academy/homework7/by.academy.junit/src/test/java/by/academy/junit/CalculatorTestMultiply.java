package by.academy.junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculatorTestMultiply extends Assert {
	private int valueX;
	private int valueY;
	private int expected;

	public CalculatorTestMultiply(int expected, int valueX, int valueY) {
		this.expected = expected;
		this.valueX = valueX;
		this.valueY = valueY;
	}

	@Parameters
	public static Collection<Object[]> calculatorTestMultiplyInputData() {
		return Arrays.asList(new Object[][] { { 42, 6, 7 }, { 405, 45, 9 }, { 737, 67, 11 } });
	}

	@Test
	public void getMultiplyTest() {
		assertEquals(expected, Calculator.getMultiply(valueX, valueY));
	}
}
