# Use an official OpenJDK image
FROM openjdk:17-jdk-slim

# Set app directory
WORKDIR /app

# Copy built JAR into image
COPY target/payment-tracker-0.0.1-SNAPSHOT.jar app.jar

# Expose the port Spring Boot runs on
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
