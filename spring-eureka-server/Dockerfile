FROM openjdk:11.0.3-jdk-stretch
ADD ./target/spring-eureka-server-0.0.1-SNAPSHOT.jar /app/music/spring-eureka-server-0.0.1-SNAPSHOT.jar
WORKDIR app/music
ENTRYPOINT ["java","-jar","spring-eureka-server-0.0.1-SNAPSHOT.jar"]