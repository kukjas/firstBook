package sec06._13_03.pac2;

import sec06._13_03.pac1.A;

public class C {
	
	public C() {
		
	A a = new A();
	
	a.field1 = 1;
//	a.field2 = 1;		->default 불가(다른 패키지)
//	a.field3 = 1;		->private는 불가
	
	a.method1();
//	a.method2();		->default 불가(다른 패키지)
//	a.method3();		->private는 불가
	}
}
