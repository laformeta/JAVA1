package lesson05_function;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		// 1. 수를 입력 받아서 1에서 부터 그 수 까지의 합을 구하는 함수를 만드세요.
//		단, 합이 100이 넘으면 합을 중단하고 그 때 까지의 합을 리턴하세요.
		
		Scanner sc = new Scanner(System.in);
		
		
//		System.out.print("수 입력 : ");
//		int num = sc.nextInt();
//		System.out.println(getSum(num));
		
		// 2. 5개의 수를 입력 받아서 최소값을 출력하는 함수를 만드세요.(리턴값 없음)
//		입력 가능한 최대값은 1000 입니다.
		
		System.out.print("5개의 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();
		
		printMin(num1, num2, num3, num4, num5);
	}
	
	public static int getSum(int a) {
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			sum += i;
			if (sum >= 100) {
				break;
			}
		}
		return sum;
	}

	public static void printMin(int a, int b, int c, int d, int e) {
		int min = a;
		for (int i = 0; i < 5 ; i++) {
			if (min > b) {
				min = b;
			}
			if (min > c) {
				min = c;
			}
			if (min > d) {
				min = d;
			}
			if (min > e) {
				min = e;
			}
		}
		System.out.println("최소값은 : " + min);
	}
}
