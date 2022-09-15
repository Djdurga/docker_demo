FROM java:8

EXPOSE 8080

ADD target/docker_demo-0.0.1-SNAPSHOT.jar docker_demo.jar

ENTRYPOINT ["java","-jar","/docker_demo.jar"]