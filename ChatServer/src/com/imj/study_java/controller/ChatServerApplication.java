package com.imj.study_java.controller;

import java.util.logging.Logger;

import com.imj.study_java.template.ChatServerGUI;

/**
 * Chat program for learning Java.
 * 
 * @author In-mook,Jeong
 * @since 2021.01.31
 * @version 1.0.0
 */
public class ChatServerApplication {

	private final static Logger _log = Logger.getGlobal();
	
	public static void main(String[] args) {
		_log.info("##### Start Chatting Server.");
		
		// TODO Auto-generated method stub
		new ChatServerGUI().drawChatServerGUI();
	}
}
