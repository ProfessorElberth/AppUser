<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>mvc: lista usuario</title>
</head>
<body>
	Listagem de usuários: 
	
	<c:forEach var="u" items="${usuariosLista}">
		<h4>${u.nome} (${u.login}) <a href="/usuario/excluir/${u.id}">excluir</a> </h4>
	</c:forEach>
</body>
</html>