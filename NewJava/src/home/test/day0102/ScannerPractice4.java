package home.test.day0102;

import java.util.Scanner;

public class ScannerPractice4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("국어점수를 입력하세요. >");
		double korean = input.nextDouble();
		System.out.println("영어점수를 입력하세요. >");
		double english = input.nextDouble();
		System.out.println("수학 점수를 입력하세요. >");
		double math = input.nextDouble();
		
		double avg = (korean + english +math)/3;
		System.out.printf("중간고사 평균은 %.1f입니다.", avg);
		input.close();
		
	}

}
