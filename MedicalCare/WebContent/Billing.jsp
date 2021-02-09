<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>medincine billing</title>
<link rel="stylesheet" type="text/css" href="Style/new.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
	<div class="header">
		<h2>
			<b><u>Welcome to MediCare</u></b>
		</h2>
		<p>we're happy to serve you</p>
	</div>
	<div id="navbar">

		<span style="font-size: 30px; cursor: pointer" onclick="openNav()">&#9776;
			Medical Care</span> <a href="logout.jsp">Logout</a> <a href="Contact.jsp">Contact</a>
		<a href="#">About</a> <a href="index.html">Home</a>
	</div>
	
	<div id="mySidenav" class="sidenav">
		<a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
		<a class="active" href="welcome.jsp">Home</a> 
		<a href="#">About</a> 
		
		 <button class="dropdown-btn">Medicine Detail
           <i class="fa fa-caret-down"></i>
         </button>
		<div class="dropdown-container">
			<a href="medicineDetail.jsp">Add Medicine</a> 
			<a href="showMedicineDetail.jsp">View Medicine</a> 
			<a href="searchMdcn.jsp">Search Medicine</a> 
		</div>
		
		  <button class="dropdown-btn">Vendor
           <i class="fa fa-caret-down"></i>
         </button>
		<div class="dropdown-container">
			<a href="vendorDetail.jsp">Add vendor</a> 
			 <a href="showVendorDetail.jsp">Show vendor detail</a>
			 <a href="#">Link 3</a>
		</div>
		
		 <button class="dropdown-btn">Stock
           <i class="fa fa-caret-down"></i>
         </button>
		<div class="dropdown-container">
			<a href="stock.jsp">Add in Stock</a> 
		<a href="showStock.jsp">Check Stock</a> 
		
		</div>
		
		 <button class="dropdown-btn">Billing
           <i class="fa fa-caret-down"></i>
         </button>
		<div class="dropdown-container">
		<a  class="active" href="Billing.jsp">Billing per md</a> 
		<a href="showBilling.jsp">view medicine billing</a>
		<a href="totalBilling.jsp">Total Billing</a>
		<a href="showTotalBilling.jsp">View total billing</a> 
		<a href="purchaseBill.jsp">Purchasing bill</a>
	    <a href="showPurchaseBilling.jsp">View Puchase bills</a> 
	    
		</div>
		
		 <button class="dropdown-btn">invoice
           <i class="fa fa-caret-down"></i>
         </button>
		<div class="dropdown-container">
			<a href="invoice.jsp">Customer billing</a>
	        <a href="ShowivoiceDetail.jsp">Invoice</a> 
	        <a href="nvoce.jsp">Invoice Report</a>
	        <a href="searchinvoice.jsp">Search Invoice</a> 
	    
		</div>
		
			<a href="Contact.jsp">Contact us</a>
	</div>	<div id="main">
		<div class="jumbotron">
			<div class="container">
				<div class="row">
					<div class="container">

						<form class="well form-horizontal" action="BillingCheck"
							method="post" id="contact_form">
							<fieldset>

								<!-- Form Name -->


								<legend>
									<center>
										<h2>
											<b>Billing</b>
										</h2>


									</center>
								</legend>
								<br>

								<!-- Text input-->
								<div class="form-group">
									<label class="col-md-4 control-label">Date</label>
									<div class="col-md-4 inputGroupContainer">
										<div class="input-group">
											<span class="input-group-addon"></span> <input name="date"
												placeholder="date" class="form-control"
												type="text">
										</div>
									</div>
								</div>


								<div class="form-group">
									<label class="col-md-4 control-label">Medicine Name</label>
									<div class="col-md-4 inputGroupContainer">
										<div class="input-group">
											<span class="input-group-addon"></span> <input
												name="medicine_name" placeholder="name of the medicine"
												class="form-control" type="text">
										</div>
									</div>
								</div>


								<div class="form-group">
									<label class="col-md-4 control-label">Price</label>
									<div class="col-md-4 inputGroupContainer">
										<div class="input-group">
											<span class="input-group-addon"></span> <input
												name="price" placeholder="price of medicine"
												class="form-control" type="text">
										</div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-md-4 control-label">Discount</label>
									<div class="col-md-4 inputGroupContainer">
										<div class="input-group">
											<span class="input-group-addon"></span> <input name="discount"
												placeholder="Discount of medicine"
												class="form-control" type="text">
										</div>
									</div>
								</div>

								<div class="form-group">
									<label class="col-md-4 control-label">Total amount</label>
									<div class="col-md-4 inputGroupContainer">
										<div class="input-group">
											<span class="input-group-addon"></span> <input
												name="total_price" placeholder="total_price"
												class="form-control" type="text">
										</div>
									</div>
								</div>


								<div class="form-group">
									<label class="col-md-4 control-label">Payment</label>
									<div class="col-md-4 inputGroupContainer">
										<div class="input-group">
											<span class="input-group-addon"></span> <input name="payment"
												placeholder="paid amount" class="form-control"
												type="text">
										</div>
									</div>
								</div>


								<!-- Button -->
								<div class="form-group">
									<label class="col-md-4 control-label"></label>
									<div class="col-md-4">
										<br>

										<button type="submit" class="btn btn-info btn-block">
											SUBMIT</button>
									</div>
								</div>
							</fieldset>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>


	<script>
		function openNav() {
			document.getElementById("mySidenav").style.width = "250px";
			document.getElementById("main").style.marginLeft = "250px";
		}

		function closeNav() {
			document.getElementById("mySidenav").style.width = "0";
			document.getElementById("main").style.marginLeft = "0";
		}
	</script>


	<script>
		window.onscroll = function() {
			myFunction()
		};

		var navbar = document.getElementById("navbar");
		var sticky = navbar.offsetTop;

		function myFunction() {
			if (window.pageYOffset >= sticky) {
				navbar.classList.add("sticky")
			} else {
				navbar.classList.remove("sticky");
			}
		}
	</script>

</body>
</html>
