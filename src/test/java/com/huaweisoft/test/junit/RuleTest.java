package com.huaweisoft.test.junit;


import java.util.concurrent.TimeUnit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

public class RuleTest {
	public static String log;

	@Rule
	public TestRule globalTimeout = new Timeout(200, TimeUnit.MILLISECONDS);

	@Test
	public void testInfiniteLoop1() {
		log += "ran1";
		for (;;) {
		}
	}

	@Test
	public void testInfiniteLoop2() {
		log += "ran2";
		for (;;) {
			break;
		}
	}


}
