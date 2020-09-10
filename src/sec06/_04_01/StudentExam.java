package sec06._04_01;

public class StudentExam {

	public static void main(String[] args) {
		
//		외부 클래스에서 사용하고자 하는 클래스를 통한 객체 선언 -> 설계시 부분부분 설계라고 보면 될까...
//		하나의 heap영역에 클래스 변수 선언 -> 하나의 객체
		Student s1 = new Student();
		System.out.println("s1변수는 Student 변수 참조");
		
//		s2는 같은 클래스로 생성되었지만 서로 다른 객체. 자신만의 고유 데이터를 가짐
		Student s2 = new Student();
		System.out.println("s2 변수도 Student변수 참조");
	}

}
