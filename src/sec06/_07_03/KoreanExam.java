package sec06._07_03;

public class KoreanExam {
	public static void main(String[] args) {
		Korean k1 = new Korean("±è¹Î¼ö", "12345");
		System.out.println(k1.name + "ÀÇ ÁÖ¹Î¹øÈ£´Â " + k1.ssn);
		
		Korean k2 = new Korean("ÀÌ¹Î¼ö", "23456");
		System.out.println(k2.name + "ÀÇ ÁÖ¹Î¹øÈ£´Â " + k2.ssn);
	}
}