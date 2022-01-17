package home.variable.day0104;

public class ConversionTest4 {

	public static void main(String[] args) {
		
		int i = 100;
		double d = 100;
		
		double dresult = i + d;//int랑 double더하면 자동으로 큰 값으로 따라간다.
		int iresult = (int) (i + d);
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(dresult);
		System.out.println(iresult);
		
		//크키가 다른 타입의 계산은 큰 타입의 데이터로 바꿔서 계산
		//계산할 때 변수에 저장도니 값만 꺼내와서 저장
		//실수의 소수점을 버림할 경우 (int)로 형변환한다.

	}

}
