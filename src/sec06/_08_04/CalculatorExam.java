package sec06._08_04;

public class CalculatorExam {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		double result1 =  cal.areaRectangle(10);
		
		double result2 =  cal.areaRectangle(10, 20);
		
		System.out.println(result1);
		System.out.println(result2);
	}
}
