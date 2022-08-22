package edu.kh.inheritance.model.vo;

public class Student extends Person{
	
	/*
	 * 자식 Student클래스에 부모 Person클래스의 멤버(필드, 메서드)를 상속
	 */
	

//	private String name;
//	private String age;
	
	private int grade;
	private int classroom;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String age, int grade, int classroom) {
		super();
//		this.name = name;
//		this.age = age;
		this.grade = grade;
		this.classroom = classroom;
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getAge() {
//		return age;
//	}
//
//	public void setAge(String age) {
//		this.age = age;
//	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	
	
}
