package by.academy.junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculatorTestDivide extends Assert {
	private int valueX;
	private int valueY;
	private int expected;

	public CalculatorTestDivide(int expected, int valueX, int valueY) {
		this.expected = expected;
		this.valueX = valueX;
		this.valueY = valueY;
	}

	@Parameters
	public static Collection<Object[]> calculatorTestDivideInputData() {
		return Arrays.asList(new Object[][] { { 1, 9, 6 }, { 6, 30, 5 }, { 3, 39, 13 } });
	}

	@Test
	public void getDivideTest() {
		assertEquals(expected, Calculator.getDivide(valueX, valueY));
	}
}
