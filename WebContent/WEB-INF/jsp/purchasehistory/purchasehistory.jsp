<%@ page contentType="text/html;charset=Shift_JIS"%>
<%@ include file="/WEB-INF/jsp/jsp_header.jsp"%>
<html>
<head>
<title>�w���������</title>
</head>
<body>
<%@ include file="/WEB-INF/jsp/cart_header.jsp"%>
<div align="center" class="body">
<h2>�w���������</h2>
<table border="1">
	<tr class="header">
		<th align="center" width="320">�w������</th>
		<th align="center" width="80">���iID</th>
		<th align="center" width="240">���i��</th>
		<th align="center" width="80">��</th>
		<th align="center" width="160">���i</th>
	</tr>
  <c:forEach items="${allHistory}" var="history">
		    <tr class="record">
			<td align="left">${history.updateTime}</td>
			<td align="center">${history.itemId}</td>
			<td align="left">${history.itemName}</td>
			<td align="right">${history.quantity}</td>
			<td align="right">${history.quantity * history.price}�~</td>
		</tr>
  </c:forEach>

</table>
<a href="../index/index.html">���ꗗ�ɖ߂�</a></div>
</body>
</html>