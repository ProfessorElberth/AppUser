<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>mvc: detalhe usuario</title>
</head>
<body>
	<form action="/usuario" method="post">
		Nome:<input type="text" name="nome">
		Login:<input type="text" name="login">
		Senha:<input type="password" name="senha">
		Email:<input type="text" name="email">
		whatsapp:<input type="text" name="whatsapp">		
		<input type="submit" value="Cadastrar"> 
	</form>
</body>
</html>