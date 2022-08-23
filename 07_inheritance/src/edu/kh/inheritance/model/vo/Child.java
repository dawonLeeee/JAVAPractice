package edu.kh.inheritance.model.vo;

public class Child extends Parent{
	
	@Override
	public void method1() {
		
		// 부모메서드에 final을 붙이면 다음과 같은 오류 발생
		// ->Cannot override the final method from Parent
		
		System.out.println("자식의 메서드");
	}
}
