package home.test.day0102;

import java.util.Scanner;

public class CalculatorEx {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요 >");
		int first = s.nextInt();
		System.out.print("두번째 정수를 입력하세요 >");
		int second = s.nextInt();
		int result = first + second;
		System.out.printf("%d + %d = %d \n", first, second, result);
		result = first * second;
		System.out.printf("%d * %d = %d", first, second, result);
		s.close();
	}
}