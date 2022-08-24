package edu.kh.poly.ex2.model.service;

import java.util.Scanner;

import edu.kh.poly.ex2.model.vo.Animal;
import edu.kh.poly.ex2.model.vo.Calculator;
import edu.kh.poly.ex2.model.vo.Fish;
import edu.kh.poly.ex2.model.vo.HGG;
import edu.kh.poly.ex2.model.vo.HSH;
import edu.kh.poly.ex2.model.vo.KH;
import edu.kh.poly.ex2.model.vo.LDWCalculator;
import edu.kh.poly.ex2.model.vo.Person;

public class AbstractService {
	
	public void ex1() {
		
		//추상클래스는 정말로 객체생성이 안될까?
		// Animal a = new Animal(); 
		// Cannot instantiate the type Animal
		
		// Animal을 상속받은 자식 클래스를 이용해 객체 생성
		
		Fish f1 = new Fish();
		f1.setTypr("어류"); // 자식객체 내부에 부모 부분이 있음을 확인
		f1.breath();
		
		
		Person p1 = new Person();
		p1.setTypr("포유류"); // 자식객체 내부에 부모 부분이 있음을 확인
		
		
		// 추상 클래스는 부모 타입의 참조 변수로 사용할 수 있다
		// -> 다형성의 업캐스팅
		Animal a1 = new Fish();
		Animal a2 = new Person();
		
		
		// 추상 메서드였던 breath() 호출 가능여부 확인
		a1.breath();
		a2.breath(); 
		// void edu.kh.poly.ex2.model.vo.Animal.breath()
		// 실행 전에는 Animal의 breath와 연결된 것으로 보임
		// 실행 중 오버라이딩 한 자식의 breath()와 연결됨(동적 바인딩)
		// ->동적 바인딩에 의해 정상 수행될 것을 알기 때문에 에러x
		
		
		//객체배열 + 추상클래스
		Animal[] arr = new Animal[3]; // Animal 참조변수 3개 묶음
		arr[0] = new Fish();
		arr[1] = new Person();
		arr[2] = new Fish();
		
		// arr[i] 인덱스에 어떤 Animal 자식 객체가 있는지 모르지만 
		// 다들 강제 오버라이딩 한 breath()라는 공통적인 메서드를 가지고 있으므로
		// arr[i].breath()를 작성할 수 있다.
		for(int i = 0; i < arr.length; i++) {
			arr[i].breath();
		}
		
		
		
		Animal a = new Animal() {
			
			@Override
			public void breath() {
				// TODO Auto-generated method stub
				
			}
		};
		
	}
	
	public void ex2() {
		
		// 인터페이스는 미완성 메서드로만 이루어져 있어 직접 객체생성이 불가능
		// KH k1 = new KH(); // Cannot instantiate the type KH
		
		HSH sh = new HSH();
		HGG kd = new HGG();
		
		sh.lesson();
		kd.lesson();
		
		KH[] arr = new KH[2];
		
		arr[0] = new HSH();
		arr[1] = new HGG();
		
		for(int i = 0; i < arr.length; i++)
			arr[i].lesson(); // void edu.kh.poly.ex2.model.vo.KH.lesson()
		// 정적 바인딩 : KH.lesson() (추상 메서드)
		// 동적 바인딩 : 각각 sh.lesson(), kd.lesson() 실행
	}
	
	public void ex3() {
		
		Scanner sc = new Scanner(System.in);
		
		Calculator cal = new LDWCalculator();
		
		
		System.out.println("[사칙연산]");
		System.out.print("정수 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 2 : ");
		int num2 = sc.nextInt();
		
		
		System.out.println(num1 + " + " + num2 + " = " + cal.plus(num1, num2));
		System.out.println(num1 + " - " + num2 + " = " + cal.minus(num1, num2));
		System.out.println(num1 + " * " + num2 + " = " + cal.multiple(num1, num2));
		if(num2 == 0)
			System.out.println("0으로 나눌 수 없습니다.");
		else
			System.out.printf("%d / %d((소숫점 2자리까지 표시) = %.2f\n", num1, num2,cal.divide(num1, num2));
		
		System.out.println("----------------------------");
		
		System.out.print("반지름 입력 : ");
		double r = sc.nextDouble();
		System.out.println("원의 넓이 : " + cal.areaOfCircle(r));
		
		System.out.println("----------------------------");
		
		System.out.println("a의 b제곱");
		
		System.out.print("a 입력 : ");
		double a = sc.nextDouble();
		
		System.out.print("b 입력(정수)");
		int b = sc.nextInt();
		
		System.out.printf("%f의 %d제곱(소숫점 2자리까지 표시) : %2f\n", a, b,cal.pow(a, b));
		
		
	}

}
