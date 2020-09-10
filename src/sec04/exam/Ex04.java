package sec04.exam;

public class Ex04 {
	public static void main(String[] args) {
		
		int dice1, dice2;
		
		do {
			dice1 = (int)(Math.random() * 6) + 1;
			dice2 = (int)(Math.random() * 6) + 1;
			
			System.out.println("(" + dice1 + ", " + dice2 + ")");
		} while ((dice1 + dice2)!=5);
	}
}
