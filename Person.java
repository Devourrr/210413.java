package week04_day2;

public class Person {

	protected double weight;
	protected double height;
	
	public Person() {
		System.out.println("Person �⺻������");	//�⺻������ ������ ����
	}
	public Person(double weight, double height) {
		System.out.println("Person �Ű����� �ִ� ������");
		this.weight = weight;
		this.height = height;
		
	}
	
	public String toString() {
		return weight +" " + height;
	}
}
