# Use OpenJDK base image to build the application
FROM openjdk:17-jdk-slim as builder

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/spring-boot-docker-jenkins-0.0.1-SNAPSHOT.jar /app/app.jar

# Expose the port your application will run on
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
