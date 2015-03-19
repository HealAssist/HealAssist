package com.healAssist.beans;

import static org.junit.Assert.*;

import org.junit.Test;

public class PatientPurchaseTest {

	@Test
	public void testGetUserId() {
		PatientPurchase test = new PatientPurchase();
		test.setUserId("john");
		assertEquals("john",test.getUserId());
	}

	@Test
	public void testSetUserId() {
		PatientPurchase test = new PatientPurchase();
		test.setUserId("john");
		assertEquals("john",test.getUserId());
	}

	@Test
	public void testGetTabletId() {
		PatientPurchase test = new PatientPurchase();
		test.setTabletId("dolo");
		assertEquals("dolo",test.getTabletId());
	}

	@Test
	public void testSetTabletId() {
		PatientPurchase test = new PatientPurchase();
		test.setTabletId("dolo");
		assertEquals("dolo",test.getTabletId());
	}

	@Test
	public void testGetNumber() {
		PatientPurchase test = new PatientPurchase();
		test.setNumber("four");
		assertEquals("four",test.getNumber());
	}

	@Test
	public void testSetNumber() {
		PatientPurchase test = new PatientPurchase();
		test.setNumber("four");
		assertEquals("four",test.getNumber());
	}

	@Test
	public void testGetPurchaseDate() {
		PatientPurchase test = new PatientPurchase();
		test.setPurchaseDate("3/15/2015");
		assertEquals("3/15/2015",test.getPurchaseDate());
	}

	@Test
	public void testSetPurchaseDate() {
		PatientPurchase test = new PatientPurchase();
		test.setPurchaseDate("3/15/2015");
		assertEquals("3/15/2015",test.getPurchaseDate());
	}

	@Test
	public void testGetPurchaseInfo() {
		PatientPurchase test = new PatientPurchase();
		test.setPurchaseInfo("information");
		assertEquals("information",test.getPurchaseInfo());
	}

	@Test
	public void testSetPurchaseInfo() {
		PatientPurchase test = new PatientPurchase();
		test.setPurchaseInfo("information");
		assertEquals("information",test.getPurchaseInfo());
	}

}
