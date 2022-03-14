FROM openjdk:11
MAINTAINER Yilmaz Mustafa <yilmaz.mustafa@intecbrussel.be>

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} intec-vision-basket.jar
ENTRYPOINT ["java","-jar","/intec-vision-basket.jar"]


