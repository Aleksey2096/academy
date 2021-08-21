package by.academy.homework6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {
	public static void main(String... args) throws IOException, ClassNotFoundException {
		ArrayList<User> userList = new ArrayList<>();
		userList.add(new User("Liam", "Smith", 99));
		userList.add(new User("Noah", "Johnson", 20));
		userList.add(new User("Oliver", "Williams", 34));
		userList.add(new User("Elijah", "Brown", 45));
		userList.add(new User("William", "Jones", 13));
		userList.add(new User("James", "Garcia", 60));
		userList.add(new User("Benjamin", "Miller", 33));
		userList.add(new User("Lucas", "Davis", 5));
		userList.add(new User("Henry", "Rodriguez", 75));
		userList.add(new User("Alexander", "Martinez", 11));
		File usersFile = new File("src/io/users");
		if (!usersFile.exists()) {
			usersFile.mkdirs();
		}
		for (User x : userList) {
			File userFolder = new File(usersFile + "/" + x.getName() + "_" + x.getSurname() + ".txt");
			if (!userFolder.exists()) {
				userFolder.createNewFile();
			}
		}
		for (User x : userList) {
			try (ObjectOutputStream oOS = new ObjectOutputStream(
					new FileOutputStream(usersFile + "/" + x.getName() + "_" + x.getSurname() + ".txt"))) {
				oOS.writeObject(x);
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}
		for (User x : userList) {
			try (ObjectInputStream oIS = new ObjectInputStream(
					new FileInputStream(usersFile + "/" + x.getName() + "_" + x.getSurname() + ".txt"))) {
				x = (User) oIS.readObject();
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}
	}
}
