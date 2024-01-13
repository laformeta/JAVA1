package lesson06_array;

import java.util.Random;
import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 1. 두 개의 index를 입력 받아서, 해당하는 index의 값을 서로 교체 해서 배열을 출력하세요.
		
//		int[] numbers = {3, 5, 2, 10, 39};
		
//		System.out.print("두 개의 index를 입력하세요 : ");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int temp = 0;
//		temp = numbers[num1];
//		numbers[num1] = numbers[num2];
//		numbers[num2] = temp;
//		
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i] + " ");
//		}
		
		// 2. 1 ~ 10 까지 차례로 저장된 배열을 만들고, 순서를 뒤섞어서 그 결과를 출력하세요.
		
		int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Random rand = new Random();
		
		for (int i = 0; i < 50; i++) {
			int randomIndex = rand.nextInt(10);
			int temp = 0;
			temp = numbers[0];
			numbers[0] = numbers[randomIndex];
			numbers[randomIndex] = temp;
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
		// 3. 1 ~ 5 범위 안에 숫자가 배열에 중복되어 저장되어있다.
//		1 ~ 5 까지의 숫자가 각각 몇 개씩 저장되어 있는지 출력하세요.
		int[] numbers3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};
		// 3. 빈도수 구하기
				int[] freq = new int[6]; // 0:이 인덱스는 버린다.  1 2 3 4 5 => 각각의 빈도수를 저장
				
				for (int i = 0; i < numbers3.length; i++) {
					freq[numbers3[i]] += 1;
				}
				
				for (int i = 1; i < freq.length; i++) {
					System.out.println(i + ":" + freq[i] + "개");
				}
		
	}

}
