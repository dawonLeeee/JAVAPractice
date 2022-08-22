package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {
	public void ex2() {
		//for기초 사용법2
		// 5부터 12까지 1씩 증가
		
		for(int i = 5; i <=12; i++) 
			System.out.println("i = " + i);
		
		System.out.println("========================");
		//1부터 100까지의 모든 정수의 합
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("sum = " + sum);
	}
	
	public void ex3() {
		// for기초 사용법3
		
		//두 정수를 입력받아 두 정수 사이의 모든 정수 합을 출력
		//단, 첫 번째 입력이 두 번째 입력보다 작아야 한다
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int sum = 0;
		for(int i = num1; i <= num2; i++) {
			sum += i;
		}
		System.out.println("sum = " + sum);
		
	}
	
	public void ex4() {
		//for기초 사용법 4
		// 1부터 100까지 3씩 증가하며 출력
		
		for(int i = 1; i <= 100; i += 3)
			System.out.print(i + " ");
		
		
		//10부터 20까지 0.5씩 증가
		System.out.println();
		System.out.println();
		for(double i = 10; i <= 20; i += 0.5)
			System.out.print(i + " ");
		
	}
	
	public void ex5() {
		// for문 + char + 강제/자동 형변환 응용
		// A ~ Z까지 출력
		
//		for(int i = 'A'; i <= 'A'; i++) {
//			System.out.print("i = " + (char)i + " ");
//		}
		
		for(char i = 'A'; i <= 'Z'; i++)
			System.out.println("i = " + i);
	}
	
	public void ex6() {
		//10부터 1까지 1씩 감소하면서 출력
		for(int i = 10; i >= 1; i--)
			System.out.println("i = " + i);
	}
	
	public void ex7() {
		//정수 5개를 입력받아서 합계 구하기
		Scanner sc  = new Scanner(System.in);
		
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			sum += sc.nextInt();
		}
		System.out.println("sum = " + sum);
	}
	
	public void ex8() {
		Scanner sc  = new Scanner(System.in);
		System.out.print("입력 받을 정수의 개수 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			System.out.print("입력 " + i + " : ");
			int input = sc.nextInt();
			sum += input;
		}
		System.out.println("합계 : " + sum);
	}
	
	public void ex9() {
		//1부터 20까지 1씩 증가하며 출력
		//단, 5의 배수에는 ()를 붙여서 출력
		
		
		
		for(int i = 1; i <= 20; i++) {
			if(i % 5 == 0)
				System.out.print("(" + i + ") ");
			else
				System.out.print(i + " ");
		}
	}
	
	public void ex10() {
		//구구단 출력
		// 2~9의 수를 하나 입력받아 해당하는 수의 단을 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("2 ~9 사이의 수를 입력하세요");
		int N = sc.nextInt();
		if(N > 9 || N < 2)
			System.out.println("잘못 입력하셨습니다.");
		else
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", N, i, N*i);
			}
	}
	
	// ==============================================================
	// ==============================================================
	
	// 중첩 방법문
	
	public void ex11() {
		for(int i = 0; i < 4; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	public void ex12() {
		for(int i = 2; i <=9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%dx%d=%2d  ", i, j, j * i);
				//%2d : 정수가 출력될 칸을 2칸 확보하고 오른쪽 정렬하여 출력
			}
			System.out.println();
		}
	}
	
	public void ex13() {
		//1
		//12
		//123
		//1234
		
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= i; j++)
				System.out.print(j);
			System.out.println();
		}
	}
	
	public void ex14() {
		for(int i = 1; i <= 4; i++) {
			for(int j = 4; j > (4-i); j--)
				System.out.print(j);
			System.out.println();
		}
	}
	
	public void ex15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요: ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = num; j > i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public void ex16() {
		//*
		//**
		//***
		//****
		//*****
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void ex17() {
		//1부터 20사이의 3의 배수의 개수를 출력
		
		int sum = 0; 
		int count = 0;
		for(int i = 1; i <= 20; i++) {
			if(i % 3 == 0) {
				System.out.print(i + " ");
				sum += i;  count++;
			}
		}
		System.out.println(sum);
		System.out.println(count);
	}
	
	public void ex18() {
		//2중 for문과 count를 이용하여 아래 모양 출력하기
		
		int count = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.printf("%3d ", ++count);
			}
			System.out.println();
		}
	}
	
	
	
	
	
}
