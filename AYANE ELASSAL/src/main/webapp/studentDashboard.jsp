
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>FSBM Library</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link href="css/style.css" rel='stylesheet' type='text/css' />
</head>

<body>

<nav class="navbar navbar-default">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
        <a href="studentDashboard.jsp" class="navbar-brand"><img  src="./images/logo.png"  width="50px"></a>
    </div>
    <!-- Collection of nav links and other content for toggling -->
    <div id="navbarCollapse" class="collapse navbar-collapse">
     
        <ul class="nav navbar-nav">
            <li class="active">
            <li> <a href="viewbooks.jsp">View All Books</a></li>
            <li> <a href="viewIssuedBooks.jsp">View Issued Books</a></li>
            
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="studentLogin.jsp">Logout</a></li>
        </ul>
    </div>
</nav>

<div class="login-form">
    <div class = "well">
    <h1>Thanks for joining our online library</h1><br>
    <p>As a registered user you have the access to view all the books, issue and view issued books in the library.</p>      
</div>
</div>

</body>
</html>