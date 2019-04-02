<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="fr" %>

<html>
<body>
	<h3>Provider Registration</h3>
	<fr:form action="saveprovider" modelAttribute="provider">
	<pre>
		Email <fr:input path="email"/>
		Pswrd <fr:password path="password"/>
		Name  <fr:input path="name"/>
		Addr  <fr:input path="address"/>
		Mob.  <fr:input path="mobile"/>
		SrCd  <fr:select path="service.scode" items="${scodes}"/>  
				<input type="submit" value="Register"/>
			</pre>
	</fr:form>
</body>
</html>