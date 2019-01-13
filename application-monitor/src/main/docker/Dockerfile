FROM java:8-alpine
VOLUME /tmp
ADD application-monitor.jar /app.jar
EXPOSE 8763
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=${SPRING_PROFILE_ACTIVE}","-jar","/app.jar"]