<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ShowVendorDetail</title>
<link rel="stylesheet" type="text/css" href="Style/table.css">
</head>
<body>

<%
String id = request.getParameter("userId");
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "medicalshop";
String userId = "root";
String password = "root";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>


	<table id="details">
		<tr>
			<th>S.no.</th>
			<th>Vendor name</th>
			<th>Purchase history</th>
			<th>Contact purpose</th>
			<th>Contact no.</th>
			<th>Address</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		
<%
try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
String sql ="SELECT * FROM medicalshop.vendor_table";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
		

		
<tr bgcolor = #C0C0C0>
<td><%=resultSet.getString("s_no") %></td>
<td><%=resultSet.getString("vendor_name") %></td>
<td><%=resultSet.getString("purchase_history") %></td>  
<td><%=resultSet.getString("contact_purpose") %></td>
<td><%=resultSet.getString("contact_no") %></td>
<td><%=resultSet.getString("address") %></td>   
<td><a href="#">update</a></td>
<td><a href="#">delete</a></td>
</tr>
<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>


	</table>
	<br/><a href="welcome.jsp">go back to home page</a>  
	
</body>
</html>