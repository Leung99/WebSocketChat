package servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			String username= new String(request.getParameter("username").getBytes("iso-8859-1"), "utf-8");  
			String pwd= request.getParameter("pwd");
			System.out.println("servlet中用户名:"+username+"-密码:-"+pwd);
			
			HttpSession  session = request.getSession();
			session.setAttribute("user", username);
			
			response.sendRedirect("chat.jsp");
		
	}

}
