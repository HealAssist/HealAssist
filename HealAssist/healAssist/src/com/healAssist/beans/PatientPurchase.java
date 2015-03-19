package com.healAssist.beans;

public class PatientPurchase {
	private String userId;
	private String tabletId;
	private String number;
	private String purchaseDate;
	private String purchaseInfo;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTabletId() {
		return tabletId;
	}
	public void setTabletId(String tabletId) {
		this.tabletId = tabletId;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public String getPurchaseInfo() {
		return purchaseInfo;
	}
	public void setPurchaseInfo(String purchaseInfo) {
		this.purchaseInfo = purchaseInfo;
	}


}
