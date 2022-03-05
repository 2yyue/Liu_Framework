package com.liu.fatey.servlet_jsp.Entity;

public class User {
	private int userId;
	private String userName;
	private String userPwd;
	private int userStatus;

	public int getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public int getUserStatus() {
		return userStatus;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}
}
