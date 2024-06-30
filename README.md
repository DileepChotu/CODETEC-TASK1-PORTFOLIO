# CODETEC-TASK1-PORTFOLIO
# Name: Dileep Bhutham
# company: CODTECH IT SOLUTIONS PVT.LTD
# Intern ID : CT8FSWD1186
# Domain: FULL STACK WEB DEVELOPMENT
# Duration: JUNE 20th, 2024 to AUGUST 20th, 2024.
# Mentor: Neela Santhosh Kumar
______________________________________________________________________________

# Task One: Personal Portfolio Website with Backend

# Overview:
------------

# You are creating a personal portfolio website using Java Spring Boot, with HTML and CSS in JSP files, and a SQL database. The project will utilize the main Spring MVC module, which includes controllers, services, repositories, and entity classes for database interactions.

# Architecture Components:

# Spring Boot Application
--------------------------

# --> Entry Point: The main class annotated with @SpringBootApplication serves as the entry point for the Spring Boot application.

# --> Model (Entity Classes):

# -->  Entity Classes: These are plain Java objects (POJOs) annotated with @Entity that represent the data models. Each entity maps to a table in the SQL database.

# --> Example: An @Entity class like Project can have fields such as id, name, description, imageURL, and so on.

# Repository:
--------------

# --> Repository Interface: This interface extends JpaRepository or CrudRepository to perform CRUD operations on the entity. It interacts directly with the database.

# -->  Example: ProjectRepository could provide methods to find, save, delete, and update Project entities.

# Service Layer:
-----------------_

# --> Service Classes: These are annotated with @Service and contain the business logic. They interact with the repository to fetch or manipulate data.
# -->  Example: ProjectService could contain methods like addProject, getProjectById, deleteProject, and updateProject.

# Controller:
------------

# --> Controller Classes: These classes are annotated with @Controller and handle incoming HTTP requests. They interact with the service layer and return views or JSON responses.
# --> Example: ProjectController could have methods annotated with @GetMapping, @PostMapping, @PutMapping, and @DeleteMapping to handle different endpoints.

# Views (JSP Files):
-------------------
# --> JSP Files: These files contain the HTML and CSS code and are located in the src/main/webapp/WEB-INF/views directory. They are used to render the UI for different parts of the website.
# --> Example: projectList.jsp to display a list of projects, projectDetail.jsp to show details of a single project, addProject.jsp for adding new projects, etc.

# Database Configuration:
-------------------------

# -->Application Properties: Configure the SQL database connection in the application.properties file, including the URL, username, and password.
Example:
properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/portfolio
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
Description of Operations:

# Uploading:
-------------

Users can upload project details through a form in a JSP file (addProject.jsp).
The form submits the data to a specific endpoint in ProjectController (e.g., /projects with @PostMapping).
The controller method receives the data, validates it, and passes it to ProjectService.
The service processes the data and uses ProjectRepository to save it in the database.

# Fetching (Getting) Data:
---------------------------

# --> Get All Projects: A method in ProjectController (e.g., @GetMapping("/projects")) calls ProjectService to retrieve all projects. The service fetches data from ProjectRepository, and the controller returns a view (projectList.jsp) displaying the list of projects.
# --> Get Project by ID: A method in ProjectController (e.g., @GetMapping("/projects/{id}")) retrieves a specific project by its ID. The service layer fetches the project from ProjectRepository, and the controller returns a view (projectDetail.jsp) showing the project details.

# Updating:
------------

Users can update project details through a form in a JSP file (editProject.jsp).
The form submits the updated data to a specific endpoint in ProjectController (e.g., /projects/{id} with @PutMapping).
The controller method receives the updated data, validates it, and passes it to ProjectService.
The service processes the data and uses ProjectRepository to update the project in the database.
Deleting:

# Users can delete a project by triggering a delete action from the UI.
The request is handled by a method in ProjectController (e.g., @DeleteMapping("/projects/{id}")).
The controller calls ProjectService to delete the project by its ID. The service uses ProjectRepository to remove the project from the database.
By organizing the application into these layers, you ensure a clean separation of concerns, making the code more maintainable and scalable. The use of Spring Boot and MVC architecture helps manage the complexity, while JSP files enable a straightforward way to create dynamic web pages.







