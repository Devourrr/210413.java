package week04_day2_overriding;
// 오버로딩
// 같은 이름으로 메서드를 여러개 가지는 것
// 매개변수 개수, 자료형이 반드시 달라야 함
class Calc{
	
	int add(int a, int b) {
		return a+b;
	}
	double add(double a, double b) {
		return a+b;
	}
}
public class OverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc c= new Calc();
		int result = c.add(5,4);
		double result2 = c.add(10.2, 25.3);
	}

	//add => 다르게 동작
	
}
