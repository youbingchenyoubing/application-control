FROM java:8-alpine
VOLUME /tmp
ADD application-trace.jar /app.jar
EXPOSE 8764
ENTRYPOINT ["java","-Djava..egd=file:/dev/./urandom","-Dspring.profiles.active=${SPRING_PROFILE_ACTIVE}","-jar","/app.jar"]