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
<title>Invoice</title>

<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

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


	<div class="container">

		<%
			try {
			connection = DriverManager.getConnection(connectionUrl + dbName, userId, password);
			statement = connection.createStatement();
			String sql = "SELECT * FROM medicalshop.bill";

			resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
		%>



		<div class="row">
			<div class="col-xs-12">
				<div class="invoice-title">
					<h2>Invoice</h2>
					<h3 class="pull-right">
						batch_no<%=resultSet.getString("batch_no")%></h3>
				</div>
				<hr>
				<div class="row">
					<div class="col-xs-6">
						<address>
							<strong>Billed To:<%=resultSet.getString("name")%></strong><br>
						</address>
					</div>
					<div class="col-xs-6 text-right">
						<address>
							<strong>Address:<%=resultSet.getString("email")%></strong><br>
						</address>
					</div>
				</div>
				<div class="row">
					<div class="col-xs-6">
						<address>
							<strong>Payment Method:<%=resultSet.getString("payment_method")%></strong><br>
						</address>
					</div>
					<div class="col-xs-6 text-right">
						<address>
							<strong>Date:<%=resultSet.getString("date")%></strong><br>
						</address>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="col-md-12">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							<strong>Order summary</strong>
						</h3>
					</div>
					<div class="panel-body">
						<div class="table-responsive">
							<table class="table table-condensed">
								<thead>
									<tr>
										<td><strong>Item/Medicine_name</strong></td>
										<td class="text-center"><strong>expiry_date</strong></td>
										<td class="text-center"><strong>Quantity</strong></td>
										<td class="text-center"><strong>Price</strong></td>
										<td class="text-center"><strong>GST</strong></td>
										<td class="text-center"><strong>Discount</strong></td>
										<td class="text-center"><strong>Final_amount</strong></td>
									</tr>
								</thead>


								<tr bgcolor=#C0C0C0>
									<td><%=resultSet.getString("item")%></td>
									<td class="text-center"><%=resultSet.getString("expiry_date")%></td>
									<td class="text-center"><%=resultSet.getString("quantity")%></td>
									<td class="text-center"><%=resultSet.getString("price")%></td>
									<td class="text-center"><%=resultSet.getString("gst")%></td>
									<td class="text-center"><%=resultSet.getString("discount")%></td>
									<td class="text-center"><%=resultSet.getString("final_amount")%></td>
								</tr>

								<tbody>
									<tr>
										<td class="no-line"></td>
										<td class="no-line"></td>
										<td class="no-line"></td>
										<td class="no-line"></td>
										<td class="no-line"></td>
										<td class="no-line text-center"><strong>Total</strong></td>
										<td class="no-line text-center"><%=resultSet.getString("total")%></td>

									</tr>
								</tbody>

							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
		<%
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		%>
		<div class="form-group">
			<label class="col-md-12 control-label"></label>
			<div class="col-md-12">
				<br>
				<button onclick="window.print()">Print</button>
			</div>
		</div>


	</div>
	<a href="welcome.jsp">go back to home page</a>  
	

</body>
</html>