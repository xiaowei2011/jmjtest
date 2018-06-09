package com.xiaowei.service;

import java.util.Random;

/**
 * @author sunweijie
 * @since 2018年6月7日 下午7:51:54
 */
public class TestService {
	
	Random random;
	
	private static TestService testService = new TestService();
	
	private TestService() {
		random = new Random();
		System.out.println("create TestService success");
	}
	
	public static TestService newInstance() {
		return testService;
	}
	
	public int getRandomInt(int bound) {
		return random.nextInt(bound);
	}
	
	public void test() {
		System.out.println(random.nextInt(2) / random.nextInt(2));
	}
}
