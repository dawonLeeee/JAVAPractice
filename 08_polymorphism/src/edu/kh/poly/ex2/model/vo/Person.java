package edu.kh.poly.ex2.model.vo;

public class Person extends Animal{

	private String name;
	private String age;
	
	
	public Person() {
		// super(); // 작성하지 않을 시 컴파일러가 자동 추가
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void breath() {
		System.out.println("들숨날숨");
		
	}
	
}
