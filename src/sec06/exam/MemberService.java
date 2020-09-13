package sec06.exam;

import java.util.Scanner;

public class MemberService {
	
	
	
	public boolean login(String id,  String password) {
		
		boolean result;
		
		System.out.println("input id & password");
		
		if (id.equals("hong") && password.equals("12345")) {
			result = true;
			System.out.println("login");
		}else {
			result = false;
			System.out.println("login false");
		}
		return result;
	}
	
	public void logout(String id) {System.out.println("logout");}
}
