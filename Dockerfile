FROM openjdk:19
ADD ./docker-spring-boot.jar docker-spring-boot.jar
ENV PORT = 0.0.0.0:$PORT
EXPOSE PORT
ENTRYPOINT ["java", "-jar", "docker-spring-boot.jar"]
