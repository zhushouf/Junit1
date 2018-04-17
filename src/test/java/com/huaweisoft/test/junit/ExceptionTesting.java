package com.huaweisoft.test.junit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionTesting {

	// 异常测试
//	@Test(expected = NullPointerException.class)
    @Test(expected=NullPointerException.class)
	public void testExpectedException() {
		// 故意抛出一个NullPointerException, 通过expceted表明，这个异常是预期异常
//		Object nullObj = null;
//		nullObj.toString();
	    int i = 1/0;
	}

	// 使用Rule
	// 需要定义Rule field
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void testExceptedExceptionWithRule() {
		thrown.expect(NullPointerException.class);
		Object nullObj = null;
		nullObj.toString();
	}
}
