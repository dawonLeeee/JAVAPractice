package edu.kh.inheritance.model.vo;

// final클래스 : 상속불가
public /*final*/ class Parent {

	public static final int TEMP = 100;
	//어디서든 접근 가능하고 변하지 않는 상수 100
	
	// final 메서드 : 자식이 오버라이딩을 할 수 없다
	public /*final*/ void method1() {
		System.out.println("부모의 메서드");
	}
	
	
}
