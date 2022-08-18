package edu.kh.oop.basic;

public class BasicRun {
	public static void main(String[] args) {
		
		LDW 이다원 = new LDW();
		//heap영역에 LDW 클래스에 정의된 내용을 이용하여 LDW객체 생성
		//BDH 객체 생성(할당)
		
		System.out.println(이다원.name);
		System.out.println(이다원.age);
		System.out.println(이다원.birthDay);
		
		
		이다원.eat();
		이다원.study();
		이다원.plus(50, 100);
		
		System.out.println("비밀번호 : " + 이다원.passward);
	}
}
