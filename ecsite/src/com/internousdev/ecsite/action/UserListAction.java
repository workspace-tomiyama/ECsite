package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserListDAO;
import com.internousdev.ecsite.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;
	private List<UserInfoDTO> userInfoDTOList = new ArrayList<UserInfoDTO>();

	public String execute() throws SQLException {
		String result = SUCCESS;
		UserListDAO dao = new UserListDAO();
		userInfoDTOList = dao.getUserList();
		if (!(userInfoDTOList.size() > 0)) {
			userInfoDTOList = null;
		}
		return result;
	}

	public List<UserInfoDTO> getUserInfoDTOList() {
		return userInfoDTOList;
	}
	public void setUserInfoDTOList(List<UserInfoDTO> userInfoDTOList) {
		this.userInfoDTOList = userInfoDTOList;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public Map<String, Object> getSession() {
		return session;
	}

}
