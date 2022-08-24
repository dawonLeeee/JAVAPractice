package edu.kh.poly.ex2.model.vo;

public abstract class Animal {

	// 필드
	private String typr; // 종
	private String eatType; // 식성
	
	
	
	public Animal() {}
	// 추상 클래스는 직접적인 객체 생성이 불가능해서 
	// 생성자가 필요 없을 것 같지만
	// 자식 객체 생성시 내부 부모 객체 생성에 사용이 된다
	// 추상 메서드 부분은 자식이 오버라이딩 하여 동적 바인딩으로 처리한다
	
	
	
	// 완성된 메서드
	public String getTypr() {
		return typr;
	}
	public void setTypr(String typr) {
		this.typr = typr;
	}
	public String getEatType() {
		return eatType;
	}
	public void setEatType(String eatType) {
		this.eatType = eatType;
	}
	
	//미완성된 기능(추상 메서드)
	public abstract void breath();
	

}
