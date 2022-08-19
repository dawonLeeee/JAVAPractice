package edu.kh.oop.field.model.vo;

public class Temp {
	// 매개변수 생성자 작성시 컴파일러가 기본 생성자를 자동 추가해주지 않으므로 기본 생성자를 같이 작성해준다

	private int num;
	private String name;
	
	public Temp(int num, String name) {
		this.name = name;
		this.num = num;
	}
	
	public Temp() {}


}
