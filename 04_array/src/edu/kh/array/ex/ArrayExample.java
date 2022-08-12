package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {

	/* 배열
	 * 같은 자료형의 변수를 하나의 묶음으로 다루는 것.
	 * 묶여진 변수들은 하나의 이름(배열명)으로 불려지고
	 * 각 변수들은 index를 이용하여 구분함
	 * 
	 */
	
	public void ex2() {
		int[] arr; // 배열 시작 주소를 stack영역에 저장하는 변수
		// 참조형, 4byte
		
		arr = new int[4];
		//heap영역에 int 4칸짜리 배열을 할당(생성)하고
		//할당된 배열의 시작주소를 arr에 대입
		System.out.println("배열 길이 : " + arr.length);
		
		
		//stack영역은 컴파일러가 알아서 초기화 안해줌
		
		int a;
		//System.out.println(a);
		//The local variable a may not have been initialized
		//heap영역은 컴파일러가 알아서 초기화 해줌
	
		// 배열 초기화
		//1) 인덱스를 이용한 초기화
		
	}
	
	public void ex3() {
		Scanner sc = new Scanner(System.in);
		double[] heightArr = new double[5];
		double sum = 0;
		
		for(int i = 0; i < heightArr.length; i++) {
			System.out.print(i+1 + "번 키 입력 : \n");
			double height = sc.nextDouble();
			heightArr[i] = height;
		}
		
		System.out.print("입력 받은 키 : ");
		for(double height: heightArr) {
			System.out.print(height + " ");
			sum += height;
		}
		System.out.printf("\n평균 : %.2f\n", sum/heightArr.length);
	}
	
	public void ex6() {
		int[] arr = new int[4];
		
		String[] menuArr = {"김밥+라면", "KFC", "수제비", "김밥천국", 
				"맘스터치", "서브웨이", "순대국", "곰탕", "파스타", "빵"};
		
		int random = (int) (Math.random() * menuArr.length);
		
		System.out.println("오늘의 점심메뉴 : " + menuArr[random]);
	}
	
	public void ex7() {
		// 인원수를 입력받아 그 크기만큼의 정수 배열을 선언 및 할당
		// 인원수 만큼 점수를 입력받아
		// 합계, 평균, 최고점, 최저점을 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 명 : ");
		int peopleNum = sc.nextInt();
		int[] scoreArr = new int[peopleNum];
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		
		//for문에 breakpoint를 지정하면 증감식이 해석되기 전에 멈춘다
		for(int i = 0; i < peopleNum; i++) {
			System.out.print(i + "번 점수 입력 : ");
			int score = sc.nextInt();
			scoreArr[i] = score;
			sum += score;
			if(score > max)
				max = score;
			if(score < min)
				min = score;
		}
		
		System.out.println();
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum * 1.0 / peopleNum);
		System.out.println("최고점 : " + max);
		System.out.println("최저점 : " + min);

	}
	
	public void ex8() {
		//배열 내 데이터 검색
		//입력받은 정수가 배열에 존재하면 몇 번 인덱스에 존재하는지 출력
		//단, 없다면, "존재하지 않습니다" 출력
		
		int[] arr = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int search = sc.nextInt();
		boolean flag = true;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == search) {
				System.out.println(search + "은/는 " + i + "번 인덱스에 존재합니다.");
				flag = false;
				break; //중복 데이터가 없으므로 추가 검색을 하지 않아도 됨
			}	
		}
		if(flag) System.out.println("존재하지 않습니다.");
			
	}
	
	//로또 번호생성기
	public void ex9() {
		//배열을 이용한 중복 데이터 제거 + 정렬
		
		// 1. 1 ~45사이에 중복되지 않은 난수 6개
		// 2. 생성된 난수를 오름차순 정렬
		
		System.out.println(" ******로또 번호 생성기****** ");
		
		int[] arr = new int[6];
		for(int i = 0; i < 6; i++) {
			arr[i] = (int)(Math.random() * 45+1);
			for(int j = 0; j < i; j++)
				if(arr[i] ==arr[j]) i--; break;
		}
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		

	}
	
	public void ex10() {
		
		//얕은 복사
		//참조하는 주소만을 복사하여 서로다른 참조변수가 하나의 배열(또는 객체)을 참조하게 하는 복사
		int[] arr = {45, 12, 45, 65, 45};
		int[] copyArr = arr;
		
		System.out.println(arr); // [I@6f2b958e
		System.out.println(copyArr); //[I@6f2b958e
		//같은 값을 참조
		
		
		
		//깊은 복사
		//원본과 같은 자료형, 크기의 새로운 데이터를 만들어서 원본의 데이터를 모두 복사하는 방법. 
		// == 복제
		
		int[] arr2 = {45, 12, 45, 65, 45};
		int[] copyArr2 = new int[arr.length];
		
		//1) for문을 이용한 방법(index가 동일하다는 특징을 이용한다)
		for(int i = 0; i < arr2.length; i++)
			copyArr2[i] = arr2[i];
		
		//주소 확인
		System.out.println("arr2 : " + arr2);
		System.out.println("copyArr2 : " + copyArr2);
		System.out.println();
		
		System.out.println("\n[변경 전]");
		System.out.println("arr2 : " + Arrays.toString(arr2));
		System.out.println("copyArr : " + Arrays.toString(copyArr2));
		
		//원본의 값을 변경
		arr2[2] = 10000;
		
		System.out.println("\n[변경 후]");
		System.out.println("arr2 : " + Arrays.toString(arr2));
		System.out.println("copyArr : " + Arrays.toString(copyArr2));
			
		
		//2) System.arraycopy(원본배열, 원본 복사 시작 인덱스, 복사배열, 복사배열의 삽입 시작 인덱스, 복사길이);
		// void java.lang.System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		
		System.arraycopy(arr2, 0, copyArr2, 0, arr.length);
		
		
		//3)복사할 배열 변수 = Array.copyOf(원본배열, 복사할 길이)
		
		copyArr2 = Arrays.copyOf(arr, arr2.length);
		
	}
	
	public void ex11() {
		// null의미
		// ~참조하는 것(배열, 객체)이 없다를 의미하는 값
		
		int[] arr1 = new int[3];
		
		System.out.println(arr1 == null);
		
		if(arr1 != null) // arr1이 참조하는 배열이 있을 때에만 수행
			System.out.println(arr1[0]);
		
		
		int[] arr3; // 배열 참조변수 선언만!
	}
}
