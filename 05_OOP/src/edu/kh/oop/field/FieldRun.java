package edu.kh.oop.field;

import edu.kh.oop.field.model.vo.Student;

public class FieldRun {
	public static void main(String[] args) {
		
		//Student 객체 생성
		Student std1 = new Student();
		
		/*
		 * 1. Student 자료형 참조변수 std1 선언(->주소 저장; 4byte)
		 * 2. new Student() : Student클래스에 생성된 내용을 토대로 Heap영역에 새로 생성(공간 할당)
		 * 3. 대입연산(주소 대입)
		 */
		
		/*
		 * Stack : 지역 변수가 생성되는 영역
		 * Heap :  배열, 객체가 생성되는 영역
		 * Static : 공유하는 코드가 생성(할당)되는 영역
		 * 		  : 공유 메모리 영역, 정적 메모리 영역
		 * 		  : 프로그램 실행시 static이 작성된 코드를 찾아 static영역에 생성(할당) 함
		 */
		
		std1.name = "홍길동";
		
		
		Student std2 = new Student();
		std2.name = "이순신";
		
	}
}
