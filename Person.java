package week04_day2;

public class Person {

	protected double weight;
	protected double height;
	
	public Person() {
		System.out.println("Person 기본생성자");	//기본생성자 없으면 에러
	}
	public Person(double weight, double height) {
		System.out.println("Person 매개변수 있는 생성자");
		this.weight = weight;
		this.height = height;
		
	}
	
	public String toString() {
		return weight +" " + height;
	}
}
