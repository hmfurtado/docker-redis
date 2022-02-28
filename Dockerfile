FROM openjdk:17-alpine

RUN mkdir /app

WORKDIR /app

COPY ./target/*jar .

ENTRYPOINT java -jar app.jar