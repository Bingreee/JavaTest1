package inheritance.day0112;

public class PointTest{
	

	public static void main(String args[]) {
		Point3D p3 = new Point3D(1, 2, 3);
		System.out.println(p3.getLocation());
	}
}

class Point extends Object {
	int x;
	int y;

	Point(int x, int y) {
		super();//컴파일 시 자동으로 호출 : Object();->존재하므로 문제x 
		this.x = x;
		this.y = y;
	}

	String getLocation() {
		return "x :" + x + ", y :" + y;
	}
}

class Point3D extends Point {
	int z;

	Point3D(int x, int y, int z) {
		super(x, y);	//super 클래스의 x,y를 매개변수로 가지는 생성자를 호출. 꼭 불러야함
						//모든 클래스의 생성자 첫 줄에는 생성자(같은 클래스의 생성자나 super의 생성자
						//를 호출해야한다.
						//super 클래스에서 초기화하라고 값 넘겨주는 것
		//this.x = x;
		//this.y = y;  super에서 초기화하니까 생략해도됨.
		this.z = z;
	}

	String getLocation() { // 오버라이딩
		return "x :" + x + ", y :" + y + ", z :" + z;
	}
}




