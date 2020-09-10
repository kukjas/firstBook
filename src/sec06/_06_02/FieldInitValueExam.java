package sec06._06_02;

public class FieldInitValueExam {
	public static void main(String[] args) {
//		객체 선언
		FieldInitValue fiv  = new FieldInitValue();
//		객체의 필드 가져올 시 초기값은 어떤지 알아보기
		System.out.println("byteField = " + fiv.byteField);
		System.out.println("shortField = " + fiv.shortField);
		System.out.println("intField = " + fiv.intField);
		System.out.println("longField = " + fiv.longField);
		System.out.println("booleanField = " + fiv.booleanField);
		System.out.println("charField = " + fiv.charField);
		System.out.println("floatField = " + fiv.floatField);
		System.out.println("doubleField = " + fiv.doubleField);
		System.out.println("arrField = " + fiv.arrField);
		System.out.println("referenceField = " + fiv.referenceField);
	}
}
