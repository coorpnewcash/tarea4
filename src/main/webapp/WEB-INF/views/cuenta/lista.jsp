<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script src="resources/js/jquery.js"></script>
<html>
<head>
<title>Listado Cuentas</title>
</head>
<body>
	<table style="height: 10px; width: 775px;" border="1">
		<tr>
			<th>Codigo</th>
			<th>Descripcion</th>
			<th>Valor</th>
			<th>Tipo</th>
			<th>¿Pago?</th>
			<th>Fecha de Pago</th>
			<th>Acciones</th>
		</tr>
		<c:forEach items="${cuentas}" var="cuenta">
			<tr>
				<td>${cuenta.id}</td>
				<td>${cuenta.descripcion}</td>
				<td>${cuenta.valor}</td>
				<td>${cuenta.tipo}</td>
				<td id="cuenta_${cuenta.id}"><c:if
						test="${cuenta.pago eq false}">No pago!</c:if> <c:if
						test="${cuenta.pago eq true}">Pago!</c:if></td>
				<td><fmt:formatDate value="${cuenta.fechaPago.time}"
						pattern="dd/MM/yyyy" /></td>
				<td><a href="eliminarCuenta?id=${cuenta.id}">Eliminar</a> | <a
					href="#" onclick="pagarAhora(${cuenta.id});">Pagar</a> <a
					href="muestraCuenta?id=${cuenta.id}">Modificar</a></td>
			</tr>

		</c:forEach>
	</table>
	<br/>
	<script>
		function fueHecho(datosRespuesta){
			alert("Cuenta pagada con éxito");
		}
	
		function pagarAhora(id){
			//$.get("pagarCuenta?id="+id,fueHecho);
			$.post("pagarCuenta", {'id': id}, 
				function(){
					$("#cuenta_"+id).html("Pago");
				}
			);
		}
	</script>

</body>
</html>