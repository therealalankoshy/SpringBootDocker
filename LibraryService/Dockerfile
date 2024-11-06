#FROM eclipse-temurin:17-jdk-focal
#LABEL authors="AlanKoshy"
#WORKDIR /app
#
#COPY .mvn/ .mvn
#COPY mvnw pom.xml ./
#RUN ./mvnw dependency:go-offline
#
#COPY src ./src
#
#RUN ./mvnw -X clean package
#CMD ["java", "-jar target/LibraryService-0.0.1-SNAPSHOT.jar"]

FROM eclipse-temurin:17-jdk-focal

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]