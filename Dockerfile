FROM openjdk:19
LABEL maintainer="javaguides.net"
ADD target/Pakket-management-0.0.1-SNAPSHOT.jar backend-docker.jar
ENTRYPOINT ["java","-jar","backend-docker.jar"]