package com.huaweisoft.test.junit;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParameterizedTest {

	// 参数化测试要求将参数放入Collection容器，此方法必须是一个Parameters标记的静态 方法
	@Parameters(name = "{index}: [{0}]的[{0}]次方={1}")
	public static Iterable<Object[]> data() {
		return Arrays.asList(new Object[][] { { 0, 1 }, { 2, 5 }, { 3, 27 }, { 4, 256 } });
	}

	// 需要声明相应类型的变量，在构造方法中取回指定参数
	private double fInput;

	private double fExpected;

	public ParameterizedTest(int input, int expected) {
		fInput = input;
		fExpected = expected;
	}

	@Test
	public void test() {
		assertEquals(fExpected, ParameterizedTest.pow(fInput), 0);
	}

	public static double pow(double i) {
		return Math.pow(i, i);
	}
}
