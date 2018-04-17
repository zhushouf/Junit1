package com.huaweisoft.test.junit;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Assertion {
	@Test
	public void testAssertEquals() {
		assertEquals("failure - strings are not equal", "text1", "text");
		System.out.println("------");
		assertEquals("text", "text");
	}

	@Test
	public void testAssertFalse() {
		assertFalse("failure - should be false", false);
		System.out.println("--------------");
		assertTrue(false);
	}

	@Test
	public void testAssertNotNull() {
		assertNotNull("should not be null", null);
	}
}
