FROM mfriedenhagen/docker-maven 
EXPOSE 8080  8081
ADD ./helloworld/target/helloworld-0.0.1-SNAPSHOT.jar /opt/myapp/helloworld.jar
CMD java -jar /opt/myapp/helloworld.jar server /opt/myapp/yml/helloworld.yml
