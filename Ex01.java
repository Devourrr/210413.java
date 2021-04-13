package week04_day2;

import week04_day2_overriding.Animal;
import week04_day2_overriding.Cat;
import week04_day2_overriding.Dog;
import week04_day2_overriding.Wolf;

public class Ex01{
	public static void main (String[] args) {
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		Wolf wolf = new Wolf();
		
		disp(cat);
		disp(dog);
		disp(wolf);
	}
	
	public static void disp(Animal animal) {
		animal.bark();
	}
	
//	public static void disp(Cat cat) {
//		cat.bark();
//	}
//	public static void disp(Dog dog) {
//		dog.bark();
//	}
//	public static void disp(Wolf wolf) {
//		wolf.bark();
//	}
}
