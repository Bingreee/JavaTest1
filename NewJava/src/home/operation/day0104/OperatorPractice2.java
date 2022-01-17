package home.operation.day0104;

public class OperatorPractice2 {

	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 5; //오른쪽 값을 왼쪽 변수에 저장한다
		
		System.out.println(num1 + num2);
		System.out.println(num1);
		
		System.out.println(num1 += num2);
		System.out.println(num1);
		//num1과 num2의 값을 꺼내와서 연산한 후 다시 왼쪽 변수에 대입! 그래서 num1값이 12로 나옴.

	}

}
