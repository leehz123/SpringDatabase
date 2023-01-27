<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>������ ������</title>
</head>
<body>

<h3>���� �޴� �߰� </h3>

<form action="./addpizza" method="GET">
	�̸� : <input type="text" name="p_name"/>
	���� : <input type="number" name="p_price"/>
	Į�θ� : <input type="number" name="p_calories" step="0.01"/>
	<input type="submit" value="�߰�"/>
</form>




<h3>���� �޴� ����</h3>
<form action="./deletepizza" method="GET">
	<select name="deletePizza">
		<c:forEach items="${pizzas }" var="pizza">
			<option value="${pizza.p_id }">${pizza.p_name }</option>
		</c:forEach>
	</select>
	<input type="submit" value="����" />
</form>




<h3>���� �޴� ���� </h3>

<form action="./updateselect">
	<select name="updateselect" id="selectBox" onchange="change()">
		<c:forEach items="${pizzas }" var="pizza">
			  <option value="${pizza.p_id }">${pizza.p_name }</option>
		</c:forEach>	
	</select>
	<input type="submit" value="����" />
</form>

<p> </p>	
<form action="./updatepizza" method="GET">
	�̸� : <input type="text" name="newName" value="${updatePizza.p_name }"/>
	���� : <input type="number" name="newPrice" value="${updatePizza.p_price }"/>
	Į�θ� : <input type="number" name="newCalories" value="${updatePizza.p_calories }" step="0.01"/>
	<input type="submit" value="����" />
</form>


</body>
</html>