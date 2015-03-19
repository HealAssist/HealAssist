package com.healAssist.beans;

import static org.junit.Assert.*;

import org.junit.Test;

public class CaseInformationTest {

	@Test
	public void testGetCaseId() {
		CaseInformation test = new CaseInformation();
		test.setCaseId("health");
		assertEquals("health",test.getCaseId());
		}

	@Test
	public void testSetCaseId() {
		CaseInformation test = new CaseInformation();
		test.setCaseId("health");
		assertEquals("health",test.getCaseId());
	}

	@Test
	public void testGetCaseRemarks() {
		CaseInformation test = new CaseInformation();
		test.setCaseRemarks("remarkinfo");
		assertEquals("remarkinfo",test.getCaseRemarks());
	}

	@Test
	public void testSetCaseRemarks() {
		CaseInformation test = new CaseInformation();
		test.setCaseRemarks("remarkinfo");
		assertEquals("remarkinfo",test.getCaseRemarks());
	}

	@Test
	public void testGetCaseDateTime() {
		CaseInformation test = new CaseInformation();
		test.setCaseDateTime("3/12/2015");
		assertEquals("3/12/2015",test.getCaseDateTime());
	}

	@Test
	public void testSetCaseDateTime() {
		CaseInformation test = new CaseInformation();
		test.setCaseDateTime("3/12/2015");
		assertEquals("3/12/2015",test.getCaseDateTime());
	}

}
