package edu.kh.oop.field.ex1;

public class FieldTest {

	public int v1 = 10; // 어디서든 접근 가능
	protected int v2 = 20; // 같은 패키지와 상속관계에서만 접근 가능
	int v3 = 30; // (default) : 같은 패키지에서만 접근 가능
	private int v4 = 40; // 현재 클래스에서만 접근 가능
	
	
	public void ex() {
		System.out.println("같은 클래스 내부 직접 접근");
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
	}
}
