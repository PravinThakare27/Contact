FROM OPENJDK:11
MAINTAINER "PRAVINTHAKARE"
EXPOSE 8080
RUN "mvc clean package"
COPY target/contact*.jar contact-1.0.0.jar 
CMD [ "java","-jar","contact-1.0.0.jar" ]