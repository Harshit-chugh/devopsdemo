FROM openjdk:17-jdk-alpine
EXPOSE 8080
ARG JAR_FILE=target/devops-demo-1.0.0-RELEASE.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]