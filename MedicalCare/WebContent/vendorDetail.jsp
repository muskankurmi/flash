<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add vendor</title>
<link rel="stylesheet" type="text/css" href="Style/detail.css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet" type="text/css" href="Style/new.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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
		<a class="#" href="welcome.jsp">Home</a> 
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
			<a class="active" href="vendorDetail.jsp">Add vendor</a> 
			 <a href="showVendorDetail.jsp">Show vendor detail</a>
			 <a href="#">Link 3</a>
		</div>
		
		 <button class="dropdown-btn">Stock
           <i class="fa fa-caret-down"></i>
         </button>
		<div class="dropdown-container">
			<a  href="stock.jsp">Add in Stock</a> 
		<a href="showStock.jsp">Check Stock</a> 
		
		</div>
		
		 <button class="dropdown-btn">Billing
           <i class="fa fa-caret-down"></i>
         </button>
		<div class="dropdown-container">
		<a href="Billing.jsp">Billing per md</a> 
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
	        <a href="#">Generate Invoice</a> 
	        <a href="searchinvoice.jsp">Search Invoice</a> 
	    
		</div>
		
			<a href="Contact.jsp">Contact us</a>
</div>
<div id="main">
		<div class="jumbotron">
			<div class="container">
				<div class="row">
					<div class="container">

						<form class="well form-horizontal" action="VendorMaster" method="post"
							id="contact_form">
							<fieldset>

								<!-- Form Name -->


								<legend>
									<center>
										<h2>
											<b>Vendor Detail</b>
										</h2>


									</center>
								</legend>
								<br>

								<!-- Text input-->

								<div class="form-group">
									<label class="col-md-4 control-label">S.no.</label>
									<div class="col-md-4 inputGroupContainer">
										<div class="input-group">
											<span class="input-group-addon"></span> <input name="s_no"
												placeholder="s.no." class="form-control" type="text">
										</div>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">Vendor Name</label>
									<div class="col-md-4 inputGroupContainer">
										<div class="input-group">
											<span class="input-group-addon"></span> <input name="vendor_name"
												placeholder="name of the vendor or company" class="form-control" type="text">
										</div>
									</div>
								</div>
								
								<div class="form-group">
									<label class="col-md-4 control-label">Purchase history</label>
									<div class="col-md-4 inputGroupContainer">
										<div class="input-group">
											<span class="input-group-addon"></span> <input name="purchase_history"
												placeholder=" " class="form-control" type="text">
										</div>
									</div>
								</div>
								
							<div class="form-group">
									<label class="col-md-4 control-label">Contact purpose</label>
									<div class="col-md-4 inputGroupContainer">
										<div class="input-group">
											<span class="input-group-addon"></span> <input name="contact_purpose"
												placeholder=" " class="form-control" type="text">
										</div>
									</div>
								</div>
								
								
								<div class="form-group">
									<label class="col-md-4 control-label">contact_no.</label>
									<div class="col-md-4 inputGroupContainer">
										<div class="input-group">
											<span class="input-group-addon"></span> <input name="contact_no"
												placeholder="" class="form-control" type="text">
										</div>
									</div>
								</div>
								
								<div class="form-group">
									<label class="col-md-4 control-label">Address</label>
									<div class="col-md-4 inputGroupContainer">
										<div class="input-group">
											<span class="input-group-addon"></span> <input name="address"
												placeholder=" " class="form-control" type="text">
										</div>
									</div>
								</div>
								
								
								
								<!-- Button -->
								<div class="form-group">
									<label class="col-md-4 control-label"></label>
									<div class="col-md-4">
										<br>

										<button type="submit" class="btn btn-default">
											SUBMIT <span class="glyphicon glyphicon-send"></span>
										</button>
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
  document.getElementById("main").style.marginLeft= "0";
}
</script>


<script>
window.onscroll = function() {myFunction()};

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
<script>
		var dropdown = document.getElementsByClassName("dropdown-btn");
		var i;

		for (i = 0; i < dropdown.length; i++) {
			dropdown[i].addEventListener("click", function() {
				this.classList.toggle("active");
				var dropdownContent = this.nextElementSibling;
				if (dropdownContent.style.display === "block") {
					dropdownContent.style.display = "none";
				} else {
					dropdownContent.style.display = "block";
				}
			});
		}
	</script>

</body>
</html>
