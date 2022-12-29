# Todo Application
This is a simple todo application built with Java Spring Boot,Java Spring Security and Docker container for my sql in the Model-View-Controller (MVC) architecture.

## Prerequisites
Java 8 or higher \
Maven \
An IDE (Eclipse, IntelliJ, etc.) \
Docker Desktop \
SQl Shell 


## Docker

Launch MySQL using Docker
```
docker run --detach --env MYSQL_ROOT_PASSWORD=dummypassword --env MYSQL_USER=todos-user --env MYSQL_PASSWORD=dummytodos --env MYSQL_DATABASE=todos --name mysql --publish 3306:3306 mysql:8-oracle
```


## How to run the application
Clone the repository: git clone https://github.com/iftesam321/todo-mvc.git \
Import the project into your IDE as a Maven project. \
Run the WebAppApplication class as a Java application. \
Open a web browser and go to http://localhost:8080 to access the application. \
User username-iftesam password-dummy for login \

##Database Credentials Used in Docker
MYSQL_ROOT_PASSWORD=dummypassword
MYSQL_USER=todos-user 
MYSQL_PASSWORD=dummytodos 
MYSQL_DATABASE=todos

## Features
View a list of todo items \
Add new todo items \
Mark todo items as completed \
Delete todo items 

## Technologies used
Java \
Spring Boot \
MVC architecture \
HTML \
CSS 

## Acknowledgements
This application was built based on the Spring Boot MVC Todo Application tutorial.
