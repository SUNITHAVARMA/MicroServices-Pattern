FROM openjdk:11.0.3-jdk-stretch
ADD ./target/TopicsDemo-0.0.1-SNAPSHOT.jar /app/music/TopicsDemo-0.0.1-SNAPSHOT.jar
WORKDIR app/music
ENTRYPOINT ["java","-jar","TopicsDemo-0.0.1-SNAPSHOT.jar"]