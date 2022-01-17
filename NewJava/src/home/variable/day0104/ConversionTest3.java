package home.variable.day0104;

public class ConversionTest3 {

	public static void main(String[] args) {
		
		short s1 = 10;
		short s2 = 20;
		
		int s3 = s1 + s2;
		short s4 = (short)(s1 + s2);
		//4byte 미만의 계산은 int로 바꿔서 계산
		System.out.println("result :" +s3);
		System.out.println("result :" +s4);

	}

}
