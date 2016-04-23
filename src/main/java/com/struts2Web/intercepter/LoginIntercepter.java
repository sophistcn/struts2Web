package com.struts2Web.intercepter;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * @author: Sophist Wu
 * @mailTo: sophistwu@outlook.com
 * @createDate: 2016年2月3日 下午2:46:44
 * @desc:
 * 
 */
public class LoginIntercepter extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Map<String, Object> session = invocation.getInvocationContext().getSession();
		String user = (String) session.get("user");
		System.out.println("11---------------- " + user);
		if ("".equals(user) || null == user) {
			System.out.println("22---------------- ");
			return Action.INPUT;
		} else {
			System.out.println(" 33---------------- " + user);
			return invocation.invoke();
		}
	}

}
