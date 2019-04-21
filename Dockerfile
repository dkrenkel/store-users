FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8081
RUN mkdir -p /app/
ADD build/libs/store-users-0.0.1-SNAPSHOT.jar /app/store-users.jar
ENTRYPOINT ["java", "-jar", "/app/store-users.jar"]