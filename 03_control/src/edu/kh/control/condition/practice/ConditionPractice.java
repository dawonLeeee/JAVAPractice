package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num < 0)
			System.out.println("양수만 입력해주세요");
		else if(num % 2 == 0)
			System.out.println("짝수입니다");
		else
			System.out.println("홀수입니다.");
	}
	
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		
		int sum = kor + math + eng;
		double avg = sum / 3 * 1.0;
		
		if((kor >= 40) && (math >= 40) && (eng >= 40) 
				&& (avg >= 60)) {
			System.out.println("합계 :" + sum);
			System.out.printf("평균 : %.1f\n", avg);
			System.out.println("축하합니다, 합격입니다!");
		} else 
			System.out.println("불합격입니다.");
	}
	
	

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		int date = -1;
		
		
		switch(month) {
		case 1: date = java.time.Month.JANUARY.length(true); break;
		case 2: date = java.time.Month.FEBRUARY.length(false); break;
		case 3: date = java.time.Month.MARCH.length(true); break;
		case 4: date = java.time.Month.APRIL.length(true); break;
		case 5: date = java.time.Month.MAY.length(true); break;
		case 6: date = java.time.Month.JUNE.length(true); break;
		case 7: date = java.time.Month.JULY.length(true); break;
		case 8: date = java.time.Month.AUGUST.length(true); break;
		case 9: date = java.time.Month.SEPTEMBER.length(true); break;
		case 10: date = java.time.Month.OCTOBER.length(true); break;
		case 11: date = java.time.Month.NOVEMBER.length(true); break;
		case 12: date = java.time.Month.DECEMBER.length(true); break;
		default : System.out.println(month + "월은 잘못 입력된 달입니다.");
		
		}
		if(month >= 1 && month <= 12)
			System.out.printf("%d월은 %d일까지 있습니다.", month, date);
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(m)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double BMI = weight / (height * height);
		String result= null;
		
		if(BMI < 18.5) result = "저체중";
		else if(BMI < 23) result = "정상체중";
		else if(BMI < 25) result = "과체중";
		else if(BMI < 30) result = "비만";
		else result = "고도 비만";
		
		System.out.println(BMI);
		System.out.println(result);
	}

	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("중간 고사 점수 : ");
		int midTest = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		int finalTest = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int homework = sc.nextInt();
		
		System.out.print("출석 점수 : ");
		int attendance = sc.nextInt();
		
		double result = 
				midTest * 0.2 +
				finalTest * 0.3 + 
				homework * 0.3 + 
				attendance * 1.0;
		
		String passOrFail;
		if(result < 70)
			passOrFail = "Fail  [점수 미달]";
		else
			passOrFail = "PASS";
		
		
		if(attendance <= (20 * 0.7)) {
			System.out.println("================= 결과 =================");
			System.out.printf("Fail [출석 횟수 부족 (%d/20)]\n", attendance);
		}
		else {
			System.out.println("================= 결과 =================");
			System.out.printf("중간 고사 점수(20) : %.1f\n", midTest * 0.2);
			System.out.printf("기말 고사 점수(30) : %.1f\n", finalTest * 0.3);
			System.out.printf("과제 점수	 (30) : %.1f\n", homework * 0.3);
			System.out.printf("출석 점수	 (20) : %.f\n", attendance * 1.0);
			System.out.println("총점 : " + result);
			System.out.println(passOrFail);		
		}
		
	
	
	}
}
