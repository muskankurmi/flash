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
<title>ShowinvoiceDetail</title>
<link rel="stylesheet" type="text/css" href="Style/table.css">
</head>
<body>
<div class="header">
		<h2>
			<b><u>Welcome to MediCare</u></b>
		</h2>
		<p>we're happy to serve you</p>
	</div>



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
			<th>batch_no</th>
			<th>Customer_name</th>
			<th>email</th>
			<th>date</th>
			<th>payment_method</th>
			<th>item</th>
			<th>expiry_date</th>
			<th>quantity</th>
			<th>price</th>
			<th>gst</th>
			<th>discount</th>
			<th>final_amount</th>
			<th>total</th>
			<th>generate</th>
		</tr>

		<%
			try {
			connection = DriverManager.getConnection(connectionUrl + dbName, userId, password);
			statement = connection.createStatement();
			String sql = "SELECT * FROM medicalshop.bill";

			resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
		%>

		<tr bgcolor=#C0C0C0>
			<td><%=resultSet.getString("batch_no")%></td>
			<td><%=resultSet.getString("name")%></td>
			<td><%=resultSet.getString("email")%></td>
			<td><%=resultSet.getString("date")%></td>
			<td><%=resultSet.getString("payment_method")%></td>
			<td><%=resultSet.getString("item")%></td>
			<td><%=resultSet.getString("expiry_date")%></td>
			<td><%=resultSet.getString("quantity")%></td>
			<td><%=resultSet.getString("price")%></td>
			<td><%=resultSet.getString("gst")%></td>
			<td><%=resultSet.getString("discount")%></td>
			<td><%=resultSet.getString("final_amount")%></td>
			<td><%=resultSet.getString("total")%></td>
			<td><a href="showInvoice.jsp">show_invoice</a></td>
		</tr>
		<%
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		%>



	</table>
	<br />
	<a href="welcome.jsp">go back to home page</a>
</body>
</html>