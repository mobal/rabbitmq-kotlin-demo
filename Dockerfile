FROM adoptopenjdk/openjdk8-openj9:alpine-jre

MAINTAINER Balázs Molnár <mb@netcode.hu>

ARG JAR_FILE

ADD ${JAR_FILE} app.jar

CMD java -jar /app.jar
