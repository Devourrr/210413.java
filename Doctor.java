package week04_day2;

public class Doctor extends Person {

	
		String name;
		int age;
		
		public Doctor() {
			
		}
		
		public Doctor (double weight, double height, String name, int age) {
			super(weight, height);	//부모의 기본생성자 자동호출
			this.name = name;
			this.age = age;
		}
	public String getInfo() {
		return "이름:" + name + "\n나이:" + age + "\n체중:"+weight + "\n신장:" +height;
		
	}
	public void treat() {
		System.out.println("환자를 치료한다.");
	}
	
	
	
	public static void main(String[] args) {
		Doctor d = new Doctor(65.2, 178.3, "김의사", 38);
		String result = d.getInfo();
		System.out.println(result);
		
		//상속관계에선 부모형 잠조형변수에 저장할 수 있다 (업캐스팅)
		Person d1 = new Doctor( 53.5, 170.2, "박의사", 34);
		
		//하지만 부모형의 참조를 하면 부모형의 내용만 알 수 있다.
		d.treat(); 
//		d1.treat(); x
		Doctor doctor = (Doctor)d1;	//(다운캐스팅)
		doctor.treat();
		
	}

	
}

