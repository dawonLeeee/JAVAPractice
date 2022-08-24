package edu.kh.poly.ex1.model.service;

import java.util.ArrayList;
import java.util.List;

import edu.kh.poly.ex1.model.vo.Car;
import edu.kh.poly.ex1.model.vo.Spark;
import edu.kh.poly.ex1.model.vo.Truck;

public class Example1 {
	
	/*
	 * <<다형성>>
	 * - 상속을 이용한 기술로, 
	 * 	부모 타입의 참조 변수 하나가 여러 타입의 자식 객체를 참조할 수 있음
	 */
	
	
	//업캐스팅 : 부모 참조변수 = 자식 객체
	public void ex1() {
		
		Car c1 = new Car();
		
		// ** 업캐스팅 확인 **
		Car c2 = new Truck();
		/*
		 * Car c2 부모타입 참조변수로 Truck 자식 객체를 참조하는 모양.
		 * 컴퓨터 값 처리 원칙에 위배되는 것처럼 보이지만 
		 * 실제로 참조하는 c2는 Truck객체 전체가 아닌 
		 * 내부에 존재하는 Car객체 부분만을 참조
		 */
		
		//Truck이 car로부터 상속받은 메서드
		c2.setWheel(4);
		c2.setSeat(0);
		c2.setFuel("휘발유");
		
		
		
		
		System.out.println(c1.toString());
		
		
		// 정적 바인딩 : 프로그램 실행 전 메서드 호출부 - 메서드 코드 연결
		// 			부모타입으로 메서드 호출 - 부모클래스 메서드와 연결
		
		// 동적 바인딩 : 프로그램 실행 중 참조하는 객체의 실제 타입의 오버라이딩 된 메서드와 연결
		System.out.println(c2.toString());
		
		
	}
	
	public void ex2() {
		
		//다형성(업캐스팅), 동적 바인딩, 객체 배열
		// 객체배열 : 객체를 참조하는 참조변수의 묶음
		
		Car[] arr = new Car[3]; // Car 참조변수 3개짜리 배열
		
		arr[0] = new Car(4, 9, "경유"); // Car 객체
		arr[1] = new Truck(8, 3, "경유", 5.0); // Truck 객체(업캐스팅 적용)
		arr[2] = new Spark(4, 4, "휘발유", 0.5);
		
		
		
		for(Car c : arr)
			System.out.println(c);
		
		System.out.println();
		
		//업캐스팅 + 동적바인딩 장점
		printCar(arr[0]);
		printCar(arr[1]);
		printCar(arr[2]);
		
		
	}
	
	public void printCar(Car c) {
		System.out.println("자동차 정보 : " + c);
		/*
		 * 전달받은 객체가 자식 객체이고
		 * toString()을 오버라이딩 했다면
		 * 동적 바인딩을 이용해서 자식 toString()을 호출
		 */
		
	}
	
	// 업캐스팅 + 동적바인딩을 사용해 이런 코드의 중복을 방지할 수 있다
//	public void printTruck(Truck c) {
//		System.out.println("자동차 정보 : " + c);
//	}
//	
//	public void printSpark(Spark c) {
//		System.out.println("자동차 정보 : " + c);
//	}
	
	public void ex3() {
		
		// 다운 캐스팅
		// 업캐스팅 적용 상황에서 (부모 참조변수 = 자식 객체)
		// 부모 참조 변수를 자식 타입으로 바꿔(강제 형변환, 얕은 복사)
		// 자식 객체를 온전하게 참조할 수 있게 만듦
		
		Car c1 = new Spark(4, 4, "휘발유", 0.5);
		Car c2 = new Truck(12, 3, "경유", 20);
		Car c3 = new Car(4, 5, "휘발유");
		
		// 1. 강제 형변환
		((Spark)c1).dc();
		// 형변환 먼저 진행 후 dc() 호출
		// ->다운 캐스팅
		
		// 얕은 복사
		Truck t1 = (Truck) c2;
		t1.loading();
		
		
		System.out.println("----------------------------");
		
		// instanceof 연산자
		// - 참조하는 객체의 타입을 검사하는 연산자
		// - 맞으면 true, 아니면 false
		
		System.out.println(c1 instanceof Spark); // true
		System.out.println(c2 instanceof Spark); // false
		
		check(c1);
		check(c2);
		check(c3);
		
		
		//다운캐스팅을 잘못한 경우
		((Truck)c3).loading();
		// 컴파일오류는 발생x
		// ClassCastException : 형변환 예외
		//	 -> 다운캐스팅이 잘못된 경우 발생 
		
		//	 -> 해결방법 : instanceof 연산자로 다운캐스팅 할 타입이 맞는지 검사
		
		if(c3 instanceof Truck)
			((Truck)c3).loading();
		else
			System.out.println("c3는 트럭 객체가 아닙니다");
		
	}
	
	public void check(Car c) {
		// 전달받은 c의 타입을 검사해서 고유한 메서드 호출
		
		if(c instanceof Spark) { // 참조하는 객체가 Spark인 경우
			((Spark)c).dc();
		} else if(c instanceof Truck) { // 참조하는 객체가 Truck인 경우
			((Truck)c).loading();
		} else
			System.out.println("car는 고유 기능이 없습니다.");
			
	}
	
	public void ex4() {
		//instanceof 연산자 사용 시 검사 순서에 대한 문제점
		
		Car c = new Spark();
		
		if(c instanceof Car)
			System.out.println("부모 Car타입니다.");
		else
			((Spark)c).dc();
		
	}
	
	public void ex5() {
		List list = new ArrayList();
		
		list.add("aaa");
		
	}

}
