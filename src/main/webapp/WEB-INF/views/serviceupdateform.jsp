<%@taglib uri="http://www.springframework.org/tags/form"  prefix="fr" %>
<html>
<body>
<h3>Service-Update-Form</h3>
<fr:form action="saveservicechanges" modelAttribute="service">
<pre>
	SCode	<fr:input path="scode"/>
	SName	<fr:input path="sname"/>
	Charge	<fr:input path="charge"/>
		<input type="submit" value="SaveChanges"/>
</pre>		
</fr:form>
</body>
</html>