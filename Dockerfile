# Pull base image 
From tomcat:8-jre8 

# Maintainer 
MAINTAINER "talibraza74@gmail.com" 
COPY ./mywebapp.war /usr/local/tomcat/webapps
