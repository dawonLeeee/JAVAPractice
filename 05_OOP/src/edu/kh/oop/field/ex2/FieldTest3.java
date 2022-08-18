package edu.kh.oop.field.ex2;

import edu.kh.oop.field.ex1.FieldTest;
//다른 클래스를 현재 클래스에서 사용할 수 있도록 가져오기

public class FieldTest3 extends FieldTest{
// [접근제한자] [예약어] class 클래스명 [상속관계]
	public void ex() {
		FieldTest f = new FieldTest();
		
		System.out.println("다른 패키지");
		System.out.println(f.v1); // public
		System.out.println(v2); // protected
		// --> 다른 패키지, 상속 아님
		
		
		
		
//		System.out.println(f.v3); // (default)
//		
//		System.out.println(f.v4); // private
	}
}
