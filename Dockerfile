# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the .env file into the container
COPY ./.env /app/.env

# Copy the current directory contents into the container at /app
COPY ./target/*.jar /app/app.jar

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
