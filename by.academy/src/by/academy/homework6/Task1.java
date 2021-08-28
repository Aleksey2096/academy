package by.academy.homework6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
	public final static String RESULT_FILE = "src/io/Result_File.txt";

	public static void main(String... args) throws IOException {
		File dir = new File("src/io/");
		if (!dir.exists()) {
			dir.mkdirs();
		}
		File result = new File(RESULT_FILE);
		if (!result.exists()) {
			result.createNewFile();
		}
		try (BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bW = new BufferedWriter(new FileWriter(result));) {
			String s;
			for (;;) {
				s = bR.readLine();
				if (s.equals("stop")) {
					break;
				}
				bW.write(s);
				bW.newLine();
			}
		}
	}
}
