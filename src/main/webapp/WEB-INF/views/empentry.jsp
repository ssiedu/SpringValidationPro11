<%@taglib uri="http://www.springframework.org/tags/form" prefix="fr" %>
<html>
<body>
<h3>Emp Entry Form</h3>
<hr>
	<fr:form action="saveemp" modelAttribute="emp">
	<pre>
		ECode	<fr:input path="eno"/> <b><fr:errors path="eno"/></b>
		Name	<fr:input path="ename"/> <b><fr:errors path="ename"/></b>
		Salary 	<fr:input path="sal"/> <b><fr:errors path="sal"/></b>
		Email 	<fr:input path="email"/> <b><fr:errors path="email"/></b>
			<input type="submit" value="Save"/>
	</pre>			
	</fr:form>
<hr>
<a href="index.jsp">Home</a>
</body>
</html>