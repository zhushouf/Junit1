package com.huaweisoft.test.junit;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestFixtures {

	private Map<String, Object> context = new HashMap<String, Object>();

	@Before
	public void init() {
		context.put("foo", "1");
		context.put("time", System.currentTimeMillis());
	}

	@After
	public void clean() {
		context.clear();
	}

	@Test
	public void TestStep1() {
		assertEquals(2, context.size());
		System.out.println(context.get("time"));
	}

	@Test
	public void TestStep2() {
		assertEquals(2, context.size());
		System.out.println(context.get("time"));
	}

}
