package edu.kh.oop.basic;

//클래스 : 객체가 되었을 때 가지고 있을 속성, 기능을 정의한 문서
//public : "같은 클래스" 내부 누구든, 어디서든 접근 가능하다
public class LDW {
	
	//객체가 가지고 있는 속성
	String name = "워니";
	int age = 999;
	String birthDay = "9999-99-99";
	private String passward = "1234";
	
	//객체가 가지고 있는 기능
	public void study() {
		System.out.println("자바 공부를 열심히 할 수 있음");
	}
	
	public void eat() {
		System.out.println("밥을 맛있게 먹을 수 있음");
	}
	
	public void plus(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	//비밀번호를 볼 수 있는 기능 == 간접 접근 방법
	public String showPassword() {
		return this.passward;
	}
	
}
