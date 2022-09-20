FROM maven AS build  
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app  
RUN mvn -f /usr/src/app/pom.xml -Dmaven.test.skip=true install

FROM openjdk:17
COPY --from=build /usr/src/app/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]