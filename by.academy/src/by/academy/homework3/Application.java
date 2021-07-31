package by.academy.homework3;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {
	private static Deal[] deals = new Deal[100];
	static Scanner sc = new Scanner(System.in);

	public static String print(String text) {
		System.out.println("Enter " + text + ": ");
		String x = sc.nextLine();
		return x;
	}

	public static String checkDouble(String text) {
		Pattern patton = Pattern.compile(" *-?[1-9]\\d*\\.?\\d* *");
		Pattern patton1 = Pattern.compile(" *0 *");
		Matcher match = patton.matcher(text);
		Matcher match1 = patton1.matcher(text);
		String str = text;
		while (!match.matches() && !match1.matches()) {
			System.out.println('\n' + "Wrong type of data!");
			str = print("number");
			match = patton.matcher(str);
			match1 = patton1.matcher(str);
		}
		return str;
	}

	public static String checkLong(String text) {
		Pattern patton = Pattern.compile(" *-?[1-9]\\d* *");
		Pattern patton1 = Pattern.compile(" *0 *");
		Matcher match = patton.matcher(text);
		Matcher match1 = patton1.matcher(text);
		String str = text;
		while (!match.matches() && !match1.matches()) {
			System.out.println('\n' + "Wrong type of data!");
			str = print("number");
			match = patton.matcher(str);
			match1 = patton1.matcher(str);
		}
		return str;
	}

	public static String checkBoolean(String text) {
		Pattern patton = Pattern.compile(" *true *");
		Pattern patton1 = Pattern.compile(" *false *");
		Matcher match = patton.matcher(text);
		Matcher match1 = patton1.matcher(text);
		String str = text;
		while (!match.matches() && !match1.matches()) {
			System.out.println('\n' + "Wrong type of data!");
			str = print("\"true\" or \"false\"");
			match = patton.matcher(str);
			match1 = patton1.matcher(str);
		}
		return str;
	}

	public static void addAnotherProduct(int numOfDeal) {
		int addThisProduct = 0;
		String nextProduct;
		for (int i = 0; i < deals[numOfDeal].getProducts().length; i++) {
			try {
				deals[numOfDeal].getProducts()[i].equals(null);
			} catch (java.lang.NullPointerException e) {
				break;
			}
			addThisProduct++;
		}
		String typeOfTheProduct = print("type of the product (bread, beer or wine)");
		while (!typeOfTheProduct.equalsIgnoreCase("wine") && !typeOfTheProduct.equalsIgnoreCase("bread")
				&& !typeOfTheProduct.equalsIgnoreCase("beer")) {
			System.out.println("That's not right type of the product");
			typeOfTheProduct = print("type of the product (bread, beer or wine)");
		}
		do {
			if (typeOfTheProduct.equalsIgnoreCase("wine")) {
				String wineTitle = print("title of wine");
				long wineQuantity = Long.valueOf(checkLong(print("quantity of wine")));
				long wineIndex = Long.valueOf(checkLong(print("index of wine")));
				double winePrice = Double.valueOf(checkDouble(print("price of wine")));
				double wineWeight = Double.valueOf(checkDouble(print("weight of wine")));
				double wineVolume = Double.valueOf(checkDouble(print("volume of wine bottle")));
				double wineAbvPercent = Double.valueOf(checkDouble(print("alcohol by volume percentage")));
				String wineColour = print("colour of wine");
				Product pr1 = new Wine(wineTitle, wineQuantity, wineIndex, winePrice, wineWeight, wineVolume,
						wineAbvPercent, wineColour);
				deals[numOfDeal].getProducts()[addThisProduct] = pr1;
				addThisProduct++;
			} else if (typeOfTheProduct.equalsIgnoreCase("bread")) {
				String breadTitle = print("title of bread");
				long breadQuantity = Long.valueOf(checkLong(print("quantity of bread")));
				long breadIndex = Long.valueOf(checkLong(print("index of bread")));
				double breadPrice = Double.valueOf(checkDouble(print("price of bread")));
				double breadWeight = Double.valueOf(checkDouble(print("weight of bread")));
				String breadType = print("type of bread");
				boolean breadIsSliced = Boolean
						.valueOf(checkBoolean(print("\"true\" if it's sliced, \"false\" - if not")));
				Product pr2 = new Bread(breadTitle, breadQuantity, breadIndex, breadPrice, breadWeight, breadType,
						breadIsSliced);
				deals[numOfDeal].getProducts()[addThisProduct] = pr2;
				addThisProduct++;
			} else {
				String beerTitle = print("title of beer");
				long beerQuantity = Long.valueOf(checkLong(print("quantity of beer")));
				long beerIndex = Long.valueOf(checkLong(print("index of beer")));
				double beerPrice = Double.valueOf(checkDouble(print("price of beer")));
				double beerWeight = Double.valueOf(checkDouble(print("weight of beer")));
				double beerVolume = Double.valueOf(checkDouble(print("volume of beer bottle")));
				double beerAbvPercent = Double.valueOf(checkDouble(print("alcohol by volume percentage")));
				Product pr3 = new Beer(beerTitle, beerQuantity, beerIndex, beerPrice, beerWeight, beerVolume,
						beerAbvPercent);
				deals[numOfDeal].getProducts()[addThisProduct] = pr3;
				addThisProduct++;
			}
			nextProduct = print("\"yes\" if you want to add another product, any other symbol - if not");
			if (nextProduct.equalsIgnoreCase("yes")) {
				typeOfTheProduct = print("type of the product (bread, beer or wine)");
				while (!typeOfTheProduct.equalsIgnoreCase("wine") && !typeOfTheProduct.equalsIgnoreCase("bread")
						&& !typeOfTheProduct.equalsIgnoreCase("beer")) {
					System.out.println("That's not right type of the product");
					typeOfTheProduct = print("type of the product (bread, beer or wine)");
				}
			}
		} while (nextProduct.equalsIgnoreCase("yes"));
	}

	public static void deleteProductByTitle(int numOfDeal) {
		Product[] prodArr = new Product[100];
		String titleOfTheProduct = print("product title");
		boolean isItValidProduct = false;
		while (isItValidProduct == false) {
			for (Product x : deals[numOfDeal].getProducts()) {
				try {
					x.getTitle().equals(null);
				} catch (java.lang.NullPointerException e) {
					break;
				}
				if (titleOfTheProduct.equalsIgnoreCase(x.getTitle())) {
					isItValidProduct = true;
					break;
				}
			}
			if (isItValidProduct == false) {
				System.out.println("That's not right title!");
				titleOfTheProduct = print("product title");
			} else {
				break;
			}
		}
		for (int i = 0; i < deals[numOfDeal].getProducts().length; i++) {
			try {
				deals[numOfDeal].getProducts()[i].getTitle().equals(null);
			} catch (java.lang.NullPointerException e) {
				continue;
			}
			if (deals[numOfDeal].getProducts()[i].getTitle().equalsIgnoreCase(titleOfTheProduct)) {
				deals[numOfDeal].getProducts()[i] = null;
			}
		}
		for (int i = 0, k = 0; i < deals[numOfDeal].getProducts().length; i++) {
			try {
				deals[numOfDeal].getProducts()[i].equals(null);
			} catch (java.lang.NullPointerException e) {
				continue;
			}
			prodArr[k++] = deals[numOfDeal].getProducts()[i];
		}
		System.arraycopy(prodArr, 0, deals[numOfDeal].getProducts(), 0, 100);
	}

	public static Deal enter() throws ParseException {
		CheckDate check = new CheckDate();
		String buyerName = print("buyer name");
		String buyerCountry = print("buyer country");
		String buyerDateOfBirth = print("buyer's date of birth in this \"dd/MM/yyyy\" or this \"dd-MM-yyyy\" way");
		String[] arr = check.CheckDater(buyerDateOfBirth);
		SimpleDateFormat simple = new SimpleDateFormat(arr[0]);
		Date buyerDateOfBirth1 = simple.parse(arr[1]);
		String buyerPhone = print("buyer's phone in this format \"+375XXXXXXXXX\"");
		BelarusPhoneValidator phoneVal = new BelarusPhoneValidator();
		while (!phoneVal.validate(buyerPhone)) {
			System.out.println("Wrong format of phone number!");
			buyerPhone = print("buyer's phone in this format \"+375XXXXXXXXX\"");
		}
		String buyerEmail = print("buyer's email");
		EmailValidator emailVal = new EmailValidator();
		while (!emailVal.validate(buyerEmail)) {
			System.out.println("Wrong format of email!");
			buyerEmail = print("buyer's email");
		}
		String sellerName = print("seller name");
		String sellerCountry = print("seller country");
		String sellerDateOfBirth = print("seller's date of birth in this \"dd/MM/yyyy\" or this \"dd-MM-yyyy\" way");
		String[] arr1 = check.CheckDater(sellerDateOfBirth);
		SimpleDateFormat simple1 = new SimpleDateFormat(arr1[0]);
		Date sellerDateOfBirth1 = simple1.parse(arr1[1]);
		String sellerPhone = print("seller's phone in this format \"+375XXXXXXXXX\"");
		while (!phoneVal.validate(sellerPhone)) {
			System.out.println("Wrong format of phone number!");
			sellerPhone = print("seller's phone in this format \"+375XXXXXXXXX\"");
		}
		String sellerEmail = print("seller's email");
		while (!emailVal.validate(sellerEmail)) {
			System.out.println("Wrong format of email!");
			sellerEmail = print("seller's email");
		}
		User buyer = new User(buyerName, buyerCountry, buyerDateOfBirth1, buyerPhone, buyerEmail);
		User seller = new User(sellerName, sellerCountry, sellerDateOfBirth1, sellerPhone, sellerEmail);
		Product[] prodArr = new Product[100];
		String nextProduct;
		int amountOfProducts = 0;
		String typeOfTheProduct = print("type of the product (bread, beer or wine)");
		while (!typeOfTheProduct.equalsIgnoreCase("wine") && !typeOfTheProduct.equalsIgnoreCase("bread")
				&& !typeOfTheProduct.equalsIgnoreCase("beer")) {
			System.out.println("That's not right type of the product");
			typeOfTheProduct = print("type of the product (bread, beer or wine)");
		}
		do {
			if (typeOfTheProduct.equalsIgnoreCase("wine")) {
				String wineTitle = print("title of wine");
				long wineQuantity = Long.valueOf(checkLong(print("quantity of wine")));
				long wineIndex = Long.valueOf(checkLong(print("index of wine")));
				double winePrice = Double.valueOf(checkDouble(print("price of wine")));
				double wineWeight = Double.valueOf(checkDouble(print("weight of wine")));
				double wineVolume = Double.valueOf(checkDouble(print("volume of wine bottle")));
				double wineAbvPercent = Double.valueOf(checkDouble(print("alcohol by volume percentage")));
				String wineColour = print("colour of wine");
				Product pr1 = new Wine(wineTitle, wineQuantity, wineIndex, winePrice, wineWeight, wineVolume,
						wineAbvPercent, wineColour);
				prodArr[amountOfProducts] = pr1;
				amountOfProducts++;
			} else if (typeOfTheProduct.equalsIgnoreCase("bread")) {
				String breadTitle = print("title of bread");
				long breadQuantity = Long.valueOf(checkLong(print("quantity of bread")));
				long breadIndex = Long.valueOf(checkLong(print("index of bread")));
				double breadPrice = Double.valueOf(checkDouble(print("price of bread")));
				double breadWeight = Double.valueOf(checkDouble(print("weight of bread")));
				String breadType = print("type of bread");
				boolean breadIsSliced = Boolean
						.valueOf(checkBoolean(print("\"true\" if it's sliced, \"false\" - if not")));
				Product pr2 = new Bread(breadTitle, breadQuantity, breadIndex, breadPrice, breadWeight, breadType,
						breadIsSliced);
				prodArr[amountOfProducts] = pr2;
				amountOfProducts++;
			} else {
				String beerTitle = print("title of beer");
				long beerQuantity = Long.valueOf(checkLong(print("quantity of beer")));
				long beerIndex = Long.valueOf(checkLong(print("index of beer")));
				double beerPrice = Double.valueOf(checkDouble(print("price of beer")));
				double beerWeight = Double.valueOf(checkDouble(print("weight of beer")));
				double beerVolume = Double.valueOf(checkDouble(print("volume of beer bottle")));
				double beerAbvPercent = Double.valueOf(checkDouble(print("alcohol by volume percentage")));
				Product pr3 = new Beer(beerTitle, beerQuantity, beerIndex, beerPrice, beerWeight, beerVolume,
						beerAbvPercent);
				prodArr[amountOfProducts] = pr3;
				amountOfProducts++;
			}
			nextProduct = print("\"yes\" if you want to add another product, any other symbol - if not");
			if (nextProduct.equalsIgnoreCase("yes")) {
				typeOfTheProduct = print("type of the product (bread, beer or wine)");
				while (!typeOfTheProduct.equalsIgnoreCase("wine") && !typeOfTheProduct.equalsIgnoreCase("bread")
						&& !typeOfTheProduct.equalsIgnoreCase("beer")) {
					System.out.println("That's not right type of the product");
					typeOfTheProduct = print("type of the product (bread, beer or wine)");
				}
			}
		} while (nextProduct.equalsIgnoreCase("yes"));
		String date = print("deal date in this \"dd/MM/yyyy\" or this \"dd-MM-yyyy\" way");
		String[] arr2 = check.CheckDater(date);
		SimpleDateFormat simple2 = new SimpleDateFormat(arr2[0]);
		Date date1 = simple2.parse(arr2[1]);
		Deal deal = new Deal(date1, prodArr, seller, buyer);
		return deal;
	}

	public static void display(int numOfDeal) {
		System.out.printf("Deal date:%nDay:    <%td>%nMonth:  <%tm>%nYear:   <%tY>%n%n", deals[numOfDeal].getDate(),
				deals[numOfDeal].getDate(), deals[numOfDeal].getDate());
		System.out.println("        Buyer name: " + deals[numOfDeal].getBuyer().getName());
		System.out.println("        Buyer country: " + deals[numOfDeal].getBuyer().getCountry());
		System.out.printf("        Buyer date of birth: %td-%tm-%tY%n", deals[numOfDeal].getBuyer().getDateOfBirth(),
				deals[numOfDeal].getBuyer().getDateOfBirth(), deals[numOfDeal].getBuyer().getDateOfBirth());
		System.out.println("        Buyer phone: " + deals[numOfDeal].getBuyer().getPhone());
		System.out.println("        Buyer email: " + deals[numOfDeal].getBuyer().getEmail());
		System.out.println("        Seller name: " + deals[numOfDeal].getSeller().getName());
		System.out.println("        Seller country: " + deals[numOfDeal].getSeller().getCountry());
		System.out.printf("        Seller date of birth: %td-%tm-%tY%n", deals[numOfDeal].getSeller().getDateOfBirth(),
				deals[numOfDeal].getSeller().getDateOfBirth(), deals[numOfDeal].getSeller().getDateOfBirth());
		System.out.println("        Seller phone: " + deals[numOfDeal].getSeller().getPhone());
		System.out.println("        Seller email: " + deals[numOfDeal].getSeller().getEmail() + '\n');
		System.out.println("                   Product title:      Quantity:      Price:      Discount:          Sum:");
		System.out.println("               -------------------------------------------------------------------------");
		for (int i = 0; i < deals[numOfDeal].getProducts().length; i++) {
			try {
				deals[numOfDeal].getProducts()[i].equals(null);
			} catch (java.lang.NullPointerException e) {
				break;
			}
			System.out.printf(
					"               №" + (i + 1) + "%1$15s    %2$11d    %3$8.2f    %4$10.2f%%    %5$10.2f $%n",
					"\"" + deals[numOfDeal].getProducts()[i].getTitle() + "\"",
					deals[numOfDeal].getProducts()[i].getQuantity(), deals[numOfDeal].getProducts()[i].getPrice(),
					deals[numOfDeal].getProducts()[i].getDiscount() * 100,
					deals[numOfDeal].getProducts()[i].countPrice());
		}
		System.out.println("               -------------------------------------------------------------------------");
		System.out.printf("%n               Full price:%1$10.2f $%n%n", deals[numOfDeal].countFullPrice());
	}

	public static void main(String[] args) throws ParseException {
		Deal deal = new Deal();
		System.out.println("deadline date:   " + deal.getDeadlineDate().plusDays(10));
		int amountOfDeals = 0;
		int input = 0;
		do {
			if (amountOfDeals == 0) {
				System.out.println('\n' + "Enter:" + '\n' + "\"1\" - if you want to input information about deal" + '\n'
						+ "\"5\" - if you want to exit");
				input = Integer.parseInt(checkLong(sc.nextLine()));
				if (input == 1) {
					deals[amountOfDeals] = enter();
					amountOfDeals++;
				} else if (input != 1 && input != 5) {
					System.out.println('\n' + "Wrong number!");
				}
			} else {
				System.out.println('\n' + "Enter:" + '\n' + "\"1\" - if you want to input information about the deal"
						+ '\n' + "\"2\" - if you want to display information about the deal" + '\n'
						+ "\"3\" - if you want to add product to the deal" + '\n'
						+ "\"4\" - if you want to delete product from the deal" + '\n' + "\"5\" - if you want to exit");
				input = Integer.parseInt(checkLong(sc.nextLine()));
				if (input == 1) {
					deals[amountOfDeals] = enter();
					amountOfDeals++;
				} else if (input == 2) {
					System.out.println('\n' + "Enter number of the deal");
					int numOfDeal = Integer.parseInt(checkLong(sc.nextLine())) - 1;
					if (numOfDeal >= deals.length || numOfDeal < 0) {
						System.out.println("There's no such deal");
						continue;
					}
					try {
						deals[numOfDeal].equals(null);
					} catch (java.lang.NullPointerException e) {
						System.out.println("There's no such deal");
						continue;
					}
					display(numOfDeal);
				} else if (input == 3) {
					System.out.println('\n' + "Enter number of the deal");
					int numOfDeal = Integer.parseInt(checkLong(sc.nextLine())) - 1;
					if (numOfDeal >= deals.length || numOfDeal < 0) {
						System.out.println("There's no such deal");
						continue;
					}
					try {
						deals[numOfDeal].equals(null);
					} catch (java.lang.NullPointerException e) {
						System.out.println("There's no such deal");
						continue;
					}
					addAnotherProduct(numOfDeal);
					System.out.println("Operation completed successfully!");
				} else if (input == 4) {
					System.out.println('\n' + "Enter number of the deal");
					int numOfDeal = Integer.parseInt(checkLong(sc.nextLine())) - 1;
					if (numOfDeal >= deals.length || numOfDeal < 0) {
						System.out.println("There's no such deal");
						continue;
					}
					try {
						deals[numOfDeal].equals(null);
					} catch (java.lang.NullPointerException e) {
						System.out.println("There's no such deal");
						continue;
					}
					deleteProductByTitle(numOfDeal);
					System.out.println("Operation completed successfully!");
				} else if (input != 1 && input != 2 && input != 3 && input != 4 && input != 5) {
					System.out.println('\n' + "That's not correct number!" + '\n');
				}
			}
		} while (input != 5);
		System.out.println("Goodbye");
		sc.close();
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
