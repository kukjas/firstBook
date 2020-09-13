package sec06.exam;

import java.util.Scanner;

public class MemberServiceExam {
	public static void main(String[] args) {
		
		int select;
		String id;
		String password;
		
		MemberService service = new MemberService();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("if you want login, select no.1, or logout, select no.2.");
		select = scan.nextInt();
		
		if(select == 1) {
			System.out.println("input id & password");
			id = scan.next();
			password = scan.next();
			service.login(id, password);
			
		} else {
			id = scan.next();
			service.logout(id);
		}
		
	}
}
