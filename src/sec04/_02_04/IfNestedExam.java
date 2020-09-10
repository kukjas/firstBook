package sec04._02_04;

public class IfNestedExam {
	public static void main(String[] args) {
		int score = (int)(Math.random()*10) + 85;
		
		if (score>90) {
			System.out.println("91점 이상 2명 있음");
			if (score>95) {
				System.out.println("1등");
			} else {
				System.out.println("2등");
			}
			
		} else {
			
			System.out.println("90점 이하가 2명 있음");
			if (score>88) {
				System.out.println("3등");
			} else {
				System.out.println("4등");
			}
		}
		
		System.out.println("score = " + score);
	}
}
