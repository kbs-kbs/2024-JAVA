package pack1;

import java.util.Scanner;

public class ScanNumber {
	public void scanNumber(int start, int stop, int num) { // 객체를 생성하지 않고도 사용할 수 있도록 static으로 설정
		Scanner scanner = new Scanner(System.in); // 스캐너 객체 생성
		int[] numberCounts = new int[stop - start]; // (0, 10, num)일 때, 0~9 각각의 숫자가 몇 번씩 발생하였는지 저장할 배열 생성
		
		System.out.println(start + "부터 " + (stop - 1) + "까지의 숫자를 입력하세요 (중지하려면 q를 입력하세요):"); // 안내문 출력
		
		int count = 0; // while 문에서 사용할 변수
		while (count < num) { // (count < 20): 0부터 19까지 반복하지만 잘못된 입력일 경우 무효
			String sInputVal = scanner.nextLine(); // 입력을 변수 sInputVal에 저장
			try { // sInputVal이 숫자로 변환 가능한 경우
				int iInputVal = Integer.parseInt(sInputVal); // 문자열 sInputVal을 정수형 iInputVal로 변환
				
				if (iInputVal >= 0 && iInputVal < 10) { // 변환한 값이 0~9인 경우
			    	numberCounts[iInputVal - start]++; // 해당 값의 발생 횟수를 증가
			    	count++; // while 문의 count 증가
			    } else { // 변환한 값이 0~9가 아닌 경우 무효
			        System.out.println(start + "부터 " + (stop - 1) + "까지의 숫자만 입력하세요 (중지하려면 q를 입력하세요):");
			        // 무효이기 때문에 count++ 하지 않고 주의문 출력
			    }
				
			} catch (Exception e) { // sInputVal이 숫자가 될 수 없는 경우
				if (sInputVal.equals("q")) { // 입력이 q인 경우
					break; // while 문을 종료합니다
				}
				System.out.println("숫자만 입력하세요 (중지하려면 q를 입력하세요):");
				// 문자열인 경우 무효이기 때문에 count++ 하지 않고 주의문 출력
			}
		}

		// while 문이 종료되면 결과 출력
		System.out.println("각 숫자의 발생 횟수:");
		for (int i = 0; i < 10; i++) {
			System.out.println(i + ": " + numberCounts[i + start] + "번");
		}
		
		// 각 숫자의 발생 횟수:
		// 0: 1번
		// 1: 3번
		// 2: 2번
		// ...
		// 9: 0번

		scanner.close(); // 스캐너 종료
	}
}
