package sec05.exam;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("------------------------------------------------------");
			System.out.print("선택>");
			
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				System.out.print("학생수>: ");
				studentNum = scanner.nextInt();
				run = true;
			} else if(selectNo == 2){
				scores = new int[studentNum];
				for (int i = 0; i < studentNum; i++) {
				System.out.print("점수" + i+" >: ");
					//숫자입력할 때까지
				scores[i] = scanner.nextInt();
				}
			} else if(selectNo == 3){
				for (int i = 0; i < scores.length; i++) {
					System.out.println("점수" + (i+1)+" >: " + scores[i]);
				}
			} else if(selectNo == 4){

//				최대값과 
				int max = 0; double avg = 0.0; int sum = 0;
				
				for (int i = 0; i < scores.length; i++) {
					if (scores[i] > max) {
						max = scores[i]; 
					}
				}
				
				for (int i = 0; i < scores.length; i++) {
					sum = sum + scores[i];
				}
				System.out.println(sum);
				avg = sum / studentNum;
				
				System.out.println("최고점수: " + max);
				System.out.println("평균: " + avg);
			
			} else if(selectNo == 5){
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}
}
