package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class ArrayPractice {
	
	
	//=============================================

	public void practice1() {
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i = 0; i < 9; i++) 
			arr[i] = i+1;
		
		for(int i = 0; i < 9; i += 2) 
			sum += arr[i];

		System.out.println("짝수 번째 인덱스 합 : " + sum);
	}
	
	//=============================================
	
	public void practice2() {
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i = 0; i < 9; i++) 
			arr[i] = 9 - i;
		
		for(int i = 1; i < 9; i += 2) 
			sum += arr[i];

		System.out.println("짝수 번째 인덱스 합 : " + sum);
	}
	
	
	//=============================================
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 1; i <= num; i++)
			arr[i-1] = i;
		
		for(int i: arr) 
			System.out.print(i + " ");
		
	}
	
	//=============================================
	
	public void practice4() {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		
		for(int i = 0; i < 5; i++) {
			System.out.print("입력 " + i + " : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int inquire = sc.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == inquire) {
				System.out.println("인덱스 : " + i);
				flag = true;
			}
		}
		if(!flag)
			System.out.println("일치하는 값이 존재하지 않습니다.");
	}
	
	//=============================================
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.next();
		char[] cArr = str.toCharArray();
		HashSet<Integer> set = new HashSet<>();
		
		
		System.out.print("문자 : ");
		char inquire = sc.next().charAt(0);
		
		for(int i = 0; i < cArr.length; i++) {
			if(cArr[i] == inquire) {
				set.add(i);
			}
		}
		
		if(set.size() > 0) {
			System.out.print("application에 " + inquire + "가 존재하는 위치(인덱스) : ");
			for(int i: set)
				System.out.print(i + " ");
			System.out.println("\n" + inquire + "개수 : " + set.size());
		} else
			System.out.println(inquire + "는 문자열에 존재하지 않습니다.");
			
	}
	
	//=============================================
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		
		for(int i: arr) {
			System.out.print(i + " ");
			sum += i;
		}
		System.out.println("\n총 합 : " + sum);
	}
	
	//=============================================
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.next();
		
		char[] ch = str.toCharArray();
		
		for(int i = 0; i < ch.length-6; i++) {
			System.out.print(ch[i]);
		}
		System.out.println("******");
	}
	
	
	//=============================================
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		int num = -1;
		
		while(true) {
			System.out.print("정수 : ");
			num = sc.nextInt();
			
			if((num >= 3) && (num % 2 == 1))
				break;
			
			System.out.println("다시 입력하세요.");
		}
		
		int[] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			if(i < num/2 + 1)
				arr[i] = i+1;
			else
				arr[i] = -i + num;
		}
		
		for(int i: arr)
			System.out.print(i + " ");
	}
	
	//=============================================
	
	public void practice9() {
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++)
			arr[i] = (int)(Math.random() * 10 + 1);
		
		System.out.print("발생한 난수 : ");
		for(int i: arr)
			System.out.print(i + " ");
	}
	//=============================================
	
	
	public void practice10() {
		int[] arr = new int[10];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		
		for(int i = 0; i < arr.length; i++) {
			int rand = (int)(Math.random() * 10 + 1);
			arr[i] = rand;
			if(rand < min)
				min = rand;
			if(rand > max)
				max = rand;
		}
		
		System.out.print("발생한 난수 : ");
		for(int i: arr)
			System.out.print(i + " ");
		System.out.println("\n최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}
	//=============================================
	
	public void practice11() {
		int[] arr = new int[10];
		
		
		for(int i = 0; i < arr.length; i++) {
			int rand = (int)(Math.random() * 10 + 1);
			arr[i] = rand;
			for(int j = 0; j < i; j++) {
				if(rand == arr[j])
					i--;
			}
		}
		
		for(int i: arr)
			System.out.print(i + " ");
	}
	//=============================================
	
	public void practice12() {
		int[] arr = new int[6];
		
		
		for(int i = 0; i < 6; i++) {
			int rand = (int)(Math.random() * 40 + 1);
			arr[i] = rand;
			for(int j = 0; j < i; j++) {
				if(rand == arr[j])
					i--;
			}
		}
		
		Arrays.sort(arr);
		
		for(int i: arr)
			System.out.print(i + " ");
	}
	//=============================================
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.next();
		int count = 0;
		
		char[] ch = str.toCharArray();
		
		Arrays.sort(ch);
		
		for(int i = 0; i < ch.length-1; i++) {
			if(ch[i] == ch[i + 1])
				count--;
			count++;
		}
		System.out.println("문자 개수 : " + (count+1));
	}
	//=============================================
	
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		String[] arr = new String[num];
		boolean isMore = true;
		
		int i = 0;
		while(i < arr.length) {
			System.out.print((i + 1) + "번째 문자열 : ");
			arr[i++] = sc.nextLine();
		}
		
		
		while(isMore) {
		
		
			System.out.print("더 값을 입력하시겠습니까?(Y/N)");
			String s = sc.next();
			isMore = (s.equals("y"));
			
			
			if(isMore) {
				System.out.print("더 입력하고 싶은 개수 : ");
				int num2 = sc.nextInt();
				
				String[] arr2 = new String[arr.length + num2];
				
				for(i = 0; i < arr.length; i++) {
					arr2[i] = arr[i];
				}
				
				sc.nextLine();
				
				
				for(i = 0; i < num2; i++) {
					System.out.print((arr.length + i + 1) + "번째 문자열 : ");
					arr2[arr.length + i] = sc.nextLine();
				}
				
				
				
				arr = new String[arr2.length];
				arr = arr2;
				
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	//=============================================
	
	public void practice15() {
		int[][] arr = new int[3][3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.printf("(%d, %d)", i, j);
			}
			System.out.println();
		}
	}
	//=============================================
	public void practice16() {
		int[][] arr = new int[4][4];
		
		int num = 1;
		
		for(int i = 0; i < arr.length; i++) 
			for(int j = 0; j < arr[i].length; j++)
				arr[i][j] = num++;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println();
		}
		
	}
	//=============================================
	public void practice17() {
		int[][] arr = new int[4][4];
		
		int num = 16;
		
		for(int i = 0; i < arr.length; i++) 
			for(int j = 0; j < arr[i].length; j++)
				arr[i][j] = num--;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println();
		}
	}
	//=============================================
	public void practice18() {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[4][4];
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr[i].length-1; j++) {
				int rand = (int)(Math.random() * 10 + 1);
				arr[i][j] = rand;
				arr[i][3] += rand;
				arr[3][j] += rand;
				arr[3][3] += rand;
			}
		}
		
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println();
		}
		
		
	}
	//=============================================

	public void practice19() {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		boolean flag = true;
		
		while(flag) {
			System.out.print("행 크기 : ");
			num1 = sc.nextInt();
			if(!((num1 >= 1) && (num1 <= 10))){
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.\n");
			} else
				flag = false;	
		}
		
		flag = true;
		while(flag) {
			System.out.print("열 크기 : ");
			num2 = sc.nextInt();
			if(!((num2 >= 1) && (num2 <= 10))){
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.\n");
			} else
				flag = false;	
		}
		
		char[][] arr = new char[num1][num2];
		
		for(int i = 0; i < num1; i++) {
			for(int j = 0; j < num2; j++) {
				arr[i][j] = (char)(Math.random() * 26 + 65);
			}
		}
		
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	//=============================================
	
	public void practice20() {
		Scanner sc = new Scanner(System.in);
		System.out.print("행의 크기 : ");
		int num = sc.nextInt();
		char[][] arr = new char[num][];
		int alphabet = 'a';
		
		for(int i = 0; i < num; i++) {
			System.out.print(i + "열의 크기 : ");
			int col = sc.nextInt();
			arr[i] = new char[col];
			for(int j = 0; j < col; j++) {
				arr[i][j] = (char)(alphabet++);
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	//=============================================
	public void practice21() {
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				 "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		int count = 0;
		
		
		Scanner sc = new Scanner(System.in);
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		
		

		
		
		int s = 0;
		
			for(int i = 0; i < arr1.length; i++) {
				for(int j = 0; j < arr1[i].length; j++) {
					
					arr1[i][j] = students[s++];
					
				}
			}
	
			for(int i = 0; i < arr2.length; i++) {
				for(int j = 0; j < arr2[i].length; j++) {
					
					arr2[i][j] = students[s++];
					
				}
			}
		
		
		int a = 1;
		System.out.println("== " + a++ + "분단 ==");
		for(int i  = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("== " + a++ + "분단 ==");
		for(int i  = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
	//=============================================

	public void practice22() {
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				 "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		int count = 0;
		
		
		Scanner sc = new Scanner(System.in);
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		
		

		
		
		int s = 0;
		
			for(int i = 0; i < arr1.length; i++) {
				for(int j = 0; j < arr1[i].length; j++) {
					
					arr1[i][j] = students[s++];
					
				}
			}
	
			for(int i = 0; i < arr2.length; i++) {
				for(int j = 0; j < arr2[i].length; j++) {
					
					arr2[i][j] = students[s++];
					
				}
			}
		
		
		int a = 1;
		System.out.println("== " + a++ + "분단 ==");
		for(int i  = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("== " + a++ + "분단 ==");
		for(int i  = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("============================");
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String inquire = sc.next();
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				if(inquire.equals(arr1[i][j])) {
					String rightOrLeft = j == 0? "왼쪽" : "오른쪽";
					System.out.printf("검색하신 %s 학생은 1분단 %d번째 줄 %s에 있습니다.", inquire, (i+1), rightOrLeft);
				}
			}
		}
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				if(inquire.equals(arr2[i][j])) {
					String rightOrLeft = j == 0? "왼쪽" : "오른쪽";
					System.out.printf("검색하신 %s 학생은 2분단 %d번째 줄 %s에 있습니다.", inquire, (i + 1), rightOrLeft);
				}
			}
		}
	}
	//=============================================

	public void practice23() {
		Scanner sc = new Scanner(System.in);
		String[][] arr = new String[6][6];
		
		for(int i = 0; i < arr.length; i++)
			Arrays.fill(arr[i], "  ");
		
		
		
		
		
		arr[0][0] = "  ";
		for(int i = 1; i < arr[0].length; i++) {
			arr[0][i] = Integer.toString(i-1) + " ";
			arr[i][0] = Integer.toString(i-1);
		}
		
		
		System.out.print("행 인덱스 입력 : ");
		int row = sc.nextInt();
		System.out.print("열 인덱스 입력 : ");
		int col = sc.nextInt();
		

		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(i == row+1 && j == col+1)
					System.out.print(" X");
				else
					System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	//=============================================
	
	public void practice24() {
		Scanner sc = new Scanner(System.in);
		String[][] arr = new String[6][6];
		
		while(true) {
			
			for(int i = 0; i < arr.length; i++)
				Arrays.fill(arr[i], "  ");
			
			
			
			
			
			arr[0][0] = "  ";
			for(int i = 1; i < arr[0].length; i++) {
				arr[0][i] = Integer.toString(i-1) + " ";
				arr[i][0] = Integer.toString(i-1);
			}
			
			
			System.out.print("행 인덱스 입력 : ");
			int row = sc.nextInt();
			if(row == 99) break;
			
			System.out.print("열 인덱스 입력 : ");
			int col = sc.nextInt();
			

			
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					if(i == row+1 && j == col+1)
						System.out.print(" X");
					else
						System.out.print(arr[i][j]);
				}
				System.out.println();
			}
			
			
			System.out.println();
		}
		System.out.println("프로그램 종료");
		
		
		
		
	}
	
	public void bingoGame() {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		System.out.print("빙고판 크기 지정 : ");
		int row = sc.nextInt();
		String[][] arr = new String[row][row];
		

		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.toString((int)(Math.random() * row * row + 1));
				System.out.printf("%3s ", arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("====================빙고게임 시작=====================");
		
		while(flag) {
			System.out.print("정수를 입력하시오 : ");
			String inquire = sc.next();
		
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					if(inquire.equals(arr[i][j])) {
						arr[i][j] = "★";
						flag = false;
						break;
					} else {
						continue;
						}
				}
			}
			System.out.println("다시 입력해주세요.");
		}
		
	}
}
		
