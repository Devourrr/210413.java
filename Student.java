package week04_day2;

public class Student {
	int studentId;       //학번
	String studentName;   //이름
	Subject[] subjectList;   //수강과목목록
	int cnt=0;
	int tot;
	
	
	public Student(int studentId , String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		subjectList = new Subject[10]; //과목수를 한정
	}
	
	
	public void addSubject( String name, int score) {
		//과목생성
		Subject subject = new Subject( name, score);
		//수강목록 추가
		subjectList[cnt]= subject;
		cnt++;
		
		//
		tot = tot + subject.getScore();
		
	}
	
	public void dispInfo() {
		
		System.out.println( studentName + " "+ "총점=" + tot);
		
		for( int i=0; i< cnt ;  i++){
			System.out.println(subjectList[i]);
		}
		
	}
}
