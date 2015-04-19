package com.healAssist.beans;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContactMessagesTest {

	@Test
	public void testGetContactId() {
		ContactMessages test = new ContactMessages();
		test.setContactId("john");
		assertEquals("john",test.getContactId());
	}

	@Test
	public void testSetContactId() {
		ContactMessages test = new ContactMessages();
		test.setContactId("john");
		assertEquals("john",test.getContactId());
	}

	@Test
	public void testGetUserId() {
		ContactMessages test = new ContactMessages();
		test.setUserId("smith");
		assertEquals("smith",test.getUserId());
	}

	@Test
	public void testSetUserId() {
		ContactMessages test = new ContactMessages();
		test.setUserId("smith");
		assertEquals("smith",test.getUserId());
	}

	@Test
	public void testGetUserToId() {
		ContactMessages test = new ContactMessages();
		test.setUserToId("john");
		assertEquals("john",test.getUserToId());
	}

	@Test
	public void testSetUserToId() {
		ContactMessages test = new ContactMessages();
		test.setUserToId("john");
		assertEquals("john",test.getUserToId());
	}

	@Test
	public void testGetContactMessage() {
		ContactMessages test = new ContactMessages();
		test.setContactMessage("health is important");
		assertEquals("health is important",test.getContactMessage());
	}

	@Test
	public void testSetContactMessage() {
		ContactMessages test = new ContactMessages();
		test.setContactMessage("health is important");
		assertEquals("health is important",test.getContactMessage());	
	}

	@Test
	public void testGetContactRepTo() {
		ContactMessages test = new ContactMessages();
		test.setContactRepTo("health is important");
		assertEquals("health is important",test.getContactRepTo());
	}

	@Test
	public void testSetContactRepTo() {
		ContactMessages test = new ContactMessages();
		test.setContactRepTo("health is important");
		assertEquals("health is important",test.getContactRepTo());
	}

	@Test
	public void testGetContactDateTime() {
		ContactMessages test = new ContactMessages();
		test.setContactDateTime("3/13/2015friday");
		assertEquals("3/13/2015friday",test.getContactDateTime());
	}

	@Test
	public void testSetContactDateTime() {
		ContactMessages test = new ContactMessages();
		test.setContactDateTime("3/13/2015friday");
		assertEquals("3/13/2015friday",test.getContactDateTime());
	}

	@Test
	public void testGetReadState() {
		ContactMessages test = new ContactMessages();
		test.setReadState("online");
		assertEquals("online",test.getReadState());
	}

	@Test
	public void testSetReadState() {
		ContactMessages test = new ContactMessages();
		test.setReadState("online");
		assertEquals("online",test.getReadState());
	}

}
