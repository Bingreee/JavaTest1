package home.test.day0102;

import java.util.Scanner;

public class ChangeNumber {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("inch값을 입력해주세요. >");
		int inch = a.nextInt();
		double cm = (double) inch * 2.54;
		System.out.printf("%d inch는 %.2f cm입니다", inch, cm);
		a.close();
	}
}