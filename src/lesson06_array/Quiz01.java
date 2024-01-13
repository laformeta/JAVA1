package lesson06_array;

public class Quiz01 {

	public static void main(String[] args) {

		int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};
		
		// 1. 배열의 4번째 값을 6으로 바꾸세요.
		
		System.out.println(numbers[3]);
		numbers[3] = 6;
		System.out.println(numbers[3]);
		
		// 2. 배열의 값을 순서대로 출력하세요.
		
		for (int i = 0 ; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		
		// 3. 배열의 값의 반대 순서(역순)로 출력하세요.
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		
		// 4. 배열의 짝수번째 위치에 있는 값들을 출력하세요.
		for (int i = 0 ; i < numbers.length; i++) {
			if (i % 2 != 0) {
				System.out.print(numbers[i] + " ");
			}
		}
		System.out.println();
		
		// 5. 배열의 값 중 2가 들어 있는 index를 출력하세요.
		//	반복문을 돌면서 2가 있는 값을 찾으세요.
		for (int i = 0 ; i < numbers.length; i++) {
			if (numbers[i] == 2) {
				System.out.println("2가 들어있는 배열의 index값은 : " + i);
			}
		}
		
		System.out.println();
		
		// 6. 배열의 값 중 가장 큰 값을 출력하세요.
		int max = 0;
		for (int i = 0 ; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}
		System.out.println("가장 큰 값은 : " + max);
		System.out.println();
		
		// 7. 배열의 값 중 가장 작은 수가 저장된 index를 출력하세요.
		int min = numbers[0];
		int minIndex = 0;
		for (int i = 0 ; i < numbers.length; i++) {
			if (min > numbers[i]) {
				min = numbers[i];
				minIndex = i;
			}
		}
		System.out.println("가장 작은 값은 : " + min + " 최소값의 인덱스는 : " + minIndex);
		System.out.println();
		
		// 8.배열의 모든 수의 평균을 출력하세요
		int sum = 0;
		for (int i = 0 ; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("평균은 " + (double)sum / numbers.length);
		
	}

}
