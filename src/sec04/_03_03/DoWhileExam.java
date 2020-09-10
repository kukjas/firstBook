package sec04._03_03;

import java.util.Scanner;

public class DoWhileExam {
	public static void main(String[] args) {
		System.out.println("input");
		System.out.println("종료하고 싶으면 q");
		
		Scanner scanner = new Scanner(System.in);
		String inputString = "";
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			if (!inputString.equals("q")) {
				System.out.println(inputString +" 입력은 안됨~~");
			}
		} while (! inputString.equals("q"));
		
		System.out.println("q니깐 1번 종료!!");
		
		Scanner scanner2 = new Scanner(System.in);
		
		boolean run = true;
		while (run) {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println("q 면 종료~~");
			if (inputString.equals("q")) {
				System.out.println("종료!!");
				run = false;
			}
		}
	}
}
