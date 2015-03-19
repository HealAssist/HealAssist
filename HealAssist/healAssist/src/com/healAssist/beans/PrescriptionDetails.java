package com.healAssist.beans;

import java.util.ArrayList;
import java.util.List;

public class PrescriptionDetails {

	private String prescriptionId;
	private String caseId;
	private String prescriptioDate;
	private String prescriptionRemarks;
	private List<CourseDetails> courses = new ArrayList<CourseDetails>();
	
	public String getPrescriptionId() {
		return prescriptionId;
	}
	public void setPrescriptionId(String prescriptionId) {
		this.prescriptionId = prescriptionId;
	}
	public String getCaseId() {
		return caseId;
	}
	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}
	public String getPrescriptioDate() {
		return prescriptioDate;
	}
	public void setPrescriptioDate(String prescriptioDate) {
		this.prescriptioDate = prescriptioDate;
	}
	public String getPrescriptionRemarks() {
		return prescriptionRemarks;
	}
	public void setPrescriptionRemarks(String prescriptionRemarks) {
		this.prescriptionRemarks = prescriptionRemarks;
	}
	public List<CourseDetails> getCourses() {
		return courses;
	}
	public void setCourses(List<CourseDetails> courses) {
		this.courses = courses;
	}

}
