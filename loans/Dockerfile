FROM openjdk:17-jdk-slim as build
LABEL authors="hamidashhad1"
MAINTAINER hamidashhad1
COPY target/loans-0.0.1-SNAPSHOT.jar loans-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/loans-0.0.1-SNAPSHOT.jar"]