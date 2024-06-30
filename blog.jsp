<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Blog</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
            background-color: #f4f4f4;
        }
        h1 {
            color: #333;
        }
        form {
            margin-bottom: 20px;
            padding: 20px;
            background: #fff;
            border: 1px solid #ddd;
            border-radius: 5px;
        }
        input[type="text"], textarea {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ddd;
            border-radius: 5px;
        }
        button {
            padding: 10px 20px;
            border: none;
            background: #5cb85c;
            color: #fff;
            border-radius: 5px;
            cursor: pointer;
        }
        button:hover {
            background: #4cae4c;
        }
        ul {
            list-style: none;
            padding: 0;
        }
        li {
            background: #fff;
            margin: 10px 0;
            padding: 10px;
            border: 1px solid #ddd;
            border-radius: 5px;
        }
    </style>
</head>
<body>
    <h1>Blog</h1>
    <form action="blogs" method="post">
        <input type="text" name="title" placeholder="Blog Title" required>
        <textarea name="content" placeholder="Blog Content" required></textarea>
        <button type="submit">Add Blog</button>
    </form>
    <ul>
        <c:forEach var="blog" items="${blogs}">
            <li>
                <strong>${blog.title}</strong><br>
                <em>${blog.date}</em><br>
                ${blog.content}
            </li>
        </c:forEach>
    </ul>
</body>
</html>
