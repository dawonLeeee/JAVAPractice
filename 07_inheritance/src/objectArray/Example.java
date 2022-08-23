package objectArray;

public class Example {
	
	
	public void ex1() {
		Person p1 = new Person();
		System.out.println(p1.hashCode());
//		->Object 클래스는 모든 클래스의 최상위 부모다
//		 == 모든 클래스는 Object클래스의 후손이다
		
		Student s1 = new Student();
		s1.setGrade(2);
		s1.setClassroom(2);
		s1.setName("김개똥");
		s1.setAge(15);
	}
	
	// 오버라이딩 : 재정의
	public void ex2() {
		Person p1 = new Person("홍길동", 15);
		Student s1 = new Student("김학생", 17, 1, 15);
		
		p1.introduce();
		s1.introduce();
	}
}

// extends Object -> 상속 구문이 작성되지 않으면 컴파일러가 자동 추가
