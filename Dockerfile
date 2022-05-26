FROM alpine:3.10 as AlpineImage
FROM openjdk:8-jdk-alpine
ARG JAR_FILE=build/libs/springboot-docker-jenkins-pipeline-integration-1.0.jar
COPY ${JAR_FILE} springboot-docker-jenkins-pipeline-integration-1.0.jar
ENTRYPOINT ["java","-jar","/springboot-docker-jenkins-pipeline-integration-1.0.jar"]
EXPOSE 8085