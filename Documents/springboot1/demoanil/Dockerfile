# Use a base image with JDK
FROM openjdk:17-jdk-alpine

# Add a volume pointing to /tmp
VOLUME /tmp

# The application's jar file, built by Maven
# This should match the location of the built JAR in the target directory
ARG JAR_FILE=target/*.jar

# Copy the jar file to the container
COPY ${JAR_FILE} app.jar

# Run the jar file
ENTRYPOINT ["java","-jar","/app.jar"]
