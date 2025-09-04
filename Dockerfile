# Step 1: Use a base JDK image to build the application
FROM maven:3.9.9-eclipse-temurin-17 AS build

WORKDIR /app

# Copy pom.xml and source code
COPY pom.xml .
COPY src ./src

# Package the application (skip tests for faster build)
RUN mvn clean package -DskipTests

# Step 2: Use a lightweight JDK to run the application
FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

# Copy the packaged jar from the build stage
COPY --from=build /app/target/*.jar app.jar

# Expose port (Render uses PORT env var, but exposing 8080 is safe)
EXPOSE 8080

# Run the jar
ENTRYPOINT ["java","-jar","app.jar"]