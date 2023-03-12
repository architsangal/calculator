FROM openjdk:11
EXPOSE 8080
ADD ./src/calculator/target/calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
ENTRYPOINT [ "java","-jar","/calculator-1.0-SNAPSHOT-jar-with-dependencies.jar" ]