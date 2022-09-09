FROM openjdk:17-alpine
COPY target/product-service-1.0.jar product-service.jar
EXPOSE 9011
ENTRYPOINT ["java","-jar","/product-service.jar"]