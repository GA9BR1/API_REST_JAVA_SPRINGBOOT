FROM openjdk:19
ADD ./docker-spring-boot.jar docker-spring-boot.jar
EXPOSE 3030
ENTRYPOINT ["java", "-jar", "docker-spring-boot.jar"]
