package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		String result = 
				num == 0 ? "0" : (num > 0 ? "양수" : "음수");
		System.out.printf("%s 입니다.\n", result);
	}
}
