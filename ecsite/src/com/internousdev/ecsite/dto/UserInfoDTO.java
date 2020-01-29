package com.internousdev.ecsite.dto;

public class UserInfoDTO {
	private String id;
	private String login_id;
	private String login_pass;
	private String user_name;
	private String insert_date;
	private String updated_date;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getLoginId() {
		return login_id;
	}
	public void setLoginId(String login_id) {
		this.login_id = login_id;
	}

	public String getLoginPass() {
		return login_pass;
	}
	public void setLoginPass(String login_pass) {
		this.login_pass = login_pass;
	}

	public String getUserName() {
		return user_name;
	}
	public void setUserName(String user_name) {
		this.user_name = user_name;
	}

	public String getInsert_date() {
		return insert_date;
	}
	public void setInsert_date(String insert_date) {
		this.insert_date = insert_date;
	}

	public String getUpdate_date() {
		return updated_date;
	}
	public void setUpdated_date(String updated_date) {
		this.updated_date = updated_date;
	}

}
