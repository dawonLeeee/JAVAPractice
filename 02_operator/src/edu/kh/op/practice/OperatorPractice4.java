package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum / 3;
		
		String result = 
				((kor > 40) && (eng >= 40) && (math >= 40) && (avg >= 60)) ?
						"합격" : "불합격";
				
		System.out.printf("\n합계 : %d    \n평균 : %.1f      \n%s\n", sum, avg, result);
	}
}
