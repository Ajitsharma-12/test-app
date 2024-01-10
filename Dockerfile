FROM ubuntu
RUN apt-get update
RUN apt-get install -y openjdk-17-jdk
EXPOSE 8080
WORKDIR /app
COPY target/app-0.0.1-SNAPSHOT app.jar

# COPY target/docker-spring-boot-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java","-jar","app.jar"]