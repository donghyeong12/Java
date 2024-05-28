package kr.or.ddit.reflect;

public class T01ClassObjectCreationTest {
/*
 	Java Reflection 에 대하여...
 	
 1.리플렉션은 런타임 시점에 클래스 또는 멤버변수, 메서드, 생성자에 대한 정보를 가져오거나 수정할 수 있고
 새로운 객체를 생성하거나 메서드를 실행할 수 있다.
 	(컴파일 시점에 해당 정보를 알수 없는 경우(소스코드 부재)에 유용하게 사용될 수 있음)
 	
 2. Reflection API는 java.lang.reflect 패키지와 java.lang.class를 통해 제공된다.
 
 3. java.lang.class의 주요 메서드
 - getName(), getSuperclass(), getInterfaces(), getModifiers() 등.
 
 4. java.lang.reflect 패키지의 주요 클래스
 - Field, Method, Constructor, Modifier 등.
 */

	public static void main(String[] args) throws ClassNotFoundException {
	
		// Class객체 (클래스 정보를 담고 있는 객체) 생성하기
		// 첫번째 방법: class.forName() 메서드 이용하기
		Class<?> klass= Class.forName("kr.or.ddit.reflect.T01ClassObjectCreationTest"); //클래스정보를 접근하기위한 클래스 오브젝트를 만든거 핸들링하기위한 클래스
		//예외처리 던저버린다.

		new T01ClassObjectCreationTest(); //오브젝트 생성 → 위에랑 다른거임 
		
		//두번째 방법: getClass() 메서드 이용하기	
		//모든객체는 getClass가지고있음 오브젝트가 제공해주는 메소드라서
		T01ClassObjectCreationTest obj = new T01ClassObjectCreationTest();
		klass =obj.getClass();
		
		// 세번째 방법: .class 이용하기
		klass = T01ClassObjectCreationTest.class;
		
	}

}
