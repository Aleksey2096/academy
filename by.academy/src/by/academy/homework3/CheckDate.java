package by.academy.homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckDate {

	public CheckDate() {
		super();
	}

	public String[] CheckDater(String s) {
		Pattern patton = Pattern.compile("[0-9]{2}/[0-9]{2}/[0-9]{4}");
		Pattern patton1 = Pattern.compile("[0-9]{2}-[0-9]{2}-[0-9]{4}");
		Matcher match = patton.matcher(s);
		Matcher match1 = patton1.matcher(s);
		String[] arr = new String[2];
		while (!match.matches() && !match1.matches()) {
			System.out.println("That's not right format of date");
			s = Application.print("date in this \"dd/MM/yyyy\" or this \"dd-MM-yyyy\" way");
			match = patton.matcher(s);
			match1 = patton1.matcher(s);
		}
		if (match.matches()) {
			arr[0] = "dd/MM/yyyy";
			arr[1] = s;
			return arr;
		} else {
			arr[0] = "dd-MM-yyyy";
			arr[1] = s;
			return arr;
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
