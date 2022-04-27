FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ADD ./target/Confety-0.0.1.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]