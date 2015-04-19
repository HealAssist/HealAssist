package com.healAssist.beans;

import static org.junit.Assert.*;

import org.junit.Test;

public class TabletDetailsTest {

	@Test
	public void testGetTabletId() {
		TabletDetails test = new TabletDetails();
		test.setTabletId("456");
		assertEquals("456",test.getTabletId());
	}

	@Test
	public void testSetTabletId() {
		
		TabletDetails test = new TabletDetails();
		test.setTabletId("456");
		assertEquals("456",test.getTabletId());
	}
	@Test
	public void testGetTabletName() {
		TabletDetails test = new TabletDetails();
		test.setTabletName("dolo");
		assertEquals("dolo",test.getTabletName());
	}

	@Test
	public void testSetTabletName() {
		TabletDetails test = new TabletDetails();
		test.setTabletName("dolo");
		assertEquals("dolo",test.getTabletName());
	}

	@Test
	public void testGetTabletBrand() {
		TabletDetails test = new TabletDetails();
		test.setTabletBrand("brnd");
		assertEquals("brnd",test.getTabletBrand());
	}

	@Test
	public void testSetTabletBrand() {
		TabletDetails test = new TabletDetails();
		test.setTabletBrand("brnd");
		assertEquals("brnd",test.getTabletBrand());
	}

}
