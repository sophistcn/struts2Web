package com.struts2Web.domain;

/**
* @author: ��־ƽ
* @mailTo: sophistwu@outlook.com
* @createDate: 2016��1��7�� ����6:42:19 
* @desc: 
* 
*/
public class User {
	private String userName;
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + "]";
	}
	
	
}
