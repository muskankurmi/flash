
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome User</title>
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
			<a href="showMedicineDetail.jsp">View Medicine</a> 
			<a href="searchMdcn.jsp">Search Medicine</a> 
		</div>
		
	
		 <button class="dropdown-btn">Stock
           <i class="fa fa-caret-down"></i>
         </button>
		<div class="dropdown-container">
			<a href="stock.jsp">Search Stock</a> 
		<a href="showStock.jsp">Check Stock</a> 
		
		</div>
		 <button class="dropdown-btn">invoice
           <i class="fa fa-caret-down"></i>
         </button>
		<div class="dropdown-container">
			<a href="showInvoice.jsp">Generate Invoice</a> 
	    
		</div>
		<a href="#">Services</a>
		<a href="#">Help</a>
			<a href="Contact.jsp">Contact us</a>
	</div>
	
	<div id="main">
		<div class="container">
			<img src="Style/image/i.jpg" style="width: 100%;">
			<div class="text-block">
				<h1>We Care for Your Health</h1>
				<h1>Every Moment</h1>

				<p>Medical Services that you can trust</p>
			</div>
		</div>
	</div>
	<div class="footer">
		<p>footer</p>
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
