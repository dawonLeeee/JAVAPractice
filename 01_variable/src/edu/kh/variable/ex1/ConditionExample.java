package edu.kh.variable.ex1;

import java.util.Scanner;

public class ConditionExample {
	
	
	public void ex3() {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		String season;
		
		if(input >= 3 && input <= 5)
			season = "봄";
		else if(input >= 6 && input <= 8)
			season = "여름";
		else if(input >=9 && input <= 11) 
			season = "가을";
		else if(input == 12 || input == 1 || input == 2)
			season = "겨울";
		else
			season = "해당하는 계절이 없습니다.";
		
		System.out.println(season);
	}
	
	public void ex4() {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		String result;
		
		if(input <= 13)
			result = "어린이";
		else if(input <= 19)
			result = "청소년";
		else 
			result = "성인";
		
		
		System.out.println(result);
	}
}
