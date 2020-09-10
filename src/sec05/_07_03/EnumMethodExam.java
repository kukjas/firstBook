package sec05._07_03;

import sec05._07_01.Week;

public class EnumMethodExam {
	public static void main(String[] args) {
		//name() 
		Week today = Week.SUNDAY;
		String name= today.name();
		System.out.println("name = " + name);
		
		// int 皋家靛
		int ordinal = today.ordinal();
		System.out.println("ordinal = " + ordinal);
		
		// compare 皋家靛
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
//		valueOf
		if (args.length ==1) { 
			String strDay = args[0];
			System.out.println(strDay);
			
			Week weekDay = Week.valueOf(strDay);
			if (weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("林富");
			} else {
				System.out.println("乞老");
			}
		}
		
//		Week[] days = Week.values();
//		for (Week day : days) {
//			System.out.println(day);
//		}
		
		Week[] vays = Week.values();
		for (Week vay : vays) {
			System.out.println(vay);
		}
	}
}
