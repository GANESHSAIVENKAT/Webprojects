<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gym Membership</title>
    <link rel="icon" href="ganesh.png" type="image/x-icon">
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-image: url('https://d1csarkz8obe9u.cloudfront.net/posterpreviews/gym-membership-card-design-template-85b31912fbcdd0a194e4921aea78e4ca_screen.jpg?ts=1670935453');
            background-size: cover;
            background-repeat: no-repeat;
            background-attachment: fixed;
        }

        header {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 10px 20px;
            background-color: #17d0e9;
        }

        footer {
          
            color: white;
            padding: 20px 0;
            text-align: center;
        }

        main {
            text-align: justify;
                padding: 150px 0px;
        }

        button {
            background-color: #f44336;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        button:hover {
            opacity: 0.8;
        }
        h1{
        color: lime;
        background-color: purple;
        width: 661px;
        height: 37px;
        }
    </style>
</head>

<body>

    <header>
        <button onclick="location.href='view.jsp'">View</button>
        <button onclick="location.href='index1.jsp'">Book Now</button>
    </header>

    <main>
        <h1>Welcome to Gym Membership Booking Site</h1>
    </main>

    <footer>
        <p>&copy; 2024 Gym Membership. All rights reserved.</p>
        <p><a href="#">Privacy Policy</a> | <a href="#">Terms of Service</a></p>
        <p>Contact: 8309809043</p>
    </footer>

</body>

</html>