<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formulario</title>
</head>
<body>
	<h3>Agregar Cuentas</h3>
	<form action="agregarCuenta" method="post">
		<form:errors path="cuenta.descripcion" />
		<br/>
		Descripcion: <br/>
		<textarea name="descripcion" rows="5" cols="100"></textarea>
		<br/>
		Valor: <input type="text" name="valor" /><br/>
		Tipo: <br/>
		<select name="tipo">
			<option value="INGRESO">Ingreso</option>
			<option value="SALIDA">Salida</option>
		</select>
		<br/><br/>
		<input type="submit" value="Agregar" />
	</form>
</body>
</html>