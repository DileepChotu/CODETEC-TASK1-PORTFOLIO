
# CODETEC-TASK1-PORTFOLIO
# Name: Dileep Bhutham
# company: CODTECH IT SOLUTIONS PVT.LTD
# Intern ID : CT8FSWD1186
# Domain: FULL STACK WEB DEVELOPMENT
# Duration: JUNE 20th, 2024 to AUGUST 20th, 2024.
# Mentor: Neela Santhosh Kumar

______________________________________________________________________________


# Task One: Personal Portfolio Website with Backend
![Screenshot 2024-06-30 171642](https://github.com/DileepChotu/CODETEC-TASK1-PORTFOLIO/assets/146564017/7feb971d-fe3c-4a00-8155-c279413f52ce)


# Overview:
------------

# creating a personal portfolio website using Java Spring Boot, with HTML and CSS in JSP files, and a SQL database. The project will utilize the main Spring MVC module, which includes controllers, services, repositories, and entity classes for database interactions.

# Architecture Components:

# Spring Boot Application
--------------------------

# --> Entry Point: The main class annotated with @SpringBootApplication serves as the entry point for the Spring Boot application.

# --> Model (Entity Classes):

# -->  Entity Classes: These are plain Java objects (POJOs) annotated with @Entity that represent the data models. Each entity maps to a table in the SQL database.

# --> Example: An @Entity class like Project can have fields such as id, name, description, imageURL, and so on.

![Screenshot 2024-06-30 180133](https://github.com/DileepChotu/CODETEC-TASK1-PORTFOLIO/assets/146564017/f41c0085-1a82-4847-b53b-7fc4e088d026)
![Screenshot 2024-06-30 180118](https://github.com/DileepChotu/CODETEC-TASK1-PORTFOLIO/assets/146564017/5afe6f38-e444-429d-8313-fb782fee2e0b)


# Repository:
--------------

# --> Repository Interface: This interface extends JpaRepository or CrudRepository to perform CRUD operations on the entity. It interacts directly with the database.

# -->  Example: ProjectRepository could provide methods to find, save, delete, and update Project entities.

![Screenshot 2024-06-30 180015](https://github.com/DileepChotu/CODETEC-TASK1-PORTFOLIO/assets/146564017/e5aae908-4fe6-4c31-92e4-32d86e1dc9b6)
![Screenshot 2024-06-30 175957](https://github.com/DileepChotu/CODETEC-TASK1-PORTFOLIO/assets/146564017/3a7b731a-a0de-4fe6-849e-7a5813084eae)


# Service Layer:
-----------------_

# --> Service Classes: These are annotated with @Service and contain the business logic. They interact with the repository to fetch or manipulate data.
# -->  Example: ProjectService could contain methods like addProject, getProjectById, deleteProject, and updateProject.
![Screenshot 2024-06-30 173048](https://github.com/DileepChotu/CODETEC-TASK1-PORTFOLIO/assets/146564017/29a6d9ca-45a4-40d1-b79a-bf3d57ca993e)
![Screenshot 2024-06-30 173033](https://github.com/DileepChotu/CODETEC-TASK1-PORTFOLIO/assets/146564017/bdc260b9-d0f6-4d44-983f-6ae8cd8324bc)




# Controller:
------------

# --> Controller Classes: These classes are annotated with @Controller and handle incoming HTTP requests. They interact with the service layer and return views or JSON responses.
# --> Example: ProjectController could have methods annotated with @GetMapping, @PostMapping, @PutMapping, and @DeleteMapping to handle different endpoints.
![Screenshot 2024-06-30 172602](https://github.com/DileepChotu/CODETEC-TASK1-PORTFOLIO/assets/146564017/2117cf6d-eac2-439e-8bcf-da5051a3088c)
![Screenshot 2024-06-30 172543](https://github.com/DileepChotu/CODETEC-TASK1-PORTFOLIO/assets/146564017/cdd8bb80-c0fc-4ea5-8e8b-5936fdcf011b)
![Screenshot 2024-06-30 172524](https://github.com/DileepChotu/CODETEC-TASK1-PORTFOLIO/assets/146564017/384ebd94-8c90-477d-9ec8-b0ba2ad9d3bc)


# Views (JSP Files):
-------------------
# --> JSP Files: These files contain the HTML and CSS code and are located in the src/main/webapp/WEB-INF/views directory. They are used to render the UI for different parts of the website.
# --> Example: projectList.jsp to display a list of projects, projectDetail.jsp to show details of a single project, addProject.jsp for adding new projects, etc.

![Screenshot 2024-06-30 173425](https://github.com/DileepChotu/CODETEC-TASK1-PORTFOLIO/assets/146564017/2deae07b-e07d-4e3f-9280-f9d3d7e75b3f)
![Screenshot 2024-06-30 173412](https://github.com/DileepChotu/CODETEC-TASK1-PORTFOLIO/assets/146564017/8e90bf16-355e-405c-aab9-265790e527a8)
![Screenshot 2024-06-30 173349](https://github.com/DileepChotu/CODETEC-TASK1-PORTFOLIO/assets/146564017/4a5e631d-3ad8-4fbe-93e3-d548f82a0451)


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
![Screenshot 2024-06-30 173548](https://github.com/DileepChotu/CODETEC-TASK1-PORTFOLIO/assets/146564017/c2a49e35-0968-4e97-93a8-d12023da0be7)


# Description of Operations:
----------------------------

# Uploading:
-------------

Users can upload project details through a form in a JSP file (addProject.jsp).
The form submits the data to a specific endpoint in ProjectController (e.g., /projects with @PostMapping).
The controller method receives the data, validates it, and passes it to ProjectService.
The service processes the data and uses ProjectRepository to save it in the database.
![Screenshot 2024-06-30 171546](https://github.com/DileepChotu/CODETEC-TASK1-PORTFOLIO/assets/146564017/0590c9ee-8d0a-4de6-8ff9-fb9af736322f)
![Screenshot 2024-06-30 171531](https://github.com/DileepChotu/CODETEC-TASK1-PORTFOLIO/assets/146564017/b1c63ec4-a01e-451a-892c-d7db9fcf9561)


# Fetching (Getting) Data:
---------------------------

#  Get All Projects: A method in ProjectController (e.g., @GetMapping("/projects")) calls ProjectService to retrieve all projects. The service fetches data from ProjectRepository, and the controller returns a view (projectList.jsp) displaying the list of projects.
# Get Project by ID: A method in ProjectController (e.g., @GetMapping("/projects/{id}")) retrieves a specific project by its ID. The service layer fetches the project from ProjectRepository, and the controller returns a view (projectDetail.jsp) showing the project details.

![Screenshot 2024-06-30 171614](https://github.com/DileepChotu/CODETEC-TASK1-PORTFOLIO/assets/146564017/a007662e-4fba-49a5-b7da-8143e645738c)
![Screenshot 2024-06-30 171602](https://github.com/DileepChotu/CODETEC-TASK1-PORTFOLIO/assets/146564017/06deab68-3b5f-4aa6-99e7-61c1cc5c45de)
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








