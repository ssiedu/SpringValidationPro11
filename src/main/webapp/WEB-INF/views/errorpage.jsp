<%@taglib uri="http://www.springframework.org/tags/form" prefix="fr" %>

<html>
<body>
	<h3>Error-Messages</h3>
	<hr>
	
	<fr:errors path="emp.*"/>
	
	<hr>
	<a href="index.jsp">Home</a>
</body>
</html>