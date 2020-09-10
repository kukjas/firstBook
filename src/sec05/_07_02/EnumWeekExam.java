package sec05._07_02;

import java.util.Calendar;

import sec05._07_01.Week;

public class EnumWeekExam {
	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);

		switch(week) {
		
			case 1:
				today = Week.SUNDAY; break;
			case 2:
				today = Week.TUESDAY; break;
			case 3:
				today = Week.WEDNESDAY; break;
			case 4:
				today = Week.THURSDAY; break;
			case 5:
				today = Week.FRIDAY; break;
			case 6:
				today = Week.SATURDAY; break;
			case 7:
				today = Week.MONDAY; break;
		}
		
			System.out.println("오늘은: " + today);
	
		if (today == Week.SUNDAY) {
			System.out.println("축구하는 날");
		} else {	
			System.out.println("일 하는 날 ");
		}
	}
}
