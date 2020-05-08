package cqut.yook.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.Servlet;

public class MyServlet implements Servlet {

	// 生命周期方法，在Servlet被销毁之前调用，并且它只会被调用一次
	@Override
	public void destroy() {
		System.out.println("destroy()");
	}

	// 用来获取Servlet的配置信息
	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig()");
		return null;
	}

	// 获取Servlet的信息
	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo()");
		return null;
	}

	// 生命周期方法，在Servlet对象创建后马上执行，并且只执行一次
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init()");
		// 获取初始化参数
		System.out.println(config.getInitParameter("p1"));
		System.out.println(config.getInitParameter("p2"));
		// 获取所有初始化参数名称
		Enumeration<String> e = config.getInitParameterNames();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

	// 生命周期方法，会被调用多次，每次处理请求都是在调用这个方法
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service()");
	}

}
