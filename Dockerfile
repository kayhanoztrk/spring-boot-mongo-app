FROM openjdk:8-jdk-alpine
WORKDIR /src/app
COPY /target/spring-boot-mongo-docker-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8084
CMD ["java","-jar","app.jar"]