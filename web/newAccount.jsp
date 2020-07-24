<%-- 
    Document   : newAccount
    Created on : 3 Apr, 2019, 12:54:03 AM
    Author     : rowdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap Simple Login Form</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
<style type="text/css">
	.login-form {
		width: 340px;
    	margin: 50px auto;
	}
    .login-form form {
    	margin-bottom: 15px;
        background: #f7f7f7;
        box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
        padding: 30px;
    }
    .login-form h2 {
        margin: 0 0 15px;
    }
    .form-control, .btn {
        min-height: 38px;
        border-radius: 2px;
    }
    .btn {        
        font-size: 15px;
        font-weight: bold;
    }
</style>
</head>
<body>
<div class="login-form">
    <form action="${pageContext.request.contextPath}/createAccount" method="get">
        <h2 class="text-center">New Account</h2>       
        <div class="form-group">
            <input type="text" class="form-control" placeholder="First Name" name="firstname" required="required">
        </div>
        <div>  <input type="text" class="form-control" placeholder="Last Name" name="lastname" required="required"></div>
        <div class="form-group">
 
            <br>
                
         <div class="form-group">
            <input type="text" class="form-control" placeholder="Username" name="username" required="required">
        </div>
            
            
            <input type="password" class="form-control" placeholder="Password" name="password" required="required">
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-primary btn-block">Create</button>
        </div>
           
    </form>
  
</div
</body>
</html>  
