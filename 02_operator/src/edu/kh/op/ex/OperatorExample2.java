package edu.kh.op.ex;

public class OperatorExample2 {
	public static void main(String[] args) {
		
		//증감 연산자 : ++, --
		// -> 피연산자를 1 증가 또는 감소 시키는 연산자
		
		//전위 연산 : ++a, --a
		// -> a를 먼저 1증가/감소 시키고 다른 연산을 수행
		
		//후위 연산 : a++, a--
		// -> 다른 연산을 먼저 다 수행한 수 마지막에 a를 1 증가/감소시킴
		
		
		//전위 연산
		int num1 = 11;
		System.out.println("++num1 : " + ++num1); // 11
		System.out.println("--num1 : " + --num1); // 11
		
		System.out.println("++num1 + 10 : " + (++num1 + 10)); // (++num1 : 12) + 10 = 22;
		
		System.out.println("num1 : " + num1);
		System.out.println();	
		
		//후위 연산
		int num2 = 9;
		System.out.println("num2 : " + num2);
		System.out.println("num2-- + 10 : " + (num2-- + 10)); //19
		// 19를 출력한 다음 num2--연산이 일어난다.
	}
}
