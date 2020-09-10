package sec06._08_01;

public class Calculator {
	void powerOn() {
		System.out.println("Àü¿ø On");
	}
	
	int plus(int x, int y) {
		int result = x + y; 
		return result; 
	}
	
	double divide(int x, int y) {
		double result = (double) x / (double) y; 
		return result;
	}
	
	void powerOff() {
		System.out.println("powerOff");
	}
}
