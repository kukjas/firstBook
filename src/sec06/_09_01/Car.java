package sec06._09_01;

public class Car {
	String model;
	int speed;
	
	public Car(String model) {
		// TODO Auto-generated constructor stub
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for (int i = 10; i < 50; i+=10) {
			this.setSpeed(50);
			System.out.println(model + "running with " + speed);
		}
	}
}
