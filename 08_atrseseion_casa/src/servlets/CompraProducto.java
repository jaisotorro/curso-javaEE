package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.PedidoProducto;

/**
 * Servlet implementation class CompraProducto
 */
@WebServlet("/CompraProducto")
public class CompraProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CompraProducto() {
        // TODO Auto-generated constructor stub 
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		int unidades = Integer.parseInt(request.getParameter("unidades"));
		double precio = Double.parseDouble(request.getParameter("precio"));
		PedidoProducto pedProd = new PedidoProducto(nombre,unidades,precio);
		
		/* ¿crear objeto?
		 * HttpSession sesion = request.getSession();
		 * sesion.setAtribute("PedidoProducto",PedidoProducto);
		 * 
		 * ¿o objeto implicito?
		 * Session.setAtribute("PedidoProducto",PedidoProducto);
		 * 
		 * ¿y como establezco un nuevo atributo de sesion (en el mismo objeto sesion)
		 *  para cada peticion?
		 */ 
	}

}
