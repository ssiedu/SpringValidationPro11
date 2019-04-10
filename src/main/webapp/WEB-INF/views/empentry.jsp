<%@taglib uri="http://www.springframework.org/tags/form" prefix="fr" %>
<html>
<body>
<h3>Emp Entry Form</h3>
<hr>
	<fr:form action="saveemp" modelAttribute="emp">
	<pre>
		ECode	<fr:input path="eno"/> <fr:errors path="eno"/>
		Name	<fr:input path="ename"/>
		Salary 	<fr:input path="sal"/> <fr:errors path="sal"/>
		Email 	<fr:input path="email"/>
			<input type="submit" value="Save"/>
	</pre>			
	</fr:form>
<hr>
<a href="index.jsp">Home</a>
</body>
</html>