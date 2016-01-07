package com.struts2Web.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2Web.domain.User;

public class UserAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7927481140388182554L;
	private static final Logger log = LoggerFactory.getLogger(UserAction.class);
	private User user;

	public String execute() {
		if (null != user) {
			log.debug(user.toString());
		}

		return "SUCCESS";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}