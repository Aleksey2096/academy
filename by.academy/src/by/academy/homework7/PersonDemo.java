package by.academy.homework7;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;

public class PersonDemo {
	public static void main(String... args) {
		User user = new User();
		Person person = new Person();
		user.printUserInfo();
		System.out.println();
		Class<? extends Person> userClass = user.getClass();
		try {
			Field logIn = userClass.getDeclaredField("logIn");
			logIn.setAccessible(true);
			logIn.set(user, "1111");
			System.out.println(logIn.get(user));
			Field password = userClass.getDeclaredField("password");
			password.setAccessible(true);
			password.set(user, "qwerty");
			System.out.println(password.get(user));
			Field email = userClass.getDeclaredField("email");
			email.setAccessible(true);
			email.set(user, "1111@gmail.com");
			System.out.println(email.get(user));
			Class<?> personClass = Class.forName("by.academy.homework7.Person");
			Field firstName = personClass.getDeclaredField("firstName");
			firstName.setAccessible(true);
			firstName.set(person, "Ivan");
			System.out.println(firstName.get(person));
			Field lastName = personClass.getDeclaredField("lastName");
			lastName.setAccessible(true);
			lastName.set(person, "Ivanov");
			System.out.println(lastName.get(person));
			Field age = personClass.getDeclaredField("age");
			age.setAccessible(true);
			age.setInt(person, 40);
			System.out.println(age.get(person));
			Field dateOfBirth = personClass.getDeclaredField("dateOfBirth");
			dateOfBirth.setAccessible(true);
			dateOfBirth.set(person, LocalDate.of(1981, 04, 20));
			System.out.println(dateOfBirth.get(person));
			Method toString = personClass.getMethod("toString");
			Object toStringValue = toString.invoke(person);
			System.out.println(toStringValue);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
