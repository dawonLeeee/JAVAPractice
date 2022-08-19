package edu.kh.oop.method.model.service;

import edu.kh.oop.method.model.vo.User;

public class UserService {
	
	
	//회원가입 서비스 메서드
	//반환형이 클래스명 == 반환되는 값이 해당 클래스를 이용해서 만들어진 객체의 주소값이다
	public User signUp(String userId, String usrPw, String userName, int userAge, char userGender) {
		
		//기본 생성자를 이용해서 User객체를 생성
		User u = new User(); // -->텅 비어있다
		
		u.setUserId(userId);
		u.setUserPw(usrPw);
		u.setUserName(userName);
		u.setUserAge(userAge);
		u.setUserGender(userGender);
		
		return u; // User 객체의 시작주소를 반환
	}
	
	
	// 로그인 서비스
	public int login(String id, String pw, User user) {
		// 입력된 id/pw + 가입한 회원정보를 가지고 있는 객체의 주소
		
		//회원가입을 안 하고 로그인을 시도하는 경우
		if(user == null) {
			return -1;
			
		} else {
			// id/pw 비교
			if(user.getUserId().equals(id) && user.getUserPw().equals(pw)) {
				return 1;
			} else { // 하나라도 다름(로그인 실패)
				return 0;
			}
		}
	}
	
	public void update(String name, int age, char gender, User loginUser) {
		loginUser.setUserName(name);
		loginUser.setUserAge(age);
		loginUser.setUserGender(gender);
		
	}
	
}
