

#FROM alpine:latest

#CMD ["/bin/sh"]

FROM amazoncorretto:17-alpine-jdk

COPY target/SpringBoot-0.0.1-SNAPSHOT.jar SpringBoot-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/SpringBoot-0.0.1-SNAPSHOT.jar"]
