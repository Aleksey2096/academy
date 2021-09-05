package by.academy.junit;

import org.junit.runner.Description;
import org.junit.runner.notification.RunListener;

public class CalculatorTestListener extends RunListener {
	@Override
	public void testFinished(Description description) {
		System.out.println("testFinished");
	}
}
