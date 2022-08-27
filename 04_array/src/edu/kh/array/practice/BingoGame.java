package src.edu.kh.array.practice;


import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;


public class BingoGame {
	
	int row;
	String[][] arr;

	public void bingoGame() {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		System.out.print("빙고판 크기 지정 : ");
		row = sc.nextInt();
		arr = new String[row][row];
		LinkedList<Integer> list = new LinkedList<>();
		Set<Integer> delete = new java.util.HashSet<>();
		
		
		for(int i = 1; i <= row * row; i++)
			list.add(i);
			
	//	int i = 0; int j = 0;
		for(int k = 0; k < list.size(); k++) {
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < row; j++) {
					int index = (int)(Math.random() * list.size());
					int tmp = list.get(index);
					list.remove(index);
					arr[i][j] = Integer.toString(tmp);
				}
			}
		}
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < row; j++) {
				System.out.printf("%3s",arr[i][j]);
			}
			System.out.println();
		}
		
		
		
		System.out.println("====================빙고게임 시작=====================");
		
		while(true) {
			System.out.print("정수를 입력하시오 : ");
			int input = sc.nextInt();
			
			if(input <= 0 || input > (row * row) || delete.contains(input)) {
				System.out.println("다시 입력해주세요.");
				System.out.println();
				continue;
			}
			else {
				delete.add(input);
				for(int i = 0; i < row; i++) {
					for(int j = 0; j < row; j++) {
						if(Integer.toString(input).equals(arr[i][j])) {
							arr[i][j] = "★";
						}
					}
				}
				
				for(int i = 0; i < row; i++) {
					for(int j = 0; j < row; j++) {
						System.out.printf("%3s",arr[i][j]);
					}
					System.out.println();
				}
				System.out.printf("현재 %d빙고\n\n", isBingo());
				if(isBingo() == 3) {
					System.out.println("***Bingo!***");
					break;
				}
			}
			
			
			
		}
	
	
	}
	
	public int isBingo() {
		int count;
		int bingoNum = 0;
		
		for(int i = 0; i < row; i++) {
			count = 0;
			for(int j = 0; j < row; j++) {
				if(arr[i][j].equals("★")) {
					count++;
				}
				if(count == 5) {
					bingoNum++;
				}
			}
		}
		
		for(int i = 0; i < row; i++) {
			count = 0;
			for(int j = 0; j < row; j++) {
				if(arr[j][i].equals("★")) {
					count++;
				}
				if(count == 5) {
					bingoNum++;
				}
			}
		}
		
		count = 0;
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < row; j++) {
				if(arr[i][j].equals("★") && i==j) {
					count++;
				}
				
			}
		}
		if(count == 5) {
			bingoNum++;
		}
		
		count = 0;
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < row; j++) {
				if(arr[i][j].equals("★") && (i + j == 4)) {
					count++;
				}
			}
		}
		if(count == 5) {
			bingoNum++;
		}
		
		
		return bingoNum;
	}
	
	
}