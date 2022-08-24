package edu.kh.poly.ex1.model.vo;
// vo(value object)
// read-only 속성. 단순히 값 표현을 위해 불변 클래스(Read-only)를 만들어 사용한다

/*
 * DAO(Data Access Object)
 * : DB의 데이터에 접근하기 위한 객체
 * : 직접 DB에 접근하여 데이터를 삽입, 삭제, 조회 등 조작할 수 있는 기능 수행
 * : MVC 패턴의 Model에서 이와 같은 일을 수행한다
 * 
 * DTO(Data Transfer Object)
 * : DTO는 계층간(Controller, View, Business Layer) 데이터 교환을 위한 빈즈(Java Beans)를 의미
 * : 로직을 가지지 않는 데이터 객체, getter/setter메소드만 가진 클래스 의미
 * 
 * 
 *  ** Java Beans란?
 *  - 
 */







public class Car {
	
	/*
	 * Object의 toString메서드
	 * - "개체"의 문자열 표현을 반환한다
	 * - 객체가 가지고 있는 필드 정보를 하나의 문자열로 반환할 수 있도록
	 * 	 Java에서 제공해주는 메서드
	 */
	
	@Override
	public String toString() {
		return "wheel : " + wheel + " \\ seat : " + seat
				+ " \\ fuel : " + fuel;
				
	}
	
	
	//필드
	private int wheel; // 바퀴 개수
	private int seat; // 좌석수
	private String fuel; // 연료
	
	
	//생성자(생략 가능)
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(int wheel, int seat, String fuel) {
		super();
		this.wheel = wheel;
		this.seat = seat;
		this.fuel = fuel;
	}

	
	//메서드
	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	
	
	
}
