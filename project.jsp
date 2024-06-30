<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Projects</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }
        header {
            background-color: #4CAF50;
            color: white;
            padding: 1em 0;
            text-align: center;
        }
        form {
            background-color: #fff;
            padding: 2em;
            margin: 2em auto;
            width: 50%;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        form input, form textarea {
            width: 100%;
            padding: 1em;
            margin: 0.5em 0;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        form button {
            padding: 1em 2em;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        form button:hover {
            background-color: #45a049;
        }
        ul {
            list-style-type: none;
            padding: 0;
        }
        ul li {
            background-color: #fff;
            margin: 0.5em 0;
            padding: 1em;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        ul li a {
            color: #4CAF50;
            text-decoration: none;
        }
    </style>
</head>
<body>
    <header>
        <h1>Projects</h1>
    </header>
    <form action="projects" method="post">
        <input type="text" name="title" placeholder="Project Title" required>
        <textarea name="description" placeholder="Project Description" required></textarea>
        <input type="url" name="url" placeholder="Project URL" required>
        <button type="submit">Add Project</button>
    </form>
    <ul>
        <c:forEach var="project" items="${projects}">
            <li>${project.title} - ${project.description} - <a href="${project.url}">Link</a></li>
        </c:forEach>
    </ul>
</body>
</html>
