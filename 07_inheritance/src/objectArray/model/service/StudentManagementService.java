package objectArray.model.service;

import objectArray.model.vo.Student;

public class StudentManagementService {
	
	private Student[] stdArr = new Student[5];
	
	public StudentManagementService() {
		stdArr[0] = new Student(3, 5, 17, "홍길동", 100, 30, 70);
		stdArr[1] = new Student(2, 3, 11, "박철수", 50, 100, 80);
		stdArr[2] = new Student(1, 7, 3, "김미영", 100, 100, 30);
		stdArr[3] = new Student(3, 8, 6, "장원영", 50, 70, 100);
	}
	
	
	
	

	/** 학생 추가 메서드
	 * @return
	 * -1 : 배열이 꽉 차 학생을 추가할 수 없음
	 */
	public int addStudent(int grade, int classRoom, int number, String name) {
		for(int i = 0; i < stdArr.length; i++) {
			if(stdArr[stdArr.length - 1] != null) {
				break;
			}
			
			if(stdArr[i] == null) {
				stdArr[i] = new Student(grade, classRoom, number, name);
//				stdArr[i].setGrade(grade);
//				stdArr[i].setClassRoom(classRoom);
//				stdArr[i].setNumber(number);
//				stdArr[i].setName(name);
				
				return 1;
			}
			
		}
		return -1;
	}
	
	
	/** 학생 전체 정보 조회 메서드
	 * @return
	 * null : 조회할 학생이 인덱스에 아무도 없음
	 * str : 학생 정보 반영해 view에 전달
	 */
	public String lookUpAllStudent() {
		String str = "";
			
		if(stdArr[0] == null)
			return null;
		
		for(int i = 0; i < stdArr.length; i++) {
			if(stdArr[i] == null)
				break;
			
			str += stdArr[i].getName() + "학생 : (" + 
			stdArr[i].getGrade() + "학년 " + 
			stdArr[i].getClassRoom() + "반 " + 
			stdArr[i].getNumber() + "번) \n국어점수 : " + 
			stdArr[i].getKor() + "점 \n영어점수 : " + 
			stdArr[i].getEng() + "점 \n수학점수 : " + 
			stdArr[i].getMath() + "점\n\n";
			
			
		}
		return str;
		
	}
	
	/** 학생 1명 정보 조회(인덱스)
	 * @param idx
	 * @return str
	 */
	public String lookUpTheStudent(int idx) {
		if(idx < 0 || idx >= stdArr.length)
			return "학생의 인덱스를 잘못 입력하셨습니다";
		else if(stdArr[idx] == null)
			return "조회하려는 인덱스에 학생이 등록되어 있지 않습니다.";
		else {
			String str = "\n";
			str += stdArr[idx].getName() + "학생 : (" + 
					stdArr[idx].getGrade() + "학년 " + 
					stdArr[idx].getClassRoom() + "반 " + 
					stdArr[idx].getNumber() + "번) \n국어점수 : " + 
					stdArr[idx].getKor() + "점 \n영어점수 : " + 
					stdArr[idx].getEng() + "점 \n수학점수 : " + 
					stdArr[idx].getMath() + "점\n\n";
			
			return str;
		}
	}
	
	public String lookUpStudentByName(String name) {
		String str = "\n";
		for(int i = 0; i < stdArr.length; i++) {
			if(stdArr[i] == null) break;
			
			if(stdArr[i].getName().equals(name)) {
				str += stdArr[i].getName() + "학생 : (" + 
						stdArr[i].getGrade() + "학년 " + 
						stdArr[i].getClassRoom() + "반 " + 
						stdArr[i].getNumber() + "번) \n국어점수 : " + 
						stdArr[i].getKor() + "점 \n영어점수 : " + 
						stdArr[i].getEng() + "점 \n수학점수 : " + 
						stdArr[i].getMath() + "점\n\n";
				
			}
			
		}
		return str;
		
		
	}
	
	public int reviseStudentByIndex(int idx, int kor, int eng, int math) {
		if(idx < 0 || idx >= stdArr.length)
			return -1;
		else if(stdArr[idx] == null)
			return 0;
		else {
			stdArr[idx].setKor(kor);
			stdArr[idx].setEng(eng);
			stdArr[idx].setMath(math);
			
			return 1;
		}
	}
}
