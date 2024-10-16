package ch06.sec01;

public class ArrayRandomPractice {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int count = 0;

        while (count < 10) {
            int rand = (int) (Math.random() * 10 + 1); // 1~10 사이의 랜덤 값
            boolean isDuplicate = false;

            // 배열에 중복된 값이 있는지 확인
            for (int i = 0; i < count; i++) {
                if (arr[i] == rand) {
                    isDuplicate = true;
                    break;
                }
            }

            // 중복되지 않으면 배열에 추가
            if (!isDuplicate) {
                arr[count] = rand;
                count++;
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
        	System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
        	System.out.print(arr[i] + " ");
        }
    }
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 두 값을 교환
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
