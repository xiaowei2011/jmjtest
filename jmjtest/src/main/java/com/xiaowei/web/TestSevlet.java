package com.xiaowei.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xiaowei.service.TestService;

/**
 * @author sunweijie
 * @since 2018年6月7日 下午4:59:34
 */
public class TestSevlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	private TestService testService = TestService.newInstance();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("test jmj");
		testService.test();
		request.getRequestDispatcher("/WEB-INF/test.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int a = Integer.parseInt(request.getParameter("a"));
		int b = testService.getRandomInt(4);
		int c = a / b;
		String data = "{\"a\":\"" + a +"\",\"b\":\"" + b + "\",\"c\":\"" + c + "\"}";
		response.getWriter().print(data);
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("启动成功...");
	}
}
