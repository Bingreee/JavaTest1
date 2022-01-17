package home.stringprac.day0105;

public class StringPractice1 {

	public static void main(String[] args) {
		String a = "abcde";
	 

        System.out.println(a.charAt(0));
        System.out.println(a.charAt(1));
        System.out.println(a.charAt(2));
        System.out.println(a.charAt(3));
        System.out.println(a.charAt(4));

        // String은 0의 index 부터 시작. 그래서 charAt(5)은 없음.
        System.out.println("----------");

        System.out.println(a.indexOf('a'));
        System.out.println(a.indexOf('b'));
        System.out.println(a.indexOf('c'));
        System.out.println(a.indexOf('d'));
        System.out.println(a.indexOf('e'));

        // indexOf('')을 이용한 String 문자열의 index 번호 알아내기.
        System.out.println("----------");


        System.out.println(a.indexOf(a.charAt(a.length() - 5)));
        System.out.println(a.indexOf(a.charAt(a.length() - 4)));
        System.out.println(a.indexOf(a.charAt(a.length() - 3)));
        System.out.println(a.indexOf(a.charAt(a.length() - 2)));
        System.out.println(a.indexOf(a.charAt(a.length() - 1)));

        System.out.println("===========================");
        
        String a1 = "abcd-abcd";
       

        System.out.println(a1.lastIndexOf("a"));
        System.out.println(a1.lastIndexOf("b"));

        // 앞의 0,1번째의 index의 ab가 아닌 뒤에있는 5,6번째의 index를 반환.

        System.out.println(a1.lastIndexOf("cd"));
        System.out.println(a1.lastIndexOf("ab"));

        //String의 문자열 또한 index를 알 수 있음.
       
        System.out.println(a1.lastIndexOf(a1.charAt(a1.length() - 1)));

        // 위는 마지막 d의 문자의 index을 알 수 있음.
        
        System.out.println("======================");
        String a11 = "abcd-abcd";
       

        System.out.println(a11.lastIndexOf("a", 4));
        System.out.println(a11.lastIndexOf("b", 4));

        // String a 의 4번째 index인 - 에서부터 a는 0번째 b는 1번째 index에 있다.
	}

}
