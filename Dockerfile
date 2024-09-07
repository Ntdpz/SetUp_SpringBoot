# ใช้ base image เป็น openjdk 17
FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/springboot-backend-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
