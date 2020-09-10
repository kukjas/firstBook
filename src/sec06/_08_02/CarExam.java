package sec06._08_02;

public class CarExam {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.setGas(5);
		boolean gasState = car.isLeftGas();
		if (gasState) {
			System.out.println("start");
			car.run();
		}
		
		if (car.isLeftGas()) {
			car.run();
			System.out.println("left");
		} else {
			System.out.println("stop");
		}
	}
}
