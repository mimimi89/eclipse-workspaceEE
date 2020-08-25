﻿package com.itwill.user;

import com.itwill.user.exception.ExistedUserException;
import com.itwill.user.exception.UserNotFoundException;
import com.itwill.user.exception.PasswordMismatchException;

/*
 * - 회원관리 비즈니스로직(예외처리,트랜젝션,보안,로깅)을 수행하는 클래스
 * - 웹컴퍼넌트(서블릿,JSP)에서 직접접근(메쏘드호출)하는 클래스
 * - Dao를 이용해서 데이타베이스를 조작작업하는 클래스
 */

public class UserService {
	private UserDao userDao;
	
	public UserService() throws Exception{
		userDao=new UserDao();
	}
	/*
	 * 회원가입
	 */
	public int create(User user)throws Exception,ExistedUserException{
		//1. 아이디 중복체크
		if(userDao.existedUser(user.getUserId())) {
			throw new ExistedUserException(user.getUserId()+"는 이미 존재하는 아이디입니다.");
		}
		return userDao.create(user);
	}
	
	/*
	 * 회원리스트
	 */
	
	/*
	 * 아이디중복체크
	 * 
	 */
	
	/*
	 * 회원 로그인
	 */
	public User login(String userId, String password)throws Exception, UserNotFoundException, PasswordMismatchException{
		//1. 아이디 존재 여부
		User user=userDao.findUser(userId);
		if(user==null) {
			throw new UserNotFoundException(userId+"는 존재하지 않는 아이디입니다.");
		}
		//2. 비밀번호 일치 여부
		if(!user.isMatchPassword(password)){
			throw new PasswordMismatchException("비밀번호가 일치하지 않습니다.");
		}

		return user;
		
		
	}
	
	/*
	 * 회원1명보기
	 */
	
	/*
	 * 회원탈퇴
	 */
	
	/*
	 * 회원수정
	 */
	
	
}




