<%@ page contentType="text/html;charset=Shift_JIS"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div align="center">
<table class="header">
	<tr>
		<td width="160"><a href="../index/index.html">■一覧に戻る</a></td>
		<td width="160"><a href="../PurchaseHistory/PurchaseHistory.html">■精算画面へ進む</a></td>
		<td width="160"><a href="../cart/cartConfirm.html">■カートを確認する</a></td>
		<td width="160"><a href="../cart/cartClear.html">■カートを空にする</a></td>
		<td width="160"><c:choose>
			<c:when test="${not empty loginUser}">
				<font color="red">ようこそ、<br>
				<c:out value="${loginUser.userId}" />さん</font>
			</c:when>
			<c:when test="${empty loginUser}">
				<font color="red"><a href="../loginform/login.html">■ログインする</a></font>
			</c:when>
		</c:choose></td>
	</tr>
</table>
</div>
<hr>