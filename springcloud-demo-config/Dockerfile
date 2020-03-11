FROM java:8

VOLUME /tmp

COPY springcloud-demo-config-0.0.1-SNAPSHOT.jar app.jar

RUN bash -c "apt-get update"

RUN bash -c "apt-get -y install netcat"

RUN bash -c "touch /app.jar"

ENTRYPOINT ["java", "-jar", "app.jar"]
