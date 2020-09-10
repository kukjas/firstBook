package sec04._02_05;

public class SwitchCharExam {
	public static void main(String[] args) {
		char grade = 'B';
		
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("good peaple");
			break;
		case 'B':
		case 'b':
			System.out.println("just peaple");
			break;
		default:;
			System.out.println("customer");
		}
	}
}
