package com.huaweisoft.test.junit;

import org.junit.Ignore;
import org.junit.Test;

public class IgnoreTesting {
	protected String tes_2;

	@Test
	public void test_2() {
		System.out.println("test1");
	}

	@Test
	@Ignore
	public void test2() {
		System.out.println("test2");
	}
}
