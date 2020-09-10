package sec06._14_01;

public class CarExam {
	public static void main(String[] args) {
		
		Car myCar= new Car();

//		¿ﬂ∏¯µ» º”µµ
		myCar.setSpeed(-50);
		System.out.println("speed is " + myCar.getSpeed());

//		¥ﬁ∏≤
		myCar.setSpeed(50);
		
//		∏ÿ√„,(∏ÿ√ﬂ¡ˆ æ æ“¥Ÿ∏È ∏ÿ√Á∂Û)
		if (!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		
		System.out.println("speed is " + myCar.getSpeed());
	}
}
