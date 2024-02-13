FROM openjdk:17-alpine

ARG JAR_FILE=build/libs/external-env-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} external-env.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/external-env.jar"]