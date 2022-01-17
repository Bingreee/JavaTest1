package home.test.day0102;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("나이를 입력하세요. >");
		int a = input.nextInt();
		int b = a + 10;
		System.out.printf("10년 후 나이는 %d살 입니다", b);
		input.close();
	}

}
