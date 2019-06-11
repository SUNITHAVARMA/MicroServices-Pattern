FROM openjdk:11.0.3-jdk-stretch
ADD ./target/springgatewayapi-0.0.1-SNAPSHOT.jar /app/music/springgatewayapi-0.0.1-SNAPSHOT.jar
WORKDIR app/music
ENTRYPOINT ["java","-jar","springgatewayapi-0.0.1-SNAPSHOT.jar"]