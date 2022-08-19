package edu.kh.oop.method.view;

import java.util.Scanner;

import edu.kh.oop.method.model.service.MethodExampleService;

// 콘솔에 보여지는 내용 입력, 출력
public class MethodExampleView {
	
	//클래스 내 어디서든 사용 가능한 Scanner객체 생성
	//캡슐화 원칙에 따라 private으로 작성(다른 패키지/클래스에서 호출해서 사용할 수 없도록)
	private Scanner sc = new Scanner(System.in);
	private MethodExampleService service = new MethodExampleService();
	
	// void : 반환값이 없음
	public void  displayMenu() {
		
		int input = 0; // 메뉴 번호를 입력받을 변수
		
		do {
			
			System.out.println("------------------------");
			System.out.println("1. 매개변수 X, 리턴 값 X");
			System.out.println("2. 매개변수 O, 리턴 값 X");
			System.out.println("3. 매개변수 X, 리턴 값 O");
			System.out.println("4. 매개변수 O, 리턴 값 O");
			System.out.println("0. 종료");
			System.out.println("------------------------");

			
			System.out.print("메뉴 선택 >> ");
			input = sc.nextInt();
			sc.nextLine(); // 입력 버퍼 개행문자 제거
			System.out.println(); // 줄 바꿈
			
			switch(input) {
				case 1 : 
					service.method1(); break;
				case 2 : 
					menu2(); break;
				case 3 : 
					String result = service.method3(); 
					System.out.println(result);break;
				case 4 : 
					menu4(); break;
				case 0 : 
					System.out.println("프로그램 종료"); break;
				default : 
					System.out.println("잘못 입력하셨습니다.");
			
			}
			
			
		} while(input != 0); //input이 0이면 반복을 종료
	}
	
	// 정수 3개를 입력받고 service.method2()를 호출하는 메서드 작성
	public void menu2() {
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		service.method2(num1, num2, num3);
	}
	
	public void menu4() {
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("0이 아닌 정수 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자 입력(+ | - | * | / | %) : ");
		String op = sc.next();
		
		double result =service.method4(num1, num2, op);
		
		System.out.printf("%d %s %d = %.1f\n", num1, op, num2, result);
		
	}
	
	
}
