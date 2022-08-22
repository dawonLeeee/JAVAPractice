package objectArray.view;

import java.util.Scanner;

import objectArray.model.service.StudentManagementService;

public class StudentManagementView {

	private Scanner sc = new Scanner(System.in);
	private StudentManagementService service = new StudentManagementService();
	
	public void displayMenu() {
		
		int input = 0; // 메뉴 선택용 변수
		
		do {
			
			System.out.println("----- [학생 관리 프로그램] -----");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 전체 정보 조회");
			System.out.println("3. 학생 1명 정보 조회(인덱스)");
			System.out.println("4. 학생 정보 조회(이름 검색)");
			System.out.println("5. 학생 정보 수정(인덱스)");
			System.out.println("0. 종료");
			
			System.out.println();
			
			System.out.print("메뉴 선택 >>");
			input = sc.nextInt();
			sc.nextLine(); // 개행문자 제거
			
			System.out.println();
			switch(input) {
			case 1: // 학생 추가
				addStudent();
				break;
			case 2: //학생 전체 정보 조회
				lookUpAllStudent();
				break;
			case 3: // 학생 1명 정보 조회(인덱스)
				lookUpTheStudent();
				break;
			case 4: //학생 정보 조회(이름 검색)
				 lookUpStudentByName();
				break;
			case 5: //학생 정보 수정(인덱스)
				reviseStudentByIndex();
				break;
			case 0: 
				System.out.println("<<프로그램을 종료합니다>>");
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
					
			}
			System.out.println();
			
		} while(input != 0);
		
	
	}
	
	/**
	 * 학생 추가 메서드
	 */
	public void addStudent() {
		System.out.println("[학생 추가]");
		
		System.out.print("학생 이름 :");
		String name = sc.next();
		
		System.out.print("학생 학년 :");
		int grade = sc.nextInt();
		
		System.out.print("학생 반 :");
		int classRoom = sc.nextInt();
		
		System.out.print("학생 번호 :");
		int number = sc.nextInt();
		
		int result = service.addStudent(grade, classRoom, number, name);
		
		if(result == -1)
			System.out.println("학생이 너무 많아 새 학생을 추가할 수 없습니다.");
		else
			System.out.println("학생 추가 완료");
		
	}
	
	
	/**
	 * 학생 전체 정보 조회 메서드
	 */
	public void lookUpAllStudent() {
		System.out.println("[학생 전체 정보 조회]");
		
		if(service.lookUpAllStudent() == null)
			System.out.println("조회할 학생이 아무도 없습니다.");
		else
			System.out.println(service.lookUpAllStudent());
	}
	
	/**
	 * 학생 1명 정보 조회(인덱스)
	 */
	public void lookUpTheStudent() {
		System.out.println("[학생 1명 정보 조회(인덱스)]");
		
		System.out.print("학생 인덱스 :");
		int idx = sc.nextInt();
		
		System.out.println(service.lookUpTheStudent(idx));
	}
	
	/**
	 * 학생 정보 조회(이름 검색)
	 */
	public void lookUpStudentByName() {
		System.out.println("[학생 1명 정보 조회(인덱스)]");
		
		System.out.print("학생 이름 :");
		String name = sc.next();
		
		String result = service.lookUpStudentByName(name);
		if(result.equals("\n"))
			System.out.println("조회할 이름이 학생 리스트에 없습니다.");
		else
			System.out.println(result);
	}
	
	/**
	 * 학생 정보 수정(인덱스) 메서드
	 */
	public void reviseStudentByIndex() {
		System.out.println("[학생 정보 수정(인덱스)]");
		
		System.out.print("학생 인덱스 :");
		int idx = sc.nextInt();
		
		
		
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		
		int result = service.reviseStudentByIndex(idx, kor, eng, math);
		
		if(result == -1)
			System.out.println("학생의 인덱스를 잘못 입력하셨습니다");
		else if(result == 0)
			System.out.println("조회하려는 인덱스에 학생이 등록되어 있지 않습니다.");
		else
			System.out.println("학생 점수가 수정되었습니다.");
			
		
	}
}
