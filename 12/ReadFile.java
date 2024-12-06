package ch11.sec02.exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {

	public static void ReadFileContents() throws IOException {
		// FileInputStream fis = null;
		try (FileInputStream fis = new FileInputStream("file.txt")) {
		//	fis = new FileInputStream("file.txt");
		} catch (IOException e) {
			System.out.println(e.toString());
		} 
		// finally {
		//	fis.close();
		//}
	}
	
	public static void main(String[] args) throws IOException {
		ReadFileContents();
	}

}
