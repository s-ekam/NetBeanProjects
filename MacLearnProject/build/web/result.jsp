<%-- 
    Document   : result
    Created on : 23 Oct, 2017, 1:06:57 PM
    Author     : Ekam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <%  
        int id = Integer.parseInt(request.getAttribute("ID").toString());
    %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Regression Analysis</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Auditions Registration Form Widget Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<!-- //custom-theme -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- js -->
<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
<!-- //js -->
<!-- font-awesome-icons -->
<!-- //font-awesome-icons -->
<link href="//fonts.googleapis.com/css?family=Anton&amp;subset=latin-ext,vietnamese" rel="stylesheet">
</head>
<body>
<!-- banner -->
	<div class="center-container">
	<div class="banner-dott">
		<div class="main">
			<h1 class="w3layouts_head">Regression Analysis</h1>
                        <!--<h4 ></h4>-->
				<div class="w3layouts_main_grid" align = "center">
                                    <br>
                                    <font color = "white" size ="20">THANK YOU  </font> <br>
                                    <font size = "20" color = "white" >Your ID is : <%=id %> </font> <br>
                                    <font color = "white" >Check Your Email for result</font>
                    		</div>
                                    
		</div>
	</div>
	</div>
<!-- //footer -->
</body>
</html>
