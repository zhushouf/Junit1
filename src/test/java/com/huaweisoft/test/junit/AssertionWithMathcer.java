package com.huaweisoft.test.junit;

import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.junit.Test;

public class AssertionWithMathcer {
	@Test
	public void test1() {
		assertThat("hello", is("hello"));

		List<Object> obj = new ArrayList<>();
		obj.add(new HashMap<>());
		obj.add(new HashMap<>());
		assertThat(obj, everyItem(notNullValue()));
	}

	@Test
	public void test2() {
		List<Map<String, Object>> obj = new ArrayList<>();
		obj.add(new HashMap<>());

		Map<String, Object> notBlank = new HashMap<>();
		notBlank.put("1", "1");
		obj.add(notBlank);
		assertThat(obj, everyItem(new IsBlankMapMatcher()));
	}

	class IsBlankMapMatcher extends BaseMatcher<Map<String, Object>> {

		@Override
		public boolean matches(Object item) {
			if (item == null) {
				return false;
			}
			if (item instanceof Map && ((Map) item).isEmpty()) {
				return true;
			}
			return false;
		}

		@Override
		public void describeTo(Description description) {
			description.appendText("空的HashMap");

		}

	}
}
