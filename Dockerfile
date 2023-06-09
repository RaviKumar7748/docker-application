FROM openjdk:11
COPY target/docker-application-1.1.jar usr/app
WORKDIR usr/app
ENTRYPOINT ["jar","-jar","docker-application-1.1.jar"]