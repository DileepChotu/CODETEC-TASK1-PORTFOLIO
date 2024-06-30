<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Portfolio</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #e181e1;
            margin: 0;
            padding: 0;
            text-align: center;
        }

        header {
            background-color: #333;
            color: gold;
            padding: 10px 0;
        }

        header h1 {
            margin: 0;
            font-size: 2em;
        }

        nav {
            display: flex;
            justify-content: center;
            background-color: #333;
            padding: 1em;
        }

        nav a {
            color: white;
            text-decoration: none;
            padding: 0.5em 1em;
            margin: 0 0.5em;
            background-color:#9297de;
            border-radius: 5px;
            transition: background-color 0.3s;
        }

        nav a:hover {
            background-color: #555;
        }

        .profile-pic {
            border-radius: 50%;
            width: 200px;
            height: 200px;
            margin-top: 20px;
        }

        .container {
            max-width: 600px;
            margin: 20px auto;
            padding: 20px;
            background-color: white;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            text-align: center;
        }

        .intro-text {
            font-size: 1.2em;
            color: #333;
            margin: 20px 0;
            background-color:#a8dd69;
        }
    </style>
</head>
<body>
    <header>
        <h1>WELCOME TO MY PORTFOLIO</h1>
    </header>
    <div class="container">
        <img src="https://www.suntiros.com/wp-content/uploads/2018/05/Ram-Charan-811x1024.jpg" alt="Profile Picture" class="profile-pic">
        <div class="intro-text">
            HYE! THIS IS DILEEP. THIS IS MY PORTFOLIO PROJECT
        </div>
        <nav>
            <a href="projects">PROJECTS</a>
            <a href="blogs">BLOG</a>
        </nav>
    </div>
</body>
</html>