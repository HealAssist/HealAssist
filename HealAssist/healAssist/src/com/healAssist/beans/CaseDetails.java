package com.healAssist.beans;

import java.util.ArrayList;
import java.util.List;


public class CaseDetails {
	private String caseId;
	private String userId;
	private String doctorId;
	private String caseDate;
	private String caseTitle;
	private String caseInfo;
	private List<PrescriptionDetails> prescriptions = new ArrayList<PrescriptionDetails>();
	
	public String getCaseId() {
		return caseId;
	}
	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getCaseDate() {
		return caseDate;
	}
	public void setCaseDate(String caseDate) {
		this.caseDate = caseDate;
	}
	public String getCaseTitle() {
		return caseTitle;
	}
	public void setCaseTitle(String caseTitle) {
		this.caseTitle = caseTitle;
	}
	public List<PrescriptionDetails> getPrescriptions() {
		return prescriptions;
	}
	public void setPrescriptions(List<PrescriptionDetails> prescriptions) {
		this.prescriptions = prescriptions;
	}
	public String getCaseInfo() {
		return caseInfo;
	}
	public void setCaseInfo(String caseInfo) {
		this.caseInfo = caseInfo;
	}

	
	

}
