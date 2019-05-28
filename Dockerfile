#pull base image
FROM openjdk:8-jdk-alpine

#expose port 8080
EXPOSE 9898

#copy hello world to docker
ADD target/OrchastratorService-0.0.1-SNAPSHOT.jar /data/OrchastratorService-0.0.1-SNAPSHOT.jar


#default command
CMD java -jar /data/OrchastratorService-0.0.1-SNAPSHOT.jar