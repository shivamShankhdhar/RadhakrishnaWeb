package auth;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		HttpSession s = request.getSession();
		s.setAttribute("opearator_id", null);
		s.setAttribute("is_admin", false);
		s.setAttribute("loggedIn", false);
		s.setAttribute("message", null);
		s.setAttribute("idFailedAttempt", null);
		s.invalidate();
		response.sendRedirect("login.jsp");
	}
}
