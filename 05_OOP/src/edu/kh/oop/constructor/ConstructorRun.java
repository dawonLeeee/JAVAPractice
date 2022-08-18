package edu.kh.oop.constructor;

import edu.kh.oop.constructor.model.vo.Member;

public class ConstructorRun {
	public static void main(String[] args) {
		Member member1 = new Member();
						// 생성자
		
		Member member2 = new Member();
		Member member5 = new Member("member22", "pass22!", "010-1234-1234", 27);
		
		
		System.out.println("프로그램 종료");
	}
}
