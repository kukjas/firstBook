package sec06._13_03.pac1;

public class B {
	public B() {
		
		A a = new A();
		
		a.field1 = 1;
		a.field2 = 1;
//		a.field3 = 1;		->private는 불가
		
		a.method1();
		a.method2();
//		a.method3();		->private는 불가
	}
}
