package sec06._08_03;

public class CarExam {
	public static void main(String[] args) {
		Car car = new Car();
		car.keyTurnOn();
		car.run();
		int speed = car.getSpeed();
		System.out.println("¼Óµµ = " + speed  );
	}
}
