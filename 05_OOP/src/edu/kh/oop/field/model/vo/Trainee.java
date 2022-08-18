package edu.kh.oop.field.model.vo;

public class Trainee {
	public String name;
	public String phone;
	public String email;
	public int salary;
	
	public static char classRoom;
	
	//명시적 초기화 : 필드 선언시 바로 값 초기화
	
	//초기화 블록 : 객체(instance) 생성 시마다 해당 객체의 필드를 초기화 
	// - instance block : static이 없는 값 초기화(생성시마다)
	// - static block : static이 있는 필드 값 초기화(프로그램 실행시 1회)
	
	
	{ // instance block
		email = "없음";
		salary = 116000;
	}
	
	static { // static block
		classRoom = 'A';
	}
}
