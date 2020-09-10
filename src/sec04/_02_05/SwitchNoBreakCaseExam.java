package sec04._02_05;

public class SwitchNoBreakCaseExam {
	public static void main(String[] args) {
		int time = (int)(Math.random()*4) + 8;
		System.out.println("time: " + time);
		
		switch (time) {
		case 8:
			System.out.println("go");
		case 9:
			System.out.println("talk");
		case 10:
			System.out.println("lunch");

		default:
			System.out.println("out");
			break;
		}
	}
}
