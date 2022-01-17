package home.operation.day0104;

public class OperatorPractice5 {

	public static void main(String[] args) {
		int a = 10; //이진수 : 1010
		int b = 7;  //이진수 : 0111 -->계산기로 확인!
		
		System.out.println(a & b); //0010 -->2
		System.out.println(a | b); //1111 -->15
		System.out.println(a ^ b); //1101 -->13
		System.out.println(~a);

	}

}
