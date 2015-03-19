package com.healAssist.beans;

import static org.junit.Assert.*;

import org.junit.Test;

public class CourseDetailsTest {

	@Test
	public void testGetCourseId() {
		CourseDetails test = new CourseDetails();
		test.setCourseId("health");
		assertEquals("health",test.getCourseId());
	}

	@Test
	public void testSetCourseId() {
		CourseDetails test = new CourseDetails();
		test.setCourseId("health");
		assertEquals("health",test.getCourseId());
	}

	@Test
	public void testGetPrescriptionId() {
		CourseDetails test = new CourseDetails();
		test.setPrescriptionId("pres4");
		assertEquals("pres4",test.getPrescriptionId());
	}

	@Test
	public void testSetPrescriptionId() {
		CourseDetails test = new CourseDetails();
		test.setPrescriptionId("pres4");
		assertEquals("pres4",test.getPrescriptionId());
	}

	@Test
	public void testGetTabletId() {
		CourseDetails test = new CourseDetails();
		test.setTabletId("dolo");
		assertEquals("dolo",test.getTabletId());
	}

	@Test
	public void testSetTabletId() {
		CourseDetails test = new CourseDetails();
		test.setTabletId("dolo");
		assertEquals("dolo",test.getTabletId());
	}

	@Test
	public void testGetNoOfTimesDay() {
		CourseDetails test = new CourseDetails();
		test.setNoOfTimesDay("three");
		assertEquals("three",test.getNoOfTimesDay());
	}

	@Test
	public void testSetNoOfTimesDay() {
		CourseDetails test = new CourseDetails();
		test.setNoOfTimesDay("three");
		assertEquals("three",test.getNoOfTimesDay());
	}

	@Test
	public void testGetStartDate() {
		CourseDetails test = new CourseDetails();
		test.setStartDate("3/20/2015");
		assertEquals("3/20/2015",test.getStartDate());
	}

	@Test
	public void testSetStartDate() {
		CourseDetails test = new CourseDetails();
		test.setStartDate("3/20/2015");
		assertEquals("3/20/2015",test.getStartDate());
	}

	@Test
	public void testGetEndDate() {
		CourseDetails test = new CourseDetails();
		test.setEndDate("5/20/2015");
		assertEquals("5/20/2015",test.getEndDate());
	}

	@Test
	public void testSetEndDate() {
		CourseDetails test = new CourseDetails();
		test.setEndDate("5/20/2015");
		assertEquals("5/20/2015",test.getEndDate());
	}

}
