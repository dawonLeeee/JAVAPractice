package edu.kh.oop.cls.ex1;

import edu.kh.oop.cls.ex2.Test2;
// default클래스 : 다른 패키지의 클래스에서 import 불가

public class TestRun {
	public static void main(String[] args) {
		
		//Test1클래스를 이용해서 객체 생성
		// == Test1클래스에 정의된 내용을 애용해서
		// heap영역에 새로운 객체를 생성(할당)
		Test1 t1 = new Test1();
		
		Test2 t2 = new Test2();
		//import 해야지만 에러가 발생하지 않음
		// <-> public class : 어디서든지 접근 가능(==어디서든지 import 가능)
		
		
		//클래스 접근제한자 사용처
		//public : 언제 어디서든지 사용 가능한 클래스를 만들 때 사용(기본적으로 public class 사용)
	
	
	
	
	
	}
}
