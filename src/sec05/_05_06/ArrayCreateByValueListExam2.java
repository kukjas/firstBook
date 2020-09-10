package sec05._05_06;

public class ArrayCreateByValueListExam2 {
	public static void main(String[] args) {
		int[] score;
		score = new int[] {83, 90, 87};
		
		int sum1 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 = sum1 + score[i];
		}
		
		System.out.println(sum1);
		int sum2 = add(new int[] {83, 90, 87});
		System.out.println(sum1 +  "&" + sum2);
	}
	
	public static int add(int[] score) {
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum +=score[i];
		}
		
		return sum;
	}
}
