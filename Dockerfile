FROM openjdk:19
ADD target/docker-spring-boot.jar docker-spring-boot.jar
EXPOSE ${PORT}
ENTRYPOINT ["java", "-jar", "docker-spring-boot.jar"]
