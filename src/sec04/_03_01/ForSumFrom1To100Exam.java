package sec04._03_01;

public class ForSumFrom1To100Exam {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			sum = sum+i;
		}
		System.out.println(sum);
	}
}
