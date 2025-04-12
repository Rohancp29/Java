FROM openjdk:17-jdk-slim
WORKDIR /app
EXPOSE 8080
COPY target/spring-boot-docker.jar spring-boot-docker.jar
ENTRYPOINT ["java", "-jar", "spring-boot-docker.jar"]
