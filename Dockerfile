FROM eclipse-temurin:22-jre-alpine


COPY target/consumer-1.0-SNAPSHOT.jar /consumer.jar
COPY target/provider-1.0-SNAPSHOT.jar /provider.jar
COPY target/service-1.0-SNAPSHOT.jar /service.jar

ENTRYPOINT ["java", "-cp", "/consumer.jar:/provider.jar:/service.jar", "com.example.consumer.Main"]