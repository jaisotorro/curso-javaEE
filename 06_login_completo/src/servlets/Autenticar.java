package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Persona;

/**
 * Servlet implementation class Autenticar
 */
@WebServlet("/Autenticar")
public class Autenticar extends HttpServlet {
	Persona persona = new Persona("admin", "admin@hotmail.com", 30);
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("user");
		String pwd=request.getParameter("pwd");
		RequestDispatcher rd;
		if(user.equals("admin")&&pwd.equals("admin")) {
			request.setAttribute("persona", persona);
			rd=request.getRequestDispatcher("Bienvenida.jsp");
		}else {
			rd=request.getRequestDispatcher("Error");
		}
		rd.forward(request, response);
	
	}

	
}
