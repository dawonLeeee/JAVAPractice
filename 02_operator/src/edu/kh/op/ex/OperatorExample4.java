package edu.kh.op.ex;

public class OperatorExample4 {
	public static void main(String[] args) {
		
		//논리 연산자 : &&(AND), ||(OR)
		
		// &&(AND) : 둘다 true이면 true, 나머지는 false
		// ~와, 그리고(~이고), ~이면서
		
		
		int a = 101;
		
		//a는 100이상 이면서 짝수인가?
		
		boolean result1 = a >= 100; // a는 100이상? true
		boolean result2 = a % 2 == 0; // a는 짝수인가? false
		
		System.out.println("a는 100이상 이면서 짝수인가? " + (result1 && result2));
		
		
		int b = 5;
		
		// b는 1부터 10 사이의 정수인가?
		boolean result3 = (b >= 1) && (b <= 10);
		
		
		// || (OR)연산자 : 둘 다 false이면 false, 나머진 true
		int c = 9;
		System.out.println("c는 홀수 이거나 10을 초과한 수인가?");
		System.out.println((c % 2 == 1) || (c > 10));
		
		
		int d = 20;
		System.out.println("d는 1부터 100사이 숫자 또는 음수인가?");
		System.out.println(((d >= 1) && (d <= 100)) || (d < 0));
		
		
		System.out.println("--------------");
		
		//논리 부정 연산자 : !(NOT)
		//논리 값을 반대로 가꾸는 연산자
		

		int e = 3;
		boolean result6 = e >= 1 && e < 5; // e는 1이상이고, 5미만인가?
		
	}
}
