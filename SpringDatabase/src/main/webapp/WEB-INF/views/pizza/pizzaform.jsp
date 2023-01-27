<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>피자 주문 폼</title>
</head>
<body>

	<form action="" method="GET" id="pizza"></form>
	
	<h3>피자 주문 폼</h3> 
	
	<ul>
		<c:forEach items="${pizzas }" var="pizza">
			<li>
				<b>${pizza.p_name }</b> (${pizza.p_calories }kcal) - ${pizza.p_price }원 
				/ 수량 : <input type="number" form="pizza" style="width: 50px" min="0"/>
			</li>
			<hr />
		</c:forEach>
		<br />
		<input type="submit" value="주문하기" id="pizza" />
		<p></p>
		<button onclick="window.location.href='<c:url value="/pizza/pizzamanager"/>'">관리자 페이지</button>
	</ul>



	
	
	
	
	
	
</body>
</html>