<%@ page contentType="text/html;charset=Shift_JIS"%>
<%@ include file="/WEB-INF/jsp/jsp_header.jsp"%>
<html>
<head>
<title>¸ZæÊ</title>
</head>
<body>
<%@ include file="/WEB-INF/jsp/cart_header.jsp"%>
<div align="center" class="body">
<h2>¸ZæÊ</h2>
<font color="red"><b>èæ</b></font>
<table>
	<tr>
		<td>[UID:</td>
		<td>${loginUser.userId}</td>
	</tr>
	<tr>
		<td>¨¼O:</td>
		<td>${loginUser.userName}l</td>
	</tr>
	<tr>
		<td>XÖÔ:</td>
		<td>${loginUser.postCode}</td>
	</tr>
	<tr>
		<td>²Z:</td>
		<td>${loginUser.address}</td>
	</tr>
	<tr>
		<td>E-MAIL:</td>
		<td>${loginUser.email}</td>
	</tr>
</table>
<br>
<br>
<font color="red"><b>¨¢ã°ê</b></font>
<table border="1">
	<tr>
		<th width="200">¤i¼</th>
		<th width="150">¿i</th>
		<th width="50">Â</th>
		<th width="150">¬v</th>
	</tr>
	<c:forEach items="${itemList}" var="itemSet">
		<tr>
			<td align="left">${itemSet.item.itemName}</td>
			<td align="right">${itemSet.item.price}~</td>
			<td align="right">${itemSet.quantity}Â</td>
			<td align="right">${itemSet.quantity * itemSet.item.price}~</td>
		</tr>
	</c:forEach>
</table>
<br>
<b>vàzF${totalAmount}~</b> <br>
<br>
<form action="../end/end.html"><input type="submit" name="btn1"
	value="mè"></form>
<a href="../index/index.html">¡êÉßé</a><br>
</div>
</body>
</html>