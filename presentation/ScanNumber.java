package pack1;

import java.util.Scanner;

public class ScanNumber {
	public void scanNumber(int num) { // ��ü�� �������� �ʰ� ����� �� �ֵ��� static���� ����
		Scanner scanner = new Scanner(System.in); // ��ĳ�� ��ü ����
		int[] numberCounts = new int[10]; // 0~9 ������ ���ڰ� �� ���� �߻��Ͽ����� ������ �迭 ����
		
		System.out.println("0���� 9������ ���ڸ� �Է��ϼ��� (�����Ϸ��� q�� �Է��ϼ���):"); // �ȳ��� ���
		
		int count = 0; // while ������ ����� ����
		while (count < num) { // (count < 20): 0���� 19���� �ݺ������� �߸��� �Է��� ��� ��ȿ
			String sInputVal = scanner.nextLine(); // �Է��� ���� sInputVal�� ����
			try { // sInputVal�� ���ڷ� ��ȯ ������ ���
				int iInputVal = Integer.parseInt(sInputVal); // ���ڿ� sInputVal�� ������ iInputVal�� ��ȯ
				
				if (iInputVal >= 0 && iInputVal < 10) { // ��ȯ�� ���� 0~9�� ���
			    	numberCounts[iInputVal]++; // �ش� ���� �߻� Ƚ���� ����
			    	count++; // while ���� count ����
			    } else { // ��ȯ�� ���� 0~9�� �ƴ� ��� ��ȿ
			        System.out.println("0���� 9������ ���ڸ� �Է��ϼ��� (�����Ϸ��� q�� �Է��ϼ���):");
			        // ��ȿ�̱� ������ count++ ���� �ʰ� ���ǹ� ���
			    }
				
			} catch (Exception e) { // sInputVal�� ���ڰ� �� �� ���� ���
				if (sInputVal.equals("q")) { // �Է��� q�� ���
					break; // while ���� �����մϴ�
				}
				System.out.println("0���� 9������ ���ڸ� �Է��ϼ��� (�����Ϸ��� q�� �Է��ϼ���):");
				// ���ڿ��� ��� ��ȿ�̱� ������ count++ ���� �ʰ� ���ǹ� ���
			}
		}

		// while ���� ����Ǹ� ��� ���
		System.out.println("�� ������ �߻� Ƚ��:");
		for (int i = 0; i < 10; i++) {
			System.out.println(i + ": " + numberCounts[i] + "��");
		}
		
		// �� ������ �߻� Ƚ��:
		// 0: 1��
		// 1: 3��
		// 2: 2��
		// ...
		// 9: 0��

		scanner.close(); // ��ĳ�� ����
	}
	
	public void scanNumber(int start, int stop, int num) { // ��ü�� �������� �ʰ� ����� �� �ֵ��� static���� ����
		Scanner scanner = new Scanner(System.in); // ��ĳ�� ��ü ����
		int[] numberCounts = new int[stop - start]; // 0~9 ������ ���ڰ� �� ���� �߻��Ͽ����� ������ �迭 ����
		
		System.out.println(start + "���� " + (stop - 1) + "������ ���ڸ� �Է��ϼ��� (�����Ϸ��� q�� �Է��ϼ���):"); // �ȳ��� ���
		
		int count = 0; // while ������ ����� ����
		while (count < num) { // (count < 20): 0���� 19���� �ݺ������� �߸��� �Է��� ��� ��ȿ
			String sInputVal = scanner.nextLine(); // �Է��� ���� sInputVal�� ����
			try { // sInputVal�� ���ڷ� ��ȯ ������ ���
				int iInputVal = Integer.parseInt(sInputVal); // ���ڿ� sInputVal�� ������ iInputVal�� ��ȯ
				
				if (iInputVal >= 0 && iInputVal < 10) { // ��ȯ�� ���� 0~9�� ���
			    	numberCounts[iInputVal - start]++; // �ش� ���� �߻� Ƚ���� ����
			    	count++; // while ���� count ����
			    } else { // ��ȯ�� ���� 0~9�� �ƴ� ��� ��ȿ
			        System.out.println(start + "���� " + (stop - 1) + "������ ���ڸ� �Է��ϼ��� (�����Ϸ��� q�� �Է��ϼ���):");
			        // ��ȿ�̱� ������ count++ ���� �ʰ� ���ǹ� ���
			    }
				
			} catch (Exception e) { // sInputVal�� ���ڰ� �� �� ���� ���
				if (sInputVal.equals("q")) { // �Է��� q�� ���
					break; // while ���� �����մϴ�
				}
				System.out.println("���ڸ� �Է��ϼ��� (�����Ϸ��� q�� �Է��ϼ���):");
				// ���ڿ��� ��� ��ȿ�̱� ������ count++ ���� �ʰ� ���ǹ� ���
			}
		}

		// while ���� ����Ǹ� ��� ���
		System.out.println("�� ������ �߻� Ƚ��:");
		for (int i = 0; i < 10; i++) {
			System.out.println(i + ": " + numberCounts[i + start] + "��");
		}
		
		// �� ������ �߻� Ƚ��:
		// 0: 1��
		// 1: 3��
		// 2: 2��
		// ...
		// 9: 0��

		scanner.close(); // ��ĳ�� ����
	}
}
