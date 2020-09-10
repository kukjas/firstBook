package sec04._02_05;

public class SwitchStringExam {
	public static void main(String[] args) {
		String position = "과장";
		int money = 0;
		
		switch (position) {
		case "부장":
			money = 800;
			System.out.println(money);
			break;
		case "과장":
			money = 500;
			System.out.println(money);
			break;
		default:
			System.out.println(300);
		}
	}
}
