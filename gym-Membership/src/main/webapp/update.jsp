<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gym Membership Booking Update Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            margin: 0;
            padding: 0;
        }
        header {
            background-color: #007BFF;
            color: white;
            padding: 10px 20px;
            text-align: center;
        }
        nav {
            display: flex;
            justify-content: center;
            background-color: #444;
            padding: 10px 0;
            
        }
        nav a {
            color: white;
            padding: 10px 20px;
            text-decoration: none;
            text-transform: uppercase;
            font-weight: bold;
        }
	
        nav a:hover {
            background-color: #555;
        }
        .container {
            width: 50%;
            margin: 20px auto;
            background-color: white;
            padding: 20px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
        }
        label {
            font-size: 16px;
            font-weight: 600;
            display: block;
            margin: 10px 0 5px;
        }
        input[type="text"], input[type="email"], input[type="tel"], input[type="date"], input[type="number"], select, input[type="submit"], input[type="reset"] {
            width: 100%;
            padding: 10px;
            font-size: 14px;
            border: 1px solid #ddd;
            border-radius: 5px;
            margin-bottom: 10px;
            box-sizing: border-box;
        }
        input[type="submit"] {
            background-color: #5cb85c;
            color: white;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #4cae4c;
        }
        input[type="reset"] {
            background-color: #FF4136;
            color: white;
            cursor: pointer;
        }
        input[type="reset"]:hover {
            background-color: #FF2D1F;
        }
        .valid {
            color: green;
        }
        .invalid {
            color: red;
        }
        .form-footer {
            display: flex;
            justify-content: space-between;
        }
        .form-footer input {
            width: 48%;
        }
        footer {
            background-color: #007BFF;
            color: white;
            padding: 20px 0;
            text-align: center;
            position: relative;
            bottom: 0;
            width: 100%;
        }
        footer a {
            color: white;
            text-decoration: none;
        }
        footer a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

<header>
    <h1>Book For MemberShip</h1>
</header>

<nav>

   
    
</nav>

<div class="container">
    <form action="update" method="post" onsubmit="return validateForm()">
    <label for="id"> Id : </label> <input type="hidden"
				id="id" name="id" placeholder="id" value ="${search.id}"> <br><br>

        <label for="name"> Name:</label>
        <input type="text" id="name" name="fullName" value="${search.fullName}"  placeholder="Enter fullName"  required>
        <span id="outputName"></span><br>

        <label for="age">Age:</label>
        <input type="number" id="age" name="age" placeholder="Enter age" value="${search.age}"  onChange="displayRoomType()" required>
        <span id="outputEmail"></span><br>


        <label for="gen">Gender:</label>
<input type="text" id="gender" name="gender" placeholder="Enter gender" value="${search.gender}"  onChange="displayRoomType()" required>

       

      

        <label for="address">Address:</label>
        <input type="text" id="address" name="address" placeholder="Enter address" value="${search.address}"  required><br>

        <div class="form-footer">
            <input type="submit" value="Update">
        
        </div>
    </form>
</div>



<footer>
    <p>&copy; 2024 Gym Membership. All rights reserved.</p>
    <p><a href="#">Privacy Policy</a> | <a href="#">Terms of Service</a></p>
    <p>Contact:8309809043</p>
    
</footer>

</body>
</html>