package by.academy.homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {
	public boolean validate(String s) {
		boolean validate;
		Pattern patton = Pattern.compile(" *\\+375(25|33|44)[0-9]{7} *");
		Matcher match = patton.matcher(s);
		if (match.matches()) {
			validate = true;
			return validate;
		} else {
			validate = false;
			return validate;
		}
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
