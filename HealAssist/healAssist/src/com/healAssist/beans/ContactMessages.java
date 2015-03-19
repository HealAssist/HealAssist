package com.healAssist.beans;


public class ContactMessages {
	private String contactId;
	private String userId;
	private String userToId;
	private String contactMessage;
	private String contactRepTo;
	private String contactDateTime;
	private String readState;

	public String getContactId() {
		return contactId;
	}
	public void setContactId(String contactId) {
		this.contactId = contactId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserToId() {
		return userToId;
	}
	public void setUserToId(String userToId) {
		this.userToId = userToId;
	}
	public String getContactMessage() {
		return contactMessage;
	}
	public void setContactMessage(String contactMessage) {
		this.contactMessage = contactMessage;
	}
	public String getContactRepTo() {
		return contactRepTo;
	}
	public void setContactRepTo(String contactRepTo) {
		this.contactRepTo = contactRepTo;
	}
	public String getContactDateTime() {
		return contactDateTime;
	}
	public void setContactDateTime(String contactDateTime) {
		this.contactDateTime = contactDateTime;
	}
	public String getReadState() {
		return readState;
	}
	public void setReadState(String readState) {
		this.readState = readState;
	}

}
