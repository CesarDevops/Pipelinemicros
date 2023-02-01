FROM openjdk:8-jre-alpine
RUN mkdir servicio
COPY build/libs/*.jar servicio/
ENTRYPOINT ["java", "-jar", "servicio/image-1.0.jar"]
EXPOSE 8080