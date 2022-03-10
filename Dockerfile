FROM openjdk:11
ADD . /usr/src/myapp
WORKDIR /usr/src/myapp
ENTRYPOINT ["java", "-jar" , "postgres-dal-api-0.0.1-SNAPSHOT.jar"]
