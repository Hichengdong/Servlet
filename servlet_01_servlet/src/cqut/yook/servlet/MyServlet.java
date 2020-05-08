package cqut.yook.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.Servlet;

public class MyServlet implements Servlet {

	// �������ڷ�������Servlet������֮ǰ���ã�������ֻ�ᱻ����һ��
	@Override
	public void destroy() {
		System.out.println("destroy()");
	}

	// ������ȡServlet��������Ϣ
	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig()");
		return null;
	}

	// ��ȡServlet����Ϣ
	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo()");
		return null;
	}

	// �������ڷ�������Servlet���󴴽�������ִ�У�����ִֻ��һ��
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init()");
		// ��ȡ��ʼ������
		System.out.println(config.getInitParameter("p1"));
		System.out.println(config.getInitParameter("p2"));
		// ��ȡ���г�ʼ����������
		Enumeration<String> e = config.getInitParameterNames();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

	// �������ڷ������ᱻ���ö�Σ�ÿ�δ����������ڵ����������
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service()");
	}

}
