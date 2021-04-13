package week04_day2;

public class Subject {
	String name;
	int score;

	
	public Subject(String name, int score) {
		this.name = name;
		this.score = score;
		
	}
	
	public int getScore() {
		return score;
	}
	public String toString() {
		return name + " " + score;
	}
}
