package servlets_devops;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String uid=(String)request.getParameter("userid");
		String upwd=(String)request.getParameter("userpwd");
		int x=testing(uid,upwd);
		if(x==1) {
			RequestDispatcher rd =  request.getRequestDispatcher("loginSuccess.jsp");
			rd.forward(request, response);
		}
		else {
			System.out.println("inside");
			RequestDispatcher rd =  request.getRequestDispatcher("loginFailed.jsp");
			rd.forward(request, response);
		}
	}
	public int testing(String uid, String upwd) {
		System.out.println("before");
		if(uid.equalsIgnoreCase("admin") && upwd.equalsIgnoreCase("admin")) {
			
			return 1;
		}
		return 0;
	}

}
