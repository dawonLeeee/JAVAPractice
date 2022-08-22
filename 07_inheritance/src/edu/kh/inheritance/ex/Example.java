package edu.kh.inheritance.ex;

import edu.kh.inheritance.model.vo.Student;

public class Example {

	public void ex1() {
		
		//Student객체 생성
		
		Student s1 = new Student();
		
		//자식만의 기능/필드 (grade, classRoom)
		s1.setGrade(2); // setGrade(int grade) : void - Student (Student의 메서드)
		s1.setClassroom(3); // - Student(Student의 메서드)
		
		s1.setName("홍길동"); // setName(String name) : void - Person(Person의 메서드)
							// 부모인 Person으로부터 상속받은 메서드
		s1.setAge(22);
		
		
		String str = "";
		str += s1.getGrade() + "학년 ";
		str += s1.getClassroom() + "반 ";
		str += s1.getAge() + "살 ";
		str += s1.getName();
		
		System.out.println(str);
		
	}
}
