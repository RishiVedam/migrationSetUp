
FROM openjdk:21-jdk-slim
WORKDIR /app

COPY pom.xml .
COPY target/migrationSetup-0.0.1-SNAPSHOT.jar app.jar
COPY src/main/resources/db/migration ./db/migration

RUN apt-get update && apt-get install -y maven


ENTRYPOINT ["java", "-jar", "app.jar"]

