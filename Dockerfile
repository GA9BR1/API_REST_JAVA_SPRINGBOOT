FROM openjdk:19
ADD ./docker-spring-boot.jar docker-spring-boot.jar
EXPOSE 0.0.0.0:$PORT
ENTRYPOINT ["java", "-jar", "docker-spring-boot.jar"]
