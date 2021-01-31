package com.imj.study_java.model;

/**
 * Chat Room Model.
 * 채팅방 모델.
 * 
 * @author In-mook,Jeong
 * @since 2021.01.31
 * @version 1.0.0
 */
public class ChatRoom {
	
	/*
	 * 채팅방 생성 시 필요한 정보(Field)
	 * 
	 * - 채팅방 ID, 채팅방 이름
	 * - 채팅방을 만든 사용자 ID, 채팅방을 만든 사용자 이름
	 * - 현재 접속중인 참여자 수, 최대 접속 가능 참여자 수
	 */
	private long id;						// Chat Room's ID.
	private String name;					// Chat Room's Name.
	private long userId;					// Created User ID.
	private String userName;				// Created User Name.
	private int numberOfParticipants;		// Current Number of Participants.
	private int maxNumberOfParticipants;	// Max Number of Participants.
	
	/* 
	 * Default Constructor
	 * 
	 * - 생성자가 없는 경우 기본 생성자를 명시하지 않아도 자동으로 만들어진다.
	 * - 단, 사용자가 정의한 생성자가 있는 경우 아래와 같이 명시해줘야 기본 생성자가 만들어진다.
	 */
	public ChatRoom() {}
	
	/*
	 *  Constructor for setting ID, Name, Created User ID, Created User Name and Number of participants, Max Number of Participants.
	 *  채팅방 ID, 채팅방 이름, 채팅방을 만든 사용자 정보, 현재 접속중인 참여자 수, 최대 접속 가능한 참여자 수를 세팅하기 위한 생성자.
	 */
	public ChatRoom(long id, String name, long userId, String userName, int numberOfParticipants, int maxNumberOfParticipants) {
		this.id = id;
		this.name = name;
		this.userId = userId;
		this.userName = userName;
		this.numberOfParticipants = numberOfParticipants;
		this.maxNumberOfParticipants = maxNumberOfParticipants;
	}
	
	 /* 
	 * 채팅방 생성 시 필요한 정보를 설정하거나 조회하기 위한 접근/제어자 생성
	 */
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getNumberOfParticipants() {
		return numberOfParticipants;
	}

	public void setNumberOfParticipants(int numberOfParticipants) {
		this.numberOfParticipants = numberOfParticipants;
	}
	
	public int getMaxNumberOfParticipants() {
		return maxNumberOfParticipants;
	}

	public void setMaxNumberOfParticipants(int maxNumberOfParticipants) {
		this.maxNumberOfParticipants = maxNumberOfParticipants;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ChatRoom [id=").append(id).append(", name=").append(name).append(", userId=").append(userId)
				.append(", userName=").append(userName).append(", numberOfParticipants=").append(numberOfParticipants)
				.append(", maxNumberOfParticipants=").append(maxNumberOfParticipants).append("]");
		return builder.toString();
	}
}
