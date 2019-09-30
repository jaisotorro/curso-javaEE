package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Factura")
public class Factura extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String prod = request.getParameter("producto");
		int uds = Integer.parseInt(request.getParameter("unidades"));
		double precio = Double.parseDouble(request.getParameter("unidades"));
		int iva = Integer.parseInt(request.getParameter("unidades"));
		out.println("<html><body><center>");
		out.println("Has comprado "+uds+" de "+prod);
		out.println("Tptal: "+(uds*precio*iva));
		
	}

}
