<%@page import="com.esisa.projet.sport.models.Material"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="../index.html">Home</a>
	<%
	
	List<Material> material = (List<Material>)request.getAttribute("model");
	%>
	<table border="1" class="Titles">
	<tr style="background-color: navy; color:white;">
		<th width="120">ISBN</th>
		<th>Titre</th>
		<th width="70">Edition</th>
		<th width="120">ISBN</th>
		<th>Titre</th>
		<th width="70">Edition</th>
	</tr>
	
	<%
	for(Material m: material)
	{
	%>
		<tr>
			<td><%=m.getId() %></td>
			<td><%=m.getName() %></td>
			<td><%=m.getCategorie() %></td>
			<td><%=m.getMarque() %></td>
			<td><%=m.getPoids() %></td>
			<td><%=m.getDimensions() %></td>
		</tr>
	<%
	}
	%>
	</table>
</body>
</html>