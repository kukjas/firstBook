package sec05._05_05;

public class StringEqualsExam {
	public static void main(String[] args) {
		String strVar1 = "½Å¹Î";
		String strVar2 = "½Å¹Î";
		
		if (strVar1 == strVar2) {
			System.out.println("°°À½");			
		}else {
			System.out.println("´Ù¸§");
		}
		
		if (strVar1.equals(strVar2)) {
			System.out.println("°°À½");			
		}

		String strVar3 = new String("½Å¹Î");
		String strVar4 = new String("½Å¹Î");
		
		if (strVar3 == strVar4) {
			System.out.println("°°À½");			
		}else {
			System.out.println("´Ù¸§");
		}
		
		if (strVar3.equals(strVar4)) {
			System.out.println("°°À½");			
		}
	}
}
