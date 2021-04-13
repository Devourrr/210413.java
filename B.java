package week04_day2;

public class B extends A {
	int c;
	int d;
	
	public B(int a,int b, int c, int d) {
		//부모의 기본생성자 호출
		//부모의 기본생성자가 없다면 오류발생
		
		super(a,b);
		System.out.println("b의 생성자");
		//명시적으로 부모의 생성자를 호출할 수 있음
		
		this.c = c;
		this.d = d;
	}


	public void disp() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}
}