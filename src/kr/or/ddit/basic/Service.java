package kr.or.ddit.basic;

import kr.or.ddit.basic.PrintAnnotation.printAnnotation;

public class Service {
	
	@printAnnotation
	public void method1() {
		System.out.println("method1이 호출되었습니다.");
	}
	@printAnnotation("%")
	public void method2() {
		System.out.println("method2이 호출되었습니다.");
	}
	@printAnnotation(value = "#",count=25)
	public void method3() {
		System.out.println("method3이 호출되었습니다.");
	}
}
