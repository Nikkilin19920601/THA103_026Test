package xxx;

public class Student {

	int score = 0;

	public void play(int hours) {
    //每休息一小時,score-1
		score -= hours;
	}


	public void study(int hours) {
	//每讀書一小時,score+1	
		score += hours;
	}
	
	public static void main(String[]args) {
		
		Student student1 = new Student();
		Student student2 = new Student();
		System.out.println(student1.score);
		System.out.println(student2.score);

	}
	
}
	