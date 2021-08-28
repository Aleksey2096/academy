package by.academy.homework6;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
	public static final String ALREADY_EXISTED_FILE = "src/io/AlreadyExistedFile.txt";
	public static final String RESULT = "src/io/Result.txt";

	public static void main(String... args) throws IOException {
		File dir = new File("src/io");
		if (!dir.exists()) {
			dir.mkdirs();
		}
		File result = new File(RESULT);
		if (!result.exists()) {
			result.createNewFile();
		}
		try (FileReader fR = new FileReader(ALREADY_EXISTED_FILE); FileWriter fW = new FileWriter(RESULT);) {
			int res;
			while ((res = fR.read()) != -1) {
				if (res != ' ') {
					fW.write(res);
				}
			}
		}
	}
}
