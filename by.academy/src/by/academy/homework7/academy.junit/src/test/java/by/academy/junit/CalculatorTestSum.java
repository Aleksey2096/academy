package by.academy.junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculatorTestSum extends Assert {
	private int valueX;
	private int valueY;
	private int expected;

	public CalculatorTestSum(int expected, int valueX, int valueY) {
		this.expected = expected;
		this.valueX = valueX;
		this.valueY = valueY;
	}

	@Parameters
	public static Collection<Object[]> calculatorTestSumInputData() {
		return Arrays.asList(new Object[][] { { 15, 6, 9 }, { 8, 3, 5 }, { 79, 63, 16 } });
	}

	@Test
	public void getSumTest() {
		assertEquals(expected, Calculator.getSum(valueX, valueY));
	}
}
