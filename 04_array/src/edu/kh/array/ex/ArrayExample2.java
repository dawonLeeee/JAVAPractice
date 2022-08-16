package edu.kh.array.ex;

import java.util.Scanner;

public class ArrayExample2 {
	
	/*
	 * 변수 : 값을 저장하기 위해 메모리상의 공간을 할당
	 * (1개의 자료형, 1개의 데이터)
	 * 
	 * 1차원 배열 : 자료형이 같은 변수를 묶음으로 다루는 것
	 * (1개의 자료형, n개의 데이터)
	 * 
	 * 2차원 배열 : 자료형이 같은 1차원 배열을 묶음으로 다루는 것
	 * 			  2차원 배열 == 1차원 배열 참조변수의 묶음
	 */
	public void ex1() {
		//2차원 배열 선언 및 할당
		int[][] arr = {{1,2,3},{4,5,6}};
		

		System.out.println("행 : " + arr.length);
		System.out.println("열 : " + arr[0].length);
		
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[0].length; col++) {
				System.out.printf("%d행 %d열  == %d\n", row, col, arr[row][col]);
			}
		}
	}
	
	
	public void ex2() {
		//2차원 배열 선언과 동시에 초기화
		boolean flag = false;
		char[][] arr = {{'a', 'b', 'c'}, {'e', 'f', 'g'}};
		
		char[] arr1 = {'a', 'b', 'c'};
		char[] arr2 = {'d', 'e', 'f'};
		char[] arr3 = {'g', 'h', 'i'};
		
		//1. char 입력받기
		System.out.println("검색할 알파벳을 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
//		char input = sc.nextChar();
		//nextChar()는 존재하지 않는다
		
		char input = sc.next().charAt(0);
		
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[0].length; col++) {
				if(arr[row][col] == input) {
					System.out.printf("%c는 %d행 %d열에 위치합니다.\n", input, row, col);
					flag = true;
				}
			}
		}
		if(flag)
			System.out.println("찾는 문자열이 없습니다");
	}
	
	
	public void ex3() {
		//3행 3열짜리 int 2차원 배열에 난수(0~9)를 대입
		//단, 마지막 행/열은 각 행/열의 값
		//마지막 행, 마지막 열은 전체 난수 합
		
		int[][] arr = new int[2][2];
		
		for(int row = 0; row < arr.length-1; row++) 
			for(int col = 0; col < arr[0].length-1; col++) {
				int ran = (int)(Math.random() * 10);
				arr[row][col] = ran;
				arr[row][arr[row].length-1] += ran;
				arr[arr.length-1][col] += ran;
				arr[arr.length-1][arr[row].length-1] += ran;
			}
			
		for(int row = 0; row < arr.length-1; row++) 
			for(int col = 0; col < arr[0].length-1; col++) 
				System.out.printf("%3d", arr[row][col]);
		
		
		
	}
	
	public void ex4() {
		//가변배열
		// 2차원 배열 할당 시
		// 마지막 배열 차수(열)의 크기를 지정하지 않고 할당
		// 할당 이후 각 행에 각각의 1차원 배열을 참조하게 만듦.
		
		int[][] arr = new int[5][];
		arr[0] = new int[3];
		arr[1] = new int[4];
		arr[2] = new int[5];
		arr[3] = new int[2];
		arr[4] = new int[1];
		
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				System.out.println(arr[row][col] + " ");
			}
		}
	}
}
