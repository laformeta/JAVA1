package lesson05_function;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		
		// 1. 정수를 입력 받아서 2제곱의 결과를 돌려주는 함수를 만들고 호출한 값을 출력하세요
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("제곱을 구할 수를 입력하세요 : ");
//		int num = scan.nextInt();
//		System.out.println(num + "의 제곱은 " + getSquare(num) + "입니다.");
		
		// 2. 4개의 값을 받아서 평균을 돌려주는 함수를 만들고 호출한 값을 출력하세요
//		System.out.print("수 4개를 입력하세요 :");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		int num3 = scan.nextInt();
//		int num4 = scan.nextInt();
//		
//		System.out.println("평균은 " + getAverage(num1, num2, num3, num4) + "입니다.85");
		
		// 3. 두 수를 받아서 몫과 나머지를 출력하는 함수를 만드세요. (리턴값 없음)
//		System.out.print("수 2개를 입력하세요 :");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		
//		printCal(num1, num2);
		
		// 4.정수를 입력 받아서 짝수면 true 홀수면 false를 돌려 주는 함수를 만드세요.
		System.out.print("정수를 입력하세요: ");
		int num = scan.nextInt();
		System.out.println(isEven(num));
	}
	
	public static int getSquare(int x) {
		return x * x;
	}

	public static double getAverage(int a, int b, int c, int d) {
		return (a + b + c + d) / (double)4;
	}
	
	public static void printCal(int a, int b) {
		System.out.println("목 : " + a / b);
		System.out.println("나머지 : " + a % b);
	}
	public static boolean isEven(int a) {
		return a % 2 == 0 ? true : false;
	}
}
