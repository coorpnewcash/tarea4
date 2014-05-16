<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Menu</title>
</head>
<body>
	<h2>Pagina inicial de la lista de cuentas</h2>
	<p>Bienvenido, ${usuarioLogueado.login}</p>
	<h3>Prueba con Servlet 3.0 - Spring MVC 4 - Jetty - Gradle</h3>
	<br />
	<a href="flashScope">Flash Scope</a>
	<br />
	<a href="form">Agregar Cuentas</a>
	<br />
	<a href="listarCuentas">Clic aquí</a> para acceder a la lista de
	cuentas.
	<br />
	<br />
	<a href="logout">Salir</a>	
</body>
</html>