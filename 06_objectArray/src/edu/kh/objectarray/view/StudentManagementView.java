package edu.kh.objectarray.view;

import java.util.Scanner;

import edu.kh.objectarray.model.service.StudentManagementService;
import edu.kh.objectarray.model.vo.Student;

// 화면 제공용 클래스(입/출력)
public class StudentManagementView {

	private Scanner sc = new Scanner(System.in);
	
	private StudentManagementService service = new StudentManagementService();
	
	
	// 메서드명에 커서 올려놓고 alt + shift + j =>주석 생성(tool tip)
	/**
	 * 메뉴 출력용 메서드
	 */
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
				printAll();
				break;
			case 3: // 학생 1명 정보 조회(인덱스)
				selectIndex();
				break;
			case 4: //학생 정보 조회(이름 검색)
				selectName();
				break;
			case 5: //학생 정보 수정(인덱스)
				
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
	 * 추가할 학생정보 입력용 메서드
	 */
	public void addStudent() {
		System.out.println("[학생 추가]\n");
		
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		
		System.out.print("반 : ");
		int classRoom = sc.nextInt();
		
		System.out.print("학년 : ");
		int number = sc.nextInt();
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		int result = service.addStudent(grade, classRoom, number, name);
		if(result == 0) { // 대입할 주소가 없을 경우
			System.out.println("더 이상 학생을 추가할 수 없습니다.");
		} else {
			System.out.println("학생 정보가 추가되었습니다.");
		}
	}
	
	/**
	 *  학생 정보 모두 출력하기
	 */
	public void printAll() {
		System.out.println("[학생 전체 정보 조회]\n");
		
		// |  학년  |   반  |  번호  |  이름  |  국어  |  영어  | 수학  |
		//=======================================================
		// |   3   |   5  |   17  | 홍길동 |  100  |  30   |  70  |
		
		// 서비스 객체 필드에 존재하는 stdArr의 값(student[] 참조 주소)를 얻어와 대입
		Student[] stdArr = service.getStudent();
	

		
		System.out.println("|  학년  |   반  |  번호  |  이름  |  국어  |  영어  | 수학  |");
		System.out.println("=======================================================");
		
		
		for(int i = 0; i < stdArr.length; i++) {
			if(stdArr[i] == null) break;
			
			System.out.printf("|  %2d  |  %2d  |  %2d  | %2s |  %3d  |  %3d  |  %3d  |\n", 
					stdArr[i].getGrade(), 
					stdArr[i].getClassRoom(),
					stdArr[i].getNumber(),
					stdArr[i].getName(),
					stdArr[i].getKor(),
					stdArr[i].getEng(),
					stdArr[i].getMath());
			
		}
		
	}
	
	/**
	 * 학생 1명 정보 조회(인덱스)
	 */
	public void selectIndex() { // select == 조회
		System.out.println("[학생 1명 정보 조회(인덱스)]\n");
		
		System.out.println("인덱스 번호 : ");
		int idx = sc.nextInt();
		
		//학생 1명 정보 조회 서비스 메서드 호출
		String result = service.selectIndex(idx);
		System.out.println(result);
	}

	public void updateStudent() { // 국어.영어.수학 점수만 수정
		System.out.println("[학생 정보 수정(인덱스)]\n");
		System.out.print("인덱스 : ");
		int idx = sc.nextInt();
		
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		
		
		// 학생 정보 수정 서비스 메소드 호출 후 결과 반환받기
		int result = service.updateStudent(idx, kor, eng, math);
		
		if(result == -1)
			System.out.println("잘못된 인덱스를 입력하셨습니다");
		else if(result == 0)
			System.out.println("입력하신 인덱스의 학생 정보가 없습니다");
		else 
			System.out.println("학생 정보가 정상적으로 수정되었습니다");
	}
	
	/** 
	 * 학생 정보 조회(이름) 메서드
	 */
	public void selectName() {
		System.out.println("[학생 정보 조회(이름)]\n");
		System.out.print("조회할 학생의 이름을 입력하세요 : ");
		String name = sc.next();
		
		Student[] resultArr = service.selectName(name);
		
		if(resultArr == null)
			System.out.println("검색 결과가 없습니다.");
		else {
			for(int i = 0; i < resultArr.length; i++) {
				if(resultArr[i] == null)
					break;
				
				
				// 홍길동(3학년 5반 17번)
				System.out.printf("%s(%d학년 %d반 %d번)\n",
					resultArr[i].getName(),
					resultArr[i].getGrade(),
					resultArr[i].getClassRoom(),
					resultArr[i].getNumber());
					
			}
		}
	}
	

}
