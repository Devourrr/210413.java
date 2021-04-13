package week04_day2_overriding;

//오버라이딩
//부모클래스의 메서드를 재정의 하는 것
//오버라이딩한 메서드가 우선권 가짐
public class Cat extends Animal{
	@Override
	public void bark( ) {
		System.out.println("야옹");
}
}
