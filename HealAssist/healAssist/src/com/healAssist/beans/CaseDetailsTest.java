package com.healAssist.beans;
import static org.junit.Assert.*;

import org.junit.Test;


public class CaseDetailsTest {

	@Test
	public void testGetCaseId() {
		CaseDetails test = new CaseDetails();
		test.setCaseId("john");
		assertEquals("john",test.getCaseId());
		
	}

	@Test
	public void testSetCaseId() {
		CaseDetails test = new CaseDetails();
		test.setCaseId("john");
		assertEquals("john",test.getCaseId());
	}

	@Test
	public void testGetUserId() {
		CaseDetails test = new CaseDetails();
		test.setUserId("name");
		assertEquals("name",test.getUserId());
	}

	@Test
	public void testSetUserId() {
		CaseDetails test = new CaseDetails();
		test.setUserId("name");
		assertEquals("name",test.getUserId());
	}

	@Test
	public void testGetDoctorId() {
		CaseDetails test = new CaseDetails();
		test.setDoctorId("bob");
		assertEquals("bob",test.getDoctorId());
	}

	@Test
	public void testSetDoctorId() {
		CaseDetails test = new CaseDetails();
		test.setDoctorId("bob");
		assertEquals("bob",test.getDoctorId());
	}

	@Test
	public void testGetCaseDate() {
		CaseDetails test = new CaseDetails();
		test.setCaseDate("3/13/2015");
		assertEquals("3/13/2015",test.getCaseDate());
	}

	@Test
	public void testSetCaseDate() {
		CaseDetails test = new CaseDetails();
		test.setCaseDate("3/13/2015");
		assertEquals("3/13/2015",test.getCaseDate());
	}

	@Test
	public void testGetCaseTitle() {
		CaseDetails test = new CaseDetails();
		test.setCaseTitle("cancer");
		assertEquals("cancer",test.getCaseTitle());
	}

	@Test
	public void testSetCaseTitle() {
		CaseDetails test = new CaseDetails();
		test.setCaseTitle("cancer");
		assertEquals("cancer",test.getCaseTitle());
	}

}
