FROM amazoncorretto:17
LABEL  maintainer=genesis1625
COPY service/service/target/service-0.0.1-SNAPSHOT.jar service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/service-0.0.1-SNAPSHOT.jar"] 
