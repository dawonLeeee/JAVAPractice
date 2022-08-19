package edu.kh.oop.method.model.service;

// 기능 제공용 클래스
public class MethodExampleService {
	
	
	//메서드는 이름 뒤에 ()가 있다
	// ->생성자도 메서드다
	
	
	// 필드
	private int num;
	
	//기본 생성자
	public MethodExampleService() {}
	
	
	// 1. 매개변수 X, 반환형 X 메서드
	public void method1() { 
		
		System.out.println("[[method1() 실행]]");
		System.out.println("1. 매개변수 X, 반환형 X 메서드");
		
		int a = 10;
		int b = 20;
		System.out.println("  a + b = " + (a + b));
	}
	
	
	
	// 2. 매개변수 O, 반환형 X 메서드
	public void method2(int num1, int num2, int num3) {
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		
		int sum = num1 + num2 + num3;
		System.out.println("합계 = " + sum);
		
	}
	
	// 3. 매개변수 X, 반환형 O 메서드
	public String method3() {
		String str = ""; // 내용은 없는데 참조하는 객체는 존재( != null)
		str += "안녕하세요?\n";
		str += "오늘 점심 뭐드시나요?\n";
		str += "푸른하늘 참치김밥이 먹고싶네요\n";
		
		return str;
	}
	// 4. 매개변수 X, 반환형 X 메서드
	public double method4(int num1, int num2, String op) {
		double result = 0.0;
		
		switch(op) {
			case "+" : 
				result = num1 + num2; 
				break;
				
			case "-" : 
				result = num1 - num2;
				break;
				
			case "*" : 
				result = num1 * num2;
				break;
			
			case "/" : 
				result = num1 * 1.0 / num2;
				break;
				
			case "%" : 
				result = num1 % num2;
				break;
		
		
		}
		
		
		
		return result;
	}
	
}
