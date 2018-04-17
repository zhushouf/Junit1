package com.huaweisoft.test.jmock;

import static org.junit.Assert.assertEquals;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;

import com.huaweisoft.lesson.UserResource;
import com.huaweisoft.lesson.UserService;


public class Mocker {

	@Test
	public void mock() {
		// 创建Jmock上下文
		Mockery context = new Mockery();
		final UserService userService = context.mock(UserService.class);

		context.checking(new Expectations() {
			{
				// getUserName方法，当参数为1的时候，返回"zhang san", 2则返回"li si"
				oneOf(userService).getUserName(1);
				will(returnValue("zhang san"));

				oneOf(userService).getUserName(2);
				will(returnValue("li si"));

			}
		});

		UserResource resource = new UserResource();
		resource.setUserService(userService);

		assertEquals("zhang san", resource.getUserNameById(1));

		assertEquals("li si", resource.getUserNameById(2));

	}
}
