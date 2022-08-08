package edu.kh.op.ex;

import java.util.Scanner;

public class OperatorExample1 {
	public static void main(String[] args) {
		//산술 연산자 : + - * / %(나머지)
		System.out.println("두 정수를 입력 받아 산술 연산 결과 출력하기");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int input1 = sc.nextInt();
		
		System.out.print("정수 입력: ");
		int input2 = sc.nextInt();

		System.out.println(input1 + " + " + input2 + " = " + input1 + input2); // 13 + 5 = 135
		
		System.out.printf("%d  - %d = %d\n", input1, input2, input1 - input2); // 13  - 5 = 8
		
		System.out.printf("%d  * %d = %.0f\n", input1, input2, input1 * input2 * 1.0); // 13  * 5 = 65
		
		System.out.printf("%.0f  / %.0f = %.1f\n", input1 * 1.0, input2 * 1.0, input1 / (input2 * 1.0)); //13  / 5 = 2.6

		//printf에서 '%'문자를 출력하기 위해서는 %%입력
		System.out.printf("%d  %% %d = %d\n", input1, input2, input1 % input2); // 13  % 5 = 3

	}

}
