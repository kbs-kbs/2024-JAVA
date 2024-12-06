package ch11.sec02.exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile2 {

	public static void ReadFileContents() throws IOException {
		try (
			FileInputStream fis_1 = new FileInputStream("file.txt");
			FileInputStream fis_2 = new FileInputStream("file.txt")
		) {

		} catch (IOException e) {
			System.out.println(e.toString());
		} 
	}
	
	public static void main(String[] args) throws IOException {
		ReadFileContents();
	}
}
