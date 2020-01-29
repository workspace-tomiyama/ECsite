package com.internousdev.ecsite.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateConfirmAction extends ActionSupport implements SessionAware {
	private String itemName;
	private String itemPrice;
	private String itemCount;
	private Map<String, Object> session;
	private String errorMessage;

	public String execute() {
		String result = SUCCESS;
		if(!(itemName.equals("")) && !(itemPrice.equals("")) && !(itemCount.equals(""))) {
		session.put("itemName", itemName);
		session.put("itemPrice", itemPrice);
		session.put("itemCount", itemCount);
		} else {
			setErrorMessage("未記入の項目があります。");
			result = ERROR;
		}
	return result;
	}

	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getItemCount() {
		return itemCount;
	}
	public void setItemCount(String itemCount) {
		this.itemCount = itemCount;
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
