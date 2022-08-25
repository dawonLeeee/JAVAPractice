package edu.kh.collection.model.service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import edu.kh.collection.model.vo.Student;

public class SetService {

	/* Set(집합)
	 *  - 순서를 유지하지 않음(인덱스X)
	 *  - 중복 데이터 저장 불가 (null도 1개만 저장 가능)
	 *  
	 * 
	 */
	
	public void ex1() {
		
		Set<String> set = new HashSet<>();
		
		set.add("네이버");
		set.add("카카오");
		set.add("라인");
		set.add("쿠팡");
		set.add("배달의민족");
		set.add("당근마켓");
		set.add("토스");
		set.add("직방");
		set.add("야놀자");
		set.add("야놀자");
		set.add("야놀자");
		set.add("야놀자");
		
		// remove(Object value)
		// : set에 저장된 객체 중 value가 같은 객체 제거
		// -> boolean 반환(제거되면 true, 안되면 false)
		set.remove("야놀자");
		
		
		// set에 저장된 요소를 하나씩 얻어오기
		// 1. Iterator(반복자)
		// --> Collection에서 제공하는 컬렉션 객체 반복접근자
		// --> Collection에 저장된 객체를 임의의 순서로 하나씩 꺼내는 역할
		Iterator<String> iter = set.iterator();
		// set.iterator();
		// set에 저장된 객체를 이용해서 iterator객체를 만들어 반환
		
		
		System.out.println(set.toString());
		
		while(iter.hasNext()) {
			String temp = iter.next();
			System.out.println(temp);
		}
		
		// 2. 향상된 for문을 이용한 방법
		for(String s : set)
			System.out.println(s);
	}
	
	public void ex2() {
		
		/*
		 * Set에 저장된 객체가 중복임을 판단하는 방법
		 * 
		 * - 필드에 저장된 값이 모두 일치하면 중복으로 판단
		 * 	-->중복 판단에 사용하는 메서드 : Object.equals메서드의 오버라이딩된 메서드
		 * 	----> Student 오버라이딩
		 * 
		 * Hash라는 단어가 붙은 컬렉션이 중복을 판단하는 방법
		 * -> Object.hashCode() 오버라이딩
		 * 
		 * Hash함수 : 입력된 단어를 지정된 길이의 무작위 문자열로 변환하는 함수
		 * hashCode() : 객체에 저장된 필드를 이용해 만들어진 정수
		 * 
		 * 
		 * HashSet -> equals(), hashCode() 둘 다 오버라이딩 되어 있어야 함
		 * -> equals() 또는 hashCode()를 오버라이딩 하면 나머지 하나도 반드시 오버라이딩 해라
		 */
		
		
		
		Set<Student> set = new HashSet<>();
		set.add(new Student("홍길동", 15, "서울시 중구", 'M', 50));
		set.add(new Student("김갑갑", 20, "서울시 노원구", 'F', 70));
		set.add(new Student("홍길동", 15, "서울시 중구", 'M', 50));
		
		for(Student s : set)
			System.out.println(s);

	}
	
	public void ex3() {
		
		// TreeSet : 오름차순으로 정렬되고 중복이 제거되는 Set
		

		/* Wrapper Class
		 * 컬렉션은 객체만 저장 가능(기본자료형X)
		 *  -->컬렉션에 기본 자료형도 저장할 수 있는 방법 필요
		 *  -->기본 자료형을 포장하여 객체로 만듦
		 *  
		 *  boolean -> Boolean
		 *  byte -> Byte
		 *  short -> Short
		 *  int -> Integer
		 *  long -> Long
		 *  float -> Float
		 *  double -> Double
		 *  char -> Character
		 *  
		 *  Wrapper클래스는 기본자료형 값 + 추가필드, 메서드 제공
		 */
		System.out.println(Integer.MAX_VALUE);
		
		// 문자열이지만 내용이 모두 숫자인 문자열이 존재 -->Wrapper 클래스의 parseXXX를 이용해 변경가능
		int num1 = Integer.parseInt("123");
		System.out.println(num1 + 100); // 223
				
		double num2 = Double.parseDouble("12.123");
		System.out.println(num2 + 100); // 112.123
		
		// parsing : 데이터의 형식 자체를 바꾸는 것
		
		// AutoBoxing(자동 포장)
		Integer i1 = 10; // Integer = new Integer(int)로 컴파일러가 바꿔줌
		
		// AutoUnBoxing(자동 포장해제)
		int i2 = i1; // int = Integer.intValue()
		
		
		
		
		
		Set<Integer> lotto = new TreeSet<Integer>();
		// Integer : int의 Wrapper class
		
		while(lotto.size() <= 6) {
			int ran = (int)(Math.random() * 45 + 1); // 1~45 난수
			
			lotto.add(ran);
		}
		System.out.println("로또 번호 출력 " + lotto.toString());
	}
	
}
