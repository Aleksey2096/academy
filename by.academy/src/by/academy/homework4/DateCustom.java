package by.academy.homework4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateCustom {
	private Scanner sc;
	private LocalDate date;
	private Year year;
	private Month month;
	private Day day;

	private class Year {
		private int year;

		public Year() {
			super();
		}

		public Year(int year) {
			super();
			this.year = year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public int getYear() {
			return year;
		}
	}

	private class Month {
		private int month;

		public Month() {
			super();
		}

		public Month(int month) {
			super();
			this.month = month;
		}

		public void setMonth(int month) {
			this.month = month;
		}

		public int getMonth() {
			return month;
		}
	}

	private class Day {
		private int day;

		public Day() {
			super();
		}

		public Day(int day) {
			super();
			this.day = day;
		}

		public void setDay(int day) {
			this.day = day;
		}

		public int getDay() {
			return day;
		}
	}

	private enum DayOfTheWeek {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	}

	public DateCustom() {
		super();
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public DateCustom(String date) {
		super();
		String s = Validate(date);
		year = new Year(Integer.valueOf(s.trim().substring(6)));
		month = new Month(Integer.valueOf(s.trim().substring(3, 5)));
		day = new Day(Integer.valueOf(s.trim().substring(0, 2)));
		this.date = LocalDate.of(year.getYear(), month.getMonth(), day.getDay());
	}

	public LocalDate createDate(int intDay, int intMonth, int intYear) {
		year = new Year(intYear);
		month = new Month(intMonth);
		day = new Day(intDay);
		return date = LocalDate.of(year.getYear(), month.getMonth(), day.getDay());
	}

	public void printDayOfTheWeek(LocalDate date) {
		for (DayOfTheWeek x : DayOfTheWeek.values()) {
			if (x.toString().equalsIgnoreCase(date.getDayOfWeek().toString())) {
				System.out.println(x);
			}
		}
	}

	public String Validate(String s) {
		Pattern patton = Pattern.compile(" *[0-9]{2}-[0-9]{2}-[0-9]{4} *");
		Matcher match = patton.matcher(s);
		sc = new Scanner(System.in);
		while (!match.matches()) {
			System.out.println("Enter correct date");
			s = sc.nextLine();
			match = patton.matcher(s);
		}
		sc.close();
		return s;
	}

	public long countDaysBetween(LocalDate date, LocalDate date1) {
		long days = ChronoUnit.DAYS.between(date, date1);
		return days;
	}

	public void isLeapYear(LocalDate date) {
		if (date.getYear() % 400 == 0 || date.getYear() % 4 == 0 && date.getYear() % 100 != 0) {
			System.out.println(date.getYear() + " year is leap");
		} else {
			System.out.println(date.getYear() + " year is not leap");
		}
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((year == null) ? 0 : year.hashCode());
		result = prime * result + ((month == null) ? 0 : month.hashCode());
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DateCustom other = (DateCustom) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return false;
		if (month == null) {
			if (other.month != null)
				return false;
		} else if (!month.equals(other.month))
			return false;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DateCustom year = ");
		builder.append(year.getYear());
		builder.append(", month = ");
		builder.append(month.getMonth());
		builder.append(", day = ");
		builder.append(day.getDay());
		return builder.toString();
	}
}
