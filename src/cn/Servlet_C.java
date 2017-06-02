package cn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.User;

public class Servlet_C extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
         response.setContentType("text/html;charset=utf-8");
         PrintWriter out=response.getWriter();
         String user=request.getParameter("user"); 
         String psd=request.getParameter("psd");
         User user1=new User();
         user1.setUser(user);
         user1.setPsd(psd);
         
         if(user1.login()){
        	 out.print("<script Language='javaScript'>window.alert('登录成功!!!!!')</script>");
        	 out.print("<a href='/day6_2/view/login.jsp'>返回</a>");
         }else{
        	 out.print("<script Language='javaScript'>window.alert('登录失败。。。。再试一遍不')</script>");
        	 out.print("<a href='/day6_2/view/login.jsp'>返回</a>");
        	// out.print("<a href='${pageContext.request.contextPath}/view/login.jsp'>返回</a>");
         }
         
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}

}
