package sec06._11_01;

public class PersonExam {
	public static void main(String[] args) {
		Person p1 = new Person("123456", "±è¹Î");
		
		System.out.println(p1.name);
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
	}
}
