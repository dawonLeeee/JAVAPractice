package edu.kh.variable.ex1;

public class VariableExample4 {
	
	public static void main(String[] args) {
		
		//자동 형변환 확인 3)
		//char -> int 자동 형변환
		
		int num5 = 'a'; // 대입도 연산이다
		//int = char
		System.out.println(num5);
		
		char ch = 97; // 형변환 예외 상황(큰->작은쪽으로 자동 형변환 된다)
		System.out.println("ch: " + ch);
		
		char ch2 = '!';
		int result2 = ch2;
		System.out.println(ch2 + " Unicode Number = " + result2);
		
		
		
		System.out.println("---------------------");
		System.out.println("*** 강제 형변환 ***");
		double temp = 3.14;
		int result3 = (int) temp; // 값의 범위가 큰 double ->int 강제 형변환
		System.out.println("result3 = " + result3); // 3(소수점 버림 처리)
		
		int temp2 = 290;
		byte result4 = (byte) temp2; // int->byte 강제형변환
		System.out.println("result4 = " + result4); // 34
		
		//강제 형변환의 다른 사용 예시
		
		//** 강제 형변환은 값의 범위에 관계없이 원하는 자료형으로 변환이 가능함 **
		int iNum1 = 1;
		int iNum2 = 2;
		
		System.out.println("iNum1 / iNum2 = " + iNum1 / iNum2);
											  //  1   /   2   =  0;
		                  					  // int  /  int  =  int;
		
		//강제 형변환, 자동 현변환을 동시에 사용
		System.out.println("iNum1 / iNum2 = " + (double)iNum1 / iNum2);
													  //  1   /   2   =  0;
													  //double/  int  =double;
		
		System.out.println((char)65); // int->char 강제 형변환
		System.out.println((int)'A'); // char->int 강제 형변환
		
		

	}

}
