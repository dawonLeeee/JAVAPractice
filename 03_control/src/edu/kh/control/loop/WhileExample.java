package edu.kh.control.loop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WhileExample {

	/* while문
	 * 
	 * 별도의 초기식, 증감식이 존재하지 않고 
	 * 반목 보건만을 설정하는 반복문
	 * 
	 * 반복횟수가 정해져있진 않지만
	 * 언젠간 반복이 종료되는 경우에 사용
	 */
	
	public void ex1() {
		int i = 1;
		while(i <= 10)
			System.out.println(i++);
	}
	
	public void ex2() {
		
		//입력되는 모든 정수의 합 구하기
		// 단, 0이 입력되면 반복 종료
		Scanner sc = new Scanner(System.in);
		int num = -1; 
		int sum = 0;
		while(num != 0) {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
			sum += num;
			System.out.println(sum);
			
		}
	}
	
	public void ex3() {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int menu = 0;
		String list = "";
		boolean flag = false;
		// true : 첫 번째가 아닌 주문
		// false : 첫 번째 주문
		
		while(menu != 9) {
			System.out.println("--- 메뉴 ---");
			System.out.println("1. 떡붂이(5000원)");
			System.out.println("2. 김밥(3000원)");
			System.out.println("3. 라면(4000원)");
			System.out.println("4. 돈까스(8000원)");
			System.out.println("9. 주문 완료");
			
			System.out.print("\n메뉴 선택 >> ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: 
				list += "떡볶이";
				sum += 5000;
				break;
			case 2: 
				list += "김밥";
				sum += 3000;
				break;
			case 3: 
				list += "라면";
				sum += 4000;
				break;
			case 4: 
				list += "돈까스";
				sum += 8000;
				break;
			case 9: 
				break;
			default: 
				System.out.println("잘못 입력하셨습니다.");
			}
			
			if(!flag && menu >= 1 && menu <= 4) { // true인 경우(첫 번째 주문)
				list += ", ";
			} else // false인 경우(첫 주문이 아닐 경우)
				flag = true;
		}
		
		System.out.println();
		System.out.print(list);
		System.out.println("을/를 주문하셨습니다.");
		System.out.println("총 가격은 " + sum + "입니다.");
	
	}
	
	

}
