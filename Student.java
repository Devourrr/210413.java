package week04_day2;

public class Student {
	int studentId;       //�й�
	String studentName;   //�̸�
	Subject[] subjectList;   //����������
	int cnt=0;
	int tot;
	
	
	public Student(int studentId , String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		subjectList = new Subject[10]; //������� ����
	}
	
	
	public void addSubject( String name, int score) {
		//�������
		Subject subject = new Subject( name, score);
		//������� �߰�
		subjectList[cnt]= subject;
		cnt++;
		
		//
		tot = tot + subject.getScore();
		
	}
	
	public void dispInfo() {
		
		System.out.println( studentName + " "+ "����=" + tot);
		
		for( int i=0; i< cnt ;  i++){
			System.out.println(subjectList[i]);
		}
		
	}
}
