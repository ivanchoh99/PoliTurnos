FROM openjdk:17
MAINTAINER ihca
RUN groupadd -r spring && useradd -r -g spring spring
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} poli-turno-0.0.1.jar
EXPOSE 8080
CMD ["java","-jar","/poli-turno-0.0.1.jar"]
