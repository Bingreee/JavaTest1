package home.test.day0102;

import java.util.Scanner;

public class ScannerPractice2 {

	public static void main(String[] args) {
 /*1) Scanner 클래스를 이용하여 원화를 이용받아 달러로 바꾸어 
  다음 예시와 같이 출력하는 프로그램을 작성해보자.
  $1 = 1100으로 가정하고 계산해보자.
  환전하고 싶은 원화를 입력하시오 : 5500
  5500원 환전 액수 = $5.5*/
		
		Scanner input = new Scanner(System.in);
		System.out.print("원화를 입력하세요. >");
		int a = input.nextInt();
		double b = (double) a / 1100;
		System.out.printf("%d원의 환전 액수는 $%.1f입니다", a,b);
		input.close();
		
	}

}
