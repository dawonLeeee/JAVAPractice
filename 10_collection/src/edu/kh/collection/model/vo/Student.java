package edu.kh.collection.model.vo;

import java.util.Objects;
import java.util.Comparator;

public class Student implements Comparable<Student> {

	private String name;
	private int age;
	private String address;
	private char gender;
	private int score;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, String address, char gender, int score) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.gender = gender;
		this.score = score;
	}
	
	@Override
	public int compareTo(Student o) {
		return this.age - o.age;
	}
	
	
	public int compare(Student o1, Student o2) {
    
		return o1.score - o2.score;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	
//	
//	 HashCode() 오버라이딩
//	 -> Hash라는 단어가 들어가는 컬렉션 사용시 반드시 오버라이딩 해야하는 메서드

}
