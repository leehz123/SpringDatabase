<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���� �ֹ� ��</title>
</head>
<body>

	<form action="" method="GET" id="pizza"></form>
	
	<h3>���� �ֹ� ��</h3> 
	
	<ul>
		<c:forEach items="${pizzas }" var="pizza">
			<li>
				<b>${pizza.p_name }</b> (${pizza.p_calories }kcal) - ${pizza.p_price }�� 
				/ ���� : <input type="number" form="pizza" style="width: 50px" min="0"/>
			</li>
			<hr />
		</c:forEach>
		<br />
		<input type="submit" value="�ֹ��ϱ�" id="pizza" />
		<p></p>
		<button onclick="window.location.href='<c:url value="/pizza/pizzamanager"/>'">������ ������</button>
	</ul>



	
	
	
	
	
	
</body>
</html>