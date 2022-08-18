package edu.kh.oop.constructor.model.vo;

public class Member {

	//추상화 --> 아이디, 비밀번호, 전화번호, 나이
	//캡슐화 --> 추상화 결과를 묶고, 데이터 직접접근을 제한
	
	private String memberId;
	private String memberPw;
	private String memberPhone;
	private int memberAge;
	
	public Member() {
		memberId = "member01";
		memberPw = "pass01!";
		memberPhone = "010-1234-1234";
		memberAge = 25;
		
		System.out.println("멤버 객체가 생성되었습니다.");
	}
	
	//괄호안에 적은것 : 매개변수(Parameter) : 둘 사이 관계 형성
	public Member(String memberId, String memberPw, String memberPhone, int memberAge) { 
		System.out.println("memberId : " + memberId);
		System.out.println("memberPw : " + memberPw);
		System.out.println("memberPhone : " + memberPhone);
		System.out.println("memberAge : " + memberAge);
		
	}
}
