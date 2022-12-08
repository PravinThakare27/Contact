FROM openjdk:11
MAINTAINER "PRAVINTHAKARE"
EXPOSE 8080
COPY target/contact*.jar contact-1.0.0.jar 
CMD [ "java","-jar","contact*.jar" ]
