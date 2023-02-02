FROM openjdk:19
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "docker-spring-boot.jar"]
