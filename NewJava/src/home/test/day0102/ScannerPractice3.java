package home.test.day0102;

import java.util.Scanner;

public class ScannerPractice3 {

	public static void main(String[] args) {

		//Scanner 불러오기
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요. >");
		String name = input1.nextLine();
		
		System.out.println("나이를 입력하세요. >");
		int age = input1.nextInt();
		
		//최종출력
		System.out.println("귀하의 신상정보");
		System.out.printf("이름 : %s님 \n나이 : %d세\n", name, age);
		System.out.println("환영합니다!");
		input1.close();
	}

}
