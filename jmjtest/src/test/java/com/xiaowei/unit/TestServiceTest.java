package com.xiaowei.unit;

import org.junit.Test;

import com.xiaowei.service.TestService;

/**
 * @author sunweijie
 * @since 2018年6月7日 下午7:59:58
 */
public class TestServiceTest {
	
	private TestService testService = TestService.newInstance();
	
	@Test
	public void test() {
		testService.test();
	}
}
