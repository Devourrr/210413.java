package week04_day2_overriding;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Cat cat = new Cat();
//		Dog dog = new Dog();
//		Wolf wolf = new Wolf();
//		
//		cat.bark();
//		dog.bark();
//		wolf.bark();
		
		//������ ¢��
		
		Animal cat = new Cat();
		Animal dog = new Dog();
		Animal wolf = new Wolf();
		
		cat.bark();
		dog.bark();
		wolf.bark();
		
		Animal animals[] = new Animal[3];
		animals[0] = new Cat();
		animals[1] = new Dog();
		animals[2] = new Wolf();
		
		for(int i=0; i<animals.length; i++) {
			animals[i]. bark();	//�޽��� �ϳ��� �ٸ��� ���� ==> ������ 
		}
	}

}
