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
<title>ShowMedicineDetail</title>
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
			<th>S.no.</th>
			<th>Medicine</th>
			<th>Category</th>
			<th>Strength</th>
			<th>Dosage form</th>
			<th>Mfg date</th>
			<th>Exp date</th>
			<th>Market prize</th>
			<th>Discount</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>

		<%
			try {
			connection = DriverManager.getConnection(connectionUrl + dbName, userId, password);
			statement = connection.createStatement();
			String sql = "SELECT * FROM medicalshop.medicine";

			resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
		%>

		<tr bgcolor=#C0C0C0>
			<td><%=resultSet.getString("s_no")%></td>
			<td><%=resultSet.getString("medicine_name")%></td>
			<td><%=resultSet.getString("category")%></td>
			<td><%=resultSet.getString("strength")%></td>
			<td><%=resultSet.getString("dosage_form")%></td>
			<td><%=resultSet.getString("mfg_date")%></td>
			<td><%=resultSet.getString("exp_date")%></td>
			<td><%=resultSet.getString("market_prize")%></td>
			<td><%=resultSet.getString("discount")%></td>
			<td><a href="updateMdcn.jsp">update</a></td>
			<td><a href='DeleteMedicine?s_no="+medicine.getS_no+"'>delete</a></td>
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