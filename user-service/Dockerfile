FROM openjdk:11.0.3-jdk-stretch
ADD ./target/SpringBoot_Restful_Service-0.0.1-SNAPSHOT.jar /app/music/SpringBoot_Restful_Service-0.0.1-SNAPSHOT.jar
WORKDIR app/music
ENTRYPOINT ["java","-jar","SpringBoot_Restful_Service-0.0.1-SNAPSHOT.jar"]
