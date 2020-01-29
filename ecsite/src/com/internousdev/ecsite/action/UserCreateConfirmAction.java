package com.internousdev.ecsite.action;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserCreateConfirmDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware {
	private String loginUserId;
	private String loginPassword;
	private String userName;
	private String adminFlg;
	private Map<String, Object> session;
	private String errorMessage;

	public String execute() throws SQLException {
		String result = SUCCESS;
		if(!(loginUserId.equals("")) && !(loginPassword.equals("")) && !(userName.equals(""))) {
			UserCreateConfirmDAO dao = new UserCreateConfirmDAO();
			if (!(dao.existUser(loginUserId))){
				session.put("loginUserId", loginUserId);
				session.put("loginPassword", loginPassword);
				session.put("userName", userName);
				//0を入れるとNULL値とみなされてしまう
				session.put("adminFlg", "2");
			} else {
				setErrorMessage("すでに登録されているログインIDです。");
				result = ERROR;
			}
		} else {
			setErrorMessage("未記入の項目があります。");
			result = ERROR;
		}
	return result;
	}

	public String getLoginUserId() {
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAdminFlg() {
		return adminFlg;
	}
	public void setAdminFlg(String adminFlg) {
		this.adminFlg = adminFlg;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}

}
