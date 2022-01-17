package home.variable.day0104;

public class ConversionTest {

	public static void main(String[] args) {

		int num1 = 2100000000;
		int num2 = 2100000000;
		
		/*int result = num1 + num2;
		  -->오버플로우된 만큼 음수값이 나옴
		*/
		long result = (long) num1 + num2;
		//값 처리는 같은 종류끼리만 가능. 결과도 같은 종류가 나와야함.
		//결과가 변하는 경우 (데이터타입)을 명시해야 함
		System.out.println(result);
	}

}
