package sec06._15_04;

import java.lang.reflect.Method;

public class PrintAnnotationExam {
	public static void main(String[] args) {
		//Service 클래스로부터 정보 얻음
		Method[] declaredMetods = Service.class.getDeclaredMethods();
		
		//Method 객체를 하나씩 처리
		for (Method method : declaredMetods) {
			
			//PrintAnnotation이 적용되었는지 확인
			if (method.isAnnotationPresent(PrintAnnotation.class)) {
				//PrintAnnotation 객체 얻기
				PrintAnnotation printAnno = method.getAnnotation(PrintAnnotation.class);
				
				//메소드 이름 출력
				System.out.print("[ " + method.getName() + " ]");
				//구분선 출력
				for (int i = 0; i < printAnno.number(); i++) {
					System.out.print(printAnno.value());
				}
				try {
					method.invoke(new Service());
				} catch (Exception e) {}
				System.out.println();
			}
		}
	}
}
