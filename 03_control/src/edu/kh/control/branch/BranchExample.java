package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {
	public void ex4() {
		// continue : 다음 반복으로 넘어감
		// 1부터 30까지 5의 배수를 제외하고 출력(continue 사용)
		
		int i = 1;
		while(i-- <= 30) {
			while(i % 5 == 0) 
				continue;
			System.out.println(i);
		}
	}
	
	public void ex5() {
		// 1~100까지 1씩 증가하며 출력하는 반복문
		// 단, 5의 배수는 건너뛰고
		// 증가하는 값이 40이 되었을 때 출력 후 반복을 멈춤
		
		
		for(int i = 1; i <= 100; i++) {
			if(i == 40) {
				System.out.println(i);
				break;
			}
			if(i % 5 == 0) continue;
			System.out.println(i);
		}
		
	}
	
	public void upDownGame() {
		//프로그램 시작 시 1~50사이의 임의의 수(난수)를 하나 생성하여
		//사용자가 몇 회 만에 맞추는지 카운트
		//만약 틀렸을 경우 난수가 입력한 수보다 크면 UP / 작으면 DOWN 출력
		
		
		/*난수 생성 : Math.random
		 * 
		 * 
		 */
		

		Scanner sc = new Scanner(System.in);
		int num;
		int count = 0;
		
		int correct = (int)(Math.random() * 50 + 1);
		
		
		while(true){
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
			count++;
			
			if(num < correct) {
				
				System.out.println("UP\n");
			} else if(num > correct){
				
				System.out.println("DOWN\n");
			} else
				break;
		} 
			
		
		
		System.out.println(count + "회 만에 맞췄습니다!");	
	}
	
	public void rspGame() {
		Scanner sc = new Scanner(System.in);
		String str = "";
		int count = 1;
		
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		int computer = -1;
		int player = -1;
		String rsp = "";
		
		int rock = 1;
		int scissor = 2;
		int paper = 3;
		boolean flag = false;
		
		
		System.out.println("가위 바위 보 게임");
		System.out.print("몇판? : ");
		int pan = sc.nextInt();
		
		while(pan-->0){
			System.out.println(count++ + "번째 게임");
			System.out.print("가위/바위/보 중 하나를 입력 해주세요 :  ");
			str = sc.next();
			
			computer = (int) ((Math.random()) * 3 + 1) ;
			rsp = computer == 1? "가위" : (computer == 2 ? "바위" : "보");
			System.out.printf("컴퓨터는 [%s]를 선택했습니다\n", rsp);
		
			
			switch(str) {
				case "가위": player = 1; break;
				case "바위": player = 2; break;
				case "보": player = 3; break;
			}
			
			if(player == computer) {
				System.out.println("비겼습니다.");
				draw++;
			}
			else if(
					(player == 1 && computer == 3) ||
					(player == 2 && computer == 1) ||
					(player == 3 && computer == 2))
				flag = true;
			else
				flag = false;
			
			
			if(flag) {
				System.out.println("플레이어 승!");
				win++;
			} else {
				System.out.println("졌습니다ㅠㅠ");
				lose++;
			
			}
				
			
			
			System.out.printf("현재 기록 : %d승 %d무 %d패\n\n", win, draw, lose);
		}
				 
	}
}
