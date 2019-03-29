<%@  page isELIgnored="false" %>
<html>
<body>
	<h4>Service Added Successfully</h4>
	<h5>Following Details Stored</h5>
	<hr>
		<pre>
			SCode	${service.scode}
			SName	${service.sname}
			Charge	${service.charge}
		</pre>
	<hr>
	<a href="newservice">Add-Another-Service</a><br>
	<a href="adminhome">Admin-Home</a><br>
</body>
</html>