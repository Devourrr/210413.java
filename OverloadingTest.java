package week04_day2_overriding;
// �����ε�
// ���� �̸����� �޼��带 ������ ������ ��
// �Ű����� ����, �ڷ����� �ݵ�� �޶�� ��
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

	//add => �ٸ��� ����
	
}
