package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if(num < 1)
			System.out.println("1이상의 숫자를 입력해주세요.");
		else 
			for(int i = 1; i <= num; i++) {
				System.out.print(i + " ");
		}
	}
	
// ====================================================================
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if(num < 1)
			System.out.println("1이상의 숫자를 입력해주세요.");
		else 
			for(int i = num; i >= 1; i--) {
				System.out.print(i + " ");
		}
	}
	
// ====================================================================
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i = 1; i < num; i++) {
				System.out.print(i + " + ");
				sum += i;
		}
		System.out.println(num + " = " + (sum + num));
	}
	
// ====================================================================
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			int tmp;
			tmp = num1;
			num1 = num2;
			num2 = tmp;	
		}
		
		if(num1 < 1 || num2 < 1)
			System.out.println("1 이상의 숫자를 입력해주세요.");
		else 
			for(int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
		}
	}
// ====================================================================
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.printf("===== %d단 =====\n", num);
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%2d * %2d = %2d\n", num, i, (num * i));
		}
	}
// ====================================================================
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num < 2 || num > 9)
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		
		
		int count = num;
		for(int i = num; i <= 9; i++) {
			System.out.printf("===== %d단 =====\n", count++);
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%2d * %2d = %2d\n", i, j, (j * i));
			}
			System.out.println();
		}
	}
// ====================================================================
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
// ====================================================================
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i <= num; i++) {
			for(int j = 0; j < (num - i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
// ====================================================================
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < (num - i); j++) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
// ====================================================================
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i <= num; i++) {
			for(int j = 0; j < (num - i -1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
// ====================================================================
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < (num - i); j++) {
				System.out.print(" ");
			}
			for(int j = 0; j <= 2*i; j++) {
				System.out.print("*");
			}
			for(int j = 0; j < (num - i); j++) {
				System.out.print(" ");
			}
			
			
			System.out.println();
		}
	}
// ====================================================================
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++)
			System.out.print("*");
		System.out.println();
		
		for(int i = 0; i < num - 2; i++) {
			System.out.print("*");
			for(int j = 0; j < num - 2; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}

		for(int i = 0; i < num; i++)
			System.out.print("*");
		System.out.println();
	}
	
// ====================================================================
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
		int count = 0;
		for(int i = 1; i <= num; i++) {
			if((i % 2 == 0) || (i % 3 == 0)) {
				System.out.print(i + " ");
			}
			if(i % 6 == 0)
				count++;
		}
		System.out.println();
		System.out.println("count : " + count);
	}
}
