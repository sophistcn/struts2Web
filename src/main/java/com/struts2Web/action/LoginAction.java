package com.struts2Web.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author: Sophist Wu
 * @mailTo: sophistwu@outlook.com
 * @createDate: 2016年2月3日 下午2:46:44
 * @desc:
 * 
 */
public class LoginAction extends ActionSupport {
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
	public String execute() throws Exception {
		System.out.println("开始执行execute()");
		Map<String, Object> map = ActionContext.getContext().getSession();
		String user = (String) map.get("user");
		System.out.println("The user'name is ---------- " + user);
		return SUCCESS;
	}
}
