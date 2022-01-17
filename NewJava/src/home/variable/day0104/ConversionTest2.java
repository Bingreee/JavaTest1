package home.variable.day0104;

public class ConversionTest2 {

	public static void main(String[] args) {
		
		byte b = 100;
		int i = b;
		//byte->int로의 타입 변환(프로모션). 더 큰 타입으로의 변환이므로 자동으로 됨.
		//byte < short,char < int,float <long,double
		System.out.println("b : "+b);
		System.out.println("i : "+i);
		
		int i2 = 300;
		byte b2 = (byte) i2;
		//디모션. 정보의 손실 발생 가능. 데이터 손실 발생해도 byte로 캐스팅
		System.out.println("i2 :" +i2);
		System.out.println("b2 :" +b2);


	}

}
