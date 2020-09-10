package sec06._08_02;

public class Car {
	int gas;
	int a = 5;
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas(){
		if (gas == 0) {
			System.out.println("gas is out");
			return false;
		}
		System.out.println("gas is on");
		return true;
	}
	
	void run() {
		while(true) {
			
			if (gas>0) {
				System.out.println("gas = " + gas);
				gas -= 1;
			} else {
				System.out.println("gas is 0");
				return;
			}
		}
	}
}
