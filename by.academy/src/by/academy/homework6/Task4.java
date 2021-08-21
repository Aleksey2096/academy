package by.academy.homework6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task4 {
	private static int length;

	public static void main(String... args) throws IOException {
		File dir = new File("src/io/Directory");
		if (!dir.exists()) {
			dir.mkdirs();
		}
		File file;
		for (int i = 0; i < 100; i++) {
			file = new File("src/io/Directory/" + (i + 1) + ".txt");
			if (!file.exists()) {
				file.createNewFile();
			}
		}
		try (BufferedReader bR = new BufferedReader(new FileReader(Task2.ALREADY_EXISTED_FILE));
				BufferedWriter bW = new BufferedWriter(new FileWriter("src/io/Directory/result.txt", true))) {
			String res;
			StringBuilder sB = new StringBuilder();
			while ((res = bR.readLine()) != null) {
				length += res.length();
				sB.append(res);
			}
			for (int i = 0; i < 100; i++) {
				file = new File("src/io/Directory/" + (i + 1) + ".txt");
				try (BufferedWriter bW1 = new BufferedWriter(new FileWriter(file))) {
					bW1.write(sB.substring(0, (int) (Math.random() * length)));
				}
				bW.write("File name: " + file.getName() + "  file size: " + file.length());
				bW.newLine();
			}
		}
	}
}
