<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import=%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de productos pedidos</title>
</head>
<body>
	
	<h1>Listado de productos pedidos</h1>

	<table>
	<tr><th>Producto</th><th>Unidades</th><th>Precio</th></tr>
	<%
	HttpSession sesion = request.getSession();
	ArrayList<PedidoProducto> listaProductos = sesion.getAttribute("listaProductos");
	for (PedidoProducto pedProd:listaProductos){
	%>
		<tr>
			<<td><%=pedProd.getNombre()%></td>
			<<td><%=pedProd.getUnidades()%></td>
			<<td><%=pedProd.getPrecio()%></td>
		</tr>	
	<% } %>
	</table>
	
</body>
</html>