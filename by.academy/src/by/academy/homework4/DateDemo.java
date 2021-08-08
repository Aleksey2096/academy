package by.academy.homework4;

public class DateDemo {
	public static void main(String... args) {
		DateCustom dateCustom1 = new DateCustom();
		dateCustom1.createDate(10, 10, 2000);
		System.out.println(dateCustom1.getDate());
		dateCustom1.printDayOfTheWeek(dateCustom1.getDate());
		DateCustom dateCustom2 = new DateCustom("20-12-2010");
		System.out.println(dateCustom1.countDaysBetween(dateCustom1.getDate(), dateCustom2.getDate())
				+ " days between: " + dateCustom1.getDate() + " and " + dateCustom2.getDate());
		dateCustom1.isLeapYear(dateCustom1.getDate());
		dateCustom2.isLeapYear(dateCustom2.getDate());
	}
}
