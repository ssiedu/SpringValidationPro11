<%@page import="com.ssi.entities.Service"%>
<%@page import="java.util.List"%>
<%@ page isELIgnored="false"%>


<%
	List<Service> serviceList=(List<Service>)request.getAttribute("services");
%>

<html>
<body>

<table border="2">
<tr>
<th>SCode</th><th>SName</th><th>Charge</th>
<tr>

<%
	for(Service service:serviceList){
		String scode=service.getScode();
		String sname=service.getSname();
		int charge=service.getCharge();
		
%>
<tr>
<td><%=scode%></td>
<td><%=sname%></td>
<td><%=charge%></td>
</tr>
<%
	}
%>

</table>
<hr>
<a href="adminhome">Admin-Home</a>

</body>
</html>