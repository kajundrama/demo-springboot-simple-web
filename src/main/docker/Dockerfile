FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD demo-springboot-simple-web-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Dava.security.egd=file:/dev/./urandom","-jar","/app.jar"]