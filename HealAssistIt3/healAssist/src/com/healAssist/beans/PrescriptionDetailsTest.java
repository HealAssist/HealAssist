package com.healAssist.beans;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrescriptionDetailsTest {

	@Test
	public void testGetPrescriptionId() {
		PrescriptionDetails test = new PrescriptionDetails();
		test.setPrescriptionId("pres4");
		assertEquals("pres4",test.getPrescriptionId());
	}

	@Test
	public void testSetPrescriptionId() {
		PrescriptionDetails test = new PrescriptionDetails();
		test.setPrescriptionId("pres4");
		assertEquals("pres4",test.getPrescriptionId());
	}

	@Test
	public void testGetCaseId() {
		PrescriptionDetails test = new PrescriptionDetails();
		test.setCaseId("twenty");
		assertEquals("twenty",test.getCaseId());
	}

	@Test
	public void testSetCaseId() {
		PrescriptionDetails test = new PrescriptionDetails();
		test.setCaseId("twenty");
		assertEquals("twenty",test.getCaseId());
	}

	@Test
	public void testGetPrescriptioDate() {
		PrescriptionDetails test = new PrescriptionDetails();
		test.setPrescriptioDate("3/20/2015");
		assertEquals("3/20/2015",test.getPrescriptioDate());
	}

	@Test
	public void testSetPrescriptioDate() {
		PrescriptionDetails test = new PrescriptionDetails();
		test.setPrescriptioDate("3/20/2015");
		assertEquals("3/20/2015",test.getPrescriptioDate());
	}

	@Test
	public void testGetPrescriptionRemarks() {
		PrescriptionDetails test = new PrescriptionDetails();
		test.setPrescriptionRemarks("abouthealth");
		assertEquals("abouthealth",test.getPrescriptionRemarks());
	}

	@Test
	public void testSetPrescriptionRemarks() {
		PrescriptionDetails test = new PrescriptionDetails();
		test.setPrescriptionRemarks("abouthealth");
		assertEquals("abouthealth",test.getPrescriptionRemarks());
	}

}
