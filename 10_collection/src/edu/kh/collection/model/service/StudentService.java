package edu.kh.collection.model.service;

import java.util.ArrayList;
import java.util.List;

import edu.kh.collection.model.vo.Student;

public class StudentService {

	// 부모 타입 참조변수 List
	private List<Student> stdList = new ArrayList<>();
	// Studnet 타입으로 제한된 ArrayList 객체 생성

	/** stdList에 학생 정보 추가 메서드
	 * @param name
	 * @param age
	 * @param address
	 * @param gender
	 * @param score
	 * @return
	 * 	true : 학생정보 추가 성공시
	 * 	false : 학생정보 추가 실패시
	 */
	public boolean addStudent(String name, int age, String address, char gender, int score) {
		
		Student std = new Student(name, age, address, gender, score);
		return stdList.add(std);
		
		
//		
//		List test1 = new ArrayList<>();
//		List<String> test2 = new ArrayList<>();
//		List<Integer> test3 = new ArrayList<>();
		
		// List.add(E e) -> 제네릭<E>에 작성되는 타입으로 모든 E가 변화함
		// test1.add(Object e); -> 타입 제한X, 모든 참조변수가 Object 타입
		// test2.add(String e)  -> 타입 제한O, 모든 참조변수가 String 타입
		
		
		
	}

	public List<Student> getStdList() {
		return stdList;
	}

	public StudentService() {
		stdList.add(new Student("홍길동", 18, "서울시 강남구", 'M', 80));
		stdList.add(new Student("김갑갑", 20, "서울시 노원구", 'F', 70));
		stdList.add(new Student("김을을", 135, "서울시 금천구", 'M', 60));
		
	}

	/** 3. 학생 정보 수정
	 * @param index
	 * @param address
	 * @param score
	 * @return
	 *  - true : 인덱스가 일치하는 학생 정보 수정 성공시
	 *  - false : 인덱스가 일치하는 학생이 없을 경우
	 */
	public boolean updateStudent(int index, String address, int score) {
		
		if(index < 0 || index >= stdList.size())
			return false;
		else {
			stdList.get(index).setAddress(address);
			stdList.get(index).setScore(score);
			
			return true;
		}
		
		
	
	}

	/** 학생 정보 제거
	 * @param index
	 * 
	 * @return
	 */
	public Student removeStudent(int index) {
		if(index < 0 || index >= stdList.size())
			return null;
		else {
			// 리스트에서 제거된 요소를 반환
			return stdList.remove(index);

		}
		
		
		
	}

	/** 5. 이름으로 검색(일치)
	 * @param name
	 * @return
	 */
	public List<Student> selectStudent1(String name) {
		
		List<Student> resultList = new ArrayList<>();
		
		for(Student s : stdList) {
			if(s.getName().equals(name)) {
				resultList.add(s);
			}
		}
		return resultList;
		
	}
	
	
	/** 5. 이름으로 검색(포함)
	 * @param name
	 * @return
	 */
	public List<Student> selectStudent2(String name) {
		
		List<Student> resultList = new ArrayList<>();
		
		for(Student s : stdList) {
			if(s.getName().contains(name)) {
				resultList.add(s);
			}
		}
		return resultList;
		
	}
	
	
	
}
