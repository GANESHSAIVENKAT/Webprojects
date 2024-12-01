<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Gym Membership List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<style >
    body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-image: url('https://d1csarkz8obe9u.cloudfront.net/posterpreviews/gym-membership-card-design-template-85b31912fbcdd0a194e4921aea78e4ca_screen.jpg?ts=1670935453');
            background-size: cover;
            background-repeat: no-repeat;
            background-attachment: fixed;
        }
        h1{
        color: white;
        }
        </style>
</head>
<body>
<div class="container my-5">
    <h1 class="text-center mb-4">Gym Membership List</h1>
    <div class="d-flex justify-content-end mb-3">
    <form action="view" method="get">
        <input type="submit" value="Submit" >
      </form>
    </div>
    <table class="table table-bordered table-striped table-hover">
    
        <thead class="table-dark">
            <tr>
           
                 <th>SL NO</th>
                <th>Full Name</th>
                <th>Age</th>
                <th>Gender</th>
                <th>Address</th>
                <th>ACTION</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="dto" items="${listofdto}">
                <tr>
                     <td>${dto.id}</td>
                
                    <td>${dto.fullName}</td>
                    <td>${dto.age}</td>
                    <td>${dto.gender}</td>
                    <td>${dto.address}</td>
                    <td>
                    <a href="delete?id=${dto.id}"> <input type="button" class="btn btn-danger" value="Delete"></a>
                    <a href="update?id=${dto.id}"> <input type="button" class="btn btn-success" value="Update"></a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>