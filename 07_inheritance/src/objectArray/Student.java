package objectArray;

public class Student extends Person{
	
//	private String name;
//	private int age;
	private int grade;
	private int classroom;
	
	
	
	public Student() {
		
		super();
		// 자식 생성자 첫 번째 줄에 super() 생성자 미 작성시 컴파일러가 자동 추가
		
	}
	
	
	public Student(String name, int age, int grade, int classroom) {
		super();
		this.grade = grade;
		this.classroom = classroom;
	}

//
//	public String getName() {
//		return name;
//	}
//
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//	public int getAge() {
//		return age;
//	}
//
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//

	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public int getClassroom() {
		return classroom;
	}


	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	
	
	
	//person으로부터 상속받은 introduce()클래스 메서드 오버라이딩(재정의)
	@Override
	public void introduce(){
//		System.out.println("이름 : " + super.getName());
//		System.out.println("나이 : " + getAge());
		
		super.introduce();
		//오버라이딩 되지 않은 부모의 introduce()메서드 호출
		
		System.out.println("학년 : " + getGrade());
		System.out.println("반 : " + getClassroom());
		
	
	}	
	
	
	
	
	
	
	
	
	
}
