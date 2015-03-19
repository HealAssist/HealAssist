package com.healAssist.beans;

import static org.junit.Assert.*;

import org.junit.Test;

public class PatientConsumptionTest {

	@Test
	public void testGetUserId() {
		PatientConsumption test = new PatientConsumption();
		test.setUserId("john");
		assertEquals("john",test.getUserId());
	}

	@Test
	public void testSetUserId() {
		PatientConsumption test = new PatientConsumption();
		test.setUserId("john");
		assertEquals("john",test.getUserId());
	}

	@Test
	public void testGetCourseId() {
		PatientConsumption test = new PatientConsumption();
		test.setCourseId("health");
		assertEquals("health",test.getCourseId());
	}

	@Test
	public void testSetCourseId() {
		PatientConsumption test = new PatientConsumption();
		test.setCourseId("health");
		assertEquals("health",test.getCourseId());
	}

	@Test
	public void testGetDateTime() {
		PatientConsumption test = new PatientConsumption();
		test.setDateTime("3/12/2015:9:45");
		assertEquals("3/12/2015:9:45",test.getDateTime());
	}

	@Test
	public void testSetDateTime() {
		PatientConsumption test = new PatientConsumption();
		test.setDateTime("3/12/2015:9:45");
		assertEquals("3/12/2015:9:45",test.getDateTime());
	}

	@Test
	public void testGetRemarks() {
		PatientConsumption test = new PatientConsumption();
		test.setRemarks("abouthealth");
		assertEquals("abouthealth",test.getRemarks());
	}

	@Test
	public void testSetRemarks() {
		PatientConsumption test = new PatientConsumption();
		test.setRemarks("abouthealth");
		assertEquals("abouthealth",test.getRemarks());
	}

}
