package week04_day2;

public class B extends A {
	int c;
	int d;
	
	public B(int a,int b, int c, int d) {
		//�θ��� �⺻������ ȣ��
		//�θ��� �⺻�����ڰ� ���ٸ� �����߻�
		
		super(a,b);
		System.out.println("b�� ������");
		//��������� �θ��� �����ڸ� ȣ���� �� ����
		
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