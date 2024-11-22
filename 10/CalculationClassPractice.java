package chap09.sec01;

import java.util.Scanner;

public class CalculationClassPractice {
	public void Cal4() {
		Scanner scanner = new Scanner(System.in);
		int result = 0;
		String symbol = " ";
		String[] symbols = {"+", "-", "*", "/"};
		
		while (true) {
			String temp = scanner.nextLine();
			
			if (temp.equals("q")) {
				System.out.println("exit");
				break;
			} else if (temp.equals(symbols[0]) || temp.equals(symbols[1]) || temp.equals(symbols[2]) || temp.equals(symbols[3])) {
				symbol = temp;
			} else {
				if (symbol.equals(symbols[0])) {
					result += Integer.parseInt(temp);
					System.out.println(result);
				} else if (symbol.equals(symbols[1])) {
					result -= Integer.parseInt(temp);
					System.out.println(result);
				} else if (symbol.equals(symbols[2])) {
					result *= Integer.parseInt(temp);
					System.out.println(result);
				} else if (symbol.equals(symbols[3])) {
					result /= Integer.parseInt(temp);
					System.out.println(result);
				}
			}
		}
	}
}
