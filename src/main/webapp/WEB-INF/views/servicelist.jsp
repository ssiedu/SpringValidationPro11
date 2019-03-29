<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<html>
<body>
	<h3>Services-Provided-By-Us</h3>
	<hr>
	<table border="2">
		<tr>
			<th>SCode</th>
			<th>SName</th>
			<th>Charge</th>
		</tr>
		<c:forEach items="${services}" var="service">
			<tr>
				<td>${service.scode}</td>
				<td>${service.sname}</td>
				<td align="right">${service.charge}</td>

				<c:url var="deleteLink" value="deleteservice">
					<c:param name="scode" value="${service.scode}" />
				</c:url>
				<td><a href="${deleteLink}">[X]</a></td>
				
				<c:url var="changeLink" value="updateservice">
					<c:param name="scode" value="${service.scode}" />
				</c:url>
				
				<td><a href="${changeLink}">change</a></td>
				
				
			</tr>
		</c:forEach>
	</table>
	<hr>
	<a href="adminhome">Admin-Home</a>

</body>
</html>