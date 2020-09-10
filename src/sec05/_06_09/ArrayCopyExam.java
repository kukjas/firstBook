package sec05._06_09;

public class ArrayCopyExam {
	public static void main(String[] args) {
		String[] oldStr = {"java", "array", "copy"};
		String[] newStr = new String[5];
		
		System.arraycopy(oldStr, 0, newStr, 0, oldStr.length);
		for (int i = 0; i < newStr.length; i++) {
			System.out.print(newStr[i] + ", ");
		}
		System.out.println();
		
		String[] newStr2 = new String[7];
		System.arraycopy(newStr, 0, newStr2, 0, newStr.length);
		for (int i = 0; i < newStr2.length; i++) {
			System.out.print(newStr2[i] + ", ");
		}
	}
}
