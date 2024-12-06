package ch11.sec02.exam01;

import java.util.Scanner;

public class ExceptionPractice {

	public static void main(String[] args) throws CustomExceptionPractice {
		CustomMessagePractice cmp = new CustomMessagePractice();
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("num: ");
			// cmp.check(scanner.nextInt());
			cmp.check(Integer.parseInt(scanner.nextLine()));
		} catch (NumberFormatException e) {
			System.out.println("ผýภฺ พฦดิ!!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
