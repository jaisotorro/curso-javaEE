<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"% import="model.Persona"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%Persona persona = (Persona)request.getAttribute("persona"); %>
	Usuario: <%persona.getUsuario(); %>
	Email: <%persona.getEmail(); %>
	Edad: <%persona.getEdad(); %>
</body>
</html>