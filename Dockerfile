FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} springbootapp-1.0.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/springbootapp-1.0.jar"]