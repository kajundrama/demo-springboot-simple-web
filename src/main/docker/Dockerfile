FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD demo-springboot-simple-web-0.0.3-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Dava.security.egd=file:/dev/./urandom","-jar","/app.jar"]


#https://spring.io/guides/gs/spring-boot-docker/
#FROM openjdk:8-jdk-alpine
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]