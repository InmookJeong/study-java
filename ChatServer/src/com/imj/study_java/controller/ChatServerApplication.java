package com.imj.study_java.controller;

import java.util.logging.Logger;

import com.imj.study_java.template.ChatServerGUI;

/**
 * Chat program for learning Java.
 * Java 학습을 위한 채팅 프로그램.
 * 
 * @author In-mook,Jeong
 * @since 2021.01.31
 * @version 1.0.0
 */
public class ChatServerApplication {
	
	/*
	 * 프로그램 동작 및 에러 확인을 위한 로그 생성.
	 * 
	 * - 기능이 정상적으로 동작하는지, 어떤 에러가 발생하는지 확인하기 위해
	 * - Controller, Service, Dao를 만들 때 꼭 로그를 추가하도록 한다.
	 * 
	 * - 자신만의 변수명에 대한 규칙이 있으면 개발에 도움이 될듯 하다.
	 * - ex) private 타입의 변수명은 _(Under bar)로 시작
	 *       final 변수는 대문자 및 스네이크 표기법으로 작성 : USER_NAME, USER_ADDR 등
	 */
	private final static Logger _LOG = Logger.getGlobal();
	
	// Chat Server Application Start Point.
	public static void main(String[] args) {
		/*
		 * LOG는 오류 위험도에 따라 다양하게 사용할 수 있으며, 주로 info, debug, warn, severe, error을 많이 사용한다.
		 * 
		 * - info(message) : 위험도가 없는 기본 정보를 출력할 때 사용.
		 * - debug : 기능 동작에 대한 Debugging을 하기 위해 사용.
		 * - warn : 기능 오류가 발생할 가능성이 있는 경우 경고하기 위해 사용.
		 * - severe(error) : 기능 오류가 발생할 경우 사용.
		 * 
		 * - java util에서 기본으로 제공하는 Logger는 debug, error 함수가 없다.
		 * - debug, error 함수를 사용하기 위해서는 log4J와 같은 라이브러리를 활용하자.
		 */
		_LOG.info("##### Start Chatting Server.");
		
		// TODO Auto-generated method stub
		new ChatServerGUI().drawChatServerGUI();
	}
}
