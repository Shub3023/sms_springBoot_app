FROM openjdk:17

EXPOSE 8080

ADD target/docker-smspringboot.jar docker-smspringboot.jar

ENTRYPOINT [ "java", "-jar", "docker-smspringboot.jar"]