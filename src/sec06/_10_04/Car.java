package sec06._10_04;

public class Car {
		
	int speed;
	
	void run() {
		System.out.println("running with " + speed);
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		
		car.speed = 10;
		car.run();
	}
}
