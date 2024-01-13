package lesson01;

public class Quiz03 {

	public static void main(String[] args) {

		// 1. 평균 구하기
//		아래와 같이 점수가 주어졌을 때 평균을 구해서 출력하세요.
//		평균은 소수 둘째자리 까지만 출력하세요.
//		국어 : 93 수학 : 88 영어 : 94
//		출력 예시
//
//		국어 93점, 수학 88점, 영어 94점
//		평균: 91.67
		
		int koreanScore = 93;
		int mathScore = 88;
		int englishScore = 94;
		double average = (koreanScore + mathScore + englishScore) / (double)3;
		average = Math.round(average * 100) / 100.0;
		System.out.println("평균 : " + average);
		System.out.println();
		
		// 2. 아래 공식을 이용해서 섭씨 30도의 화씨 온도를 출력하세요.
//		화씨 온도 = 9 / 5 * 섭씨온도 + 32
		double celsius = 30;
		double fahrenheit = (9 / (double)5	 * celsius) + 32;
		System.out.println("섭씨 30도는 화씨 " + fahrenheit + "이다.");

	}

}
