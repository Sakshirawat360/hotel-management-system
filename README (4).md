
## HOTEL MANAGEMENT SYSTEM API BASED ON SPRING BOOT

Objective   : This project provides  basic learning experience to Spring Boot framework.
## RUNS ON

1. Windows or Linux machine with Docker installed

2. Java 21

3. Spring Boot framework 3.1.4

4. MySQL 
## Deployment Strategies

1. Normal Maven build and run

2. Containerized build and run (via Dockerfile)

3. Containerized build and run (via docker-compose.yml)
## Instructions for containerized build and run

Build and deploy through Dockerfile: 
1. Navigate to terminal or command prompt.
2. Pull two Docker images using Docker pull command (commands mentioned below in collapsible section)
3.  a common network of bridge type
4. Run MySQL database as a container and expose to external port 3306 with MYSQL_PASSWORD as root
5. Verify MySQL database container
6. Run HMS application as a container
7. Verify HMS application container
## Instructions for containerized build and run

Build and deploy through Dockerfile: 
1. Navigate to terminal or command prompt.
2. Pull two Docker images using Docker pull command (commands mentioned below in collapsible section)
3.  a common network of bridge type
4. Run MySQL database as a container and expose to external port 3306 with MYSQL_PASSWORD as root
5. Verify MySQL database container
6. Run HMS application as a container
7. Verify HMS application container
## Build and deploy through docker-compose.yml
1. Navigate to terminal or command prompt
2. For ther first time deployment, install docker-compose tool (commands mentioned below in collapsible section)
3. Run it by using command --> docker-compose up -d

## Installing docker-compose tool in Linux environment
1. Type the commands in terminal (mentioned below).
2. Verify the installation by following command --> docker-compose version
## Caution
In application properties, please maintain Datasource URL as such for running this application in containerized environment.