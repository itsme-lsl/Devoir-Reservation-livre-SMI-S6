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
<img  src="./images/logo.png"  width="250px">
<div class="login-form">
    <div class = "well">
    <h1>Bienvenue au Bibilthèque de FSBM</h1>
	<h3 id="login-line">Login As</h3>
	
	<form action="adminLogin.jsp">
    <button type="submit" value="Admin">Admin</button>
    </form>
     <br>
    <form action="studentLogin.jsp">
    <button type="submit" value="Student">Student</button>
    </form>
    
    <h5>Vous n'etes pas un membre encore ? Inscrivez-vous ... 
    <form action="ajouteretudiant.jsp">
    <button type="submit" value="Register">Register</button>
    </form></h5>

</div>
</div>

</body>
</html>