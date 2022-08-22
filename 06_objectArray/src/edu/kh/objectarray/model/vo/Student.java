package edu.kh.objectarray.model.vo;

//학생의 정보를 입력받아 관리하는 객체(값 저장용 클래스)
// ->객체로 만들어진 후 값을 저장하는 용도의 객체로 사용(데이터 관리)
//데이터 관리(model 패키지)에 포함
public class Student { // 변수 앞에 'Student'가 들어가는 것이 좋다
	
	//필드
	private int grade; // 학년
	private int classRoom; // 반
	private int number; // 번호
	private String name;
	
	private int kor; //국어점수
	private int eng; //영어점수
	private int math; // 수학점수
	
	public Student() {} // 기본생성자
	
	//매개변수 생성자
	public Student(int grade, int classRoom, int number, String name) {
		this.grade = grade;
		this.classRoom = classRoom;
		this.number = number;
		this.name = name;
	}
	
	//매개변수 생성자(오버로딩 적용)
	public Student(int grade, int classRoom, int number, String name, int kor, int eng, int math) {
		// 코드의 중복을 줄이기 위해 사용
		this(grade, classRoom, number, name);
		
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	//단축키 : alt + shift+ s 또는 Source메뉴
	// + r ( Generate Getters and Setters)
	
	
	
	public int getGrade() {
		return grade;
	}
	
	public int getClassRoom() {
		return classRoom;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	public int getKor() {
		return kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public int getMath() {
		return math;
	}
	
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	
}
