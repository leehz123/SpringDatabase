<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>관리자 페이지</title>
</head>
<body>

<h3>피자 메뉴 추가 </h3>

<form action="./addpizza" method="GET">
	이름 : <input type="text" name="p_name"/>
	가격 : <input type="number" name="p_price"/>
	칼로리 : <input type="number" name="p_calories" step="0.01"/>
	<input type="submit" value="추가"/>
</form>




<h3>피자 메뉴 삭제</h3>
<form action="./deletepizza" method="GET">
	<select name="deletePizza">
		<c:forEach items="${pizzas }" var="pizza">
			<option value="${pizza.p_id }">${pizza.p_name }</option>
		</c:forEach>
	</select>
	<input type="submit" value="삭제" />
</form>




<h3>피자 메뉴 수정 </h3>

<form action="./updateselect">
	<select name="updateselect" id="selectBox" onchange="change()">
		<c:forEach items="${pizzas }" var="pizza">
			  <option value="${pizza.p_id }">${pizza.p_name }</option>
		</c:forEach>	
	</select>
	<input type="submit" value="선택" />
</form>

<p> </p>	
<form action="./updatepizza" method="GET">
	이름 : <input type="text" name="newName" value="${updatePizza.p_name }"/>
	가격 : <input type="number" name="newPrice" value="${updatePizza.p_price }"/>
	칼로리 : <input type="number" name="newCalories" value="${updatePizza.p_calories }" step="0.01"/>
	<input type="submit" value="수정" />
</form>


</body>
</html>