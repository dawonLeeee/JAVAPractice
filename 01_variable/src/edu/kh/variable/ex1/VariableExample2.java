package edu.kh.variable.ex1;

public class VariableExample2 {
	public static void main(String[] args){
		//변수 선언 : 메모리에 값을 저장할 공간을 할당
		
		
		boolean booleanData; 
		// 논리값(true/false)을 저장할 공간 1byte를 메모리게 할당하고,
		//그 공간을 booleanData라고 부르겠다
		
		int iNum;
		//정수 값을 저장할 공간 4byte를 메모리에 할당하고
		//그 공간을 iNum이라고 부르겠다
		  
		short sNum;
		
		long longNum;
		//정수 값을 저장할 공간 8byte를 메모리에 저장하고
		//그 공간을 longNum이라고 부르겠다
		
		
		byte bNum;
		
		sNum = 11;
		
		float fNum; //실수형 변수 4byte 할당
		
		double dNum; // 실수형 변수 8byte 할당
		
		char ch1; // 문자형 변수 2byte 할당
		char ch2;
		
		
		
		//값 대입 : 선언된 변수에 값(리터럴)을 대입하는 것
		booleanData = false; 
		//boolean형 자료형 변수는 true/false만 저장할 수 있다
		
		iNum = -2147483648;
		//iNum = -2147483649; // out of range 
		//int의 리터럴 표기법은 기본적인 정수 표기법
		
		longNum = 10000000000000L;
		//10000000000000은 int표기법이므로 int의 최대 크기를 넘어설 수 없다
		//-->long 자료형의 리터럴 표기법은 정수 뒤에 L또는 l작성
		
		bNum = 127;
		//->byte/short는 거의 사용되지 않는 자료형으로
		//별도 리터럴 표기법이 없음 ->int 표기법을 같이 사용
		
		fNum = 3.14f;
		//float의 리터럴 표기법은 F또는 f를 뒤에 추가
		
		dNum = 0.0;
		//double의 리터럴 표기법은 기본 실수 표기법
		
		ch1 = 'A';
		//char의 리터럴 표기법은 ''(홑따옴표)
		ch2 = 66; // B
		//char자료형은 숫자-문자 형태의 문자표에서
		//일치하는 문자나 숫자의 문자 부분만 출력
		
		
		//syso + ctrl + space
		
		System.out.println("booleanData : " + booleanData);
		System.out.println("bNum : " + bNum);
		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
		System.out.println("longNum : " + longNum);
		System.out.println("fNum : " + fNum);
		System.out.println("dNum : " + dNum);
		System.out.println("ch1 : " + ch1);
		System.out.println("ch2 : " + ch2);
		
		//출력시 L이나 F같은 리터럴 표기법은 생략된다
	}   
}
