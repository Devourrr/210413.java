package week04_day2;

public class Doctor extends Person {

	
		String name;
		int age;
		
		public Doctor() {
			
		}
		
		public Doctor (double weight, double height, String name, int age) {
			super(weight, height);	//�θ��� �⺻������ �ڵ�ȣ��
			this.name = name;
			this.age = age;
		}
	public String getInfo() {
		return "�̸�:" + name + "\n����:" + age + "\nü��:"+weight + "\n����:" +height;
		
	}
	public void treat() {
		System.out.println("ȯ�ڸ� ġ���Ѵ�.");
	}
	
	
	
	public static void main(String[] args) {
		Doctor d = new Doctor(65.2, 178.3, "���ǻ�", 38);
		String result = d.getInfo();
		System.out.println(result);
		
		//��Ӱ��迡�� �θ��� ������������ ������ �� �ִ� (��ĳ����)
		Person d1 = new Doctor( 53.5, 170.2, "���ǻ�", 34);
		
		//������ �θ����� ������ �ϸ� �θ����� ���븸 �� �� �ִ�.
		d.treat(); 
//		d1.treat(); x
		Doctor doctor = (Doctor)d1;	//(�ٿ�ĳ����)
		doctor.treat();
		
	}

	
}

