FROM openjdk:11
COPY ./target/calculator-1.0-SNAPSHOT.jar ./
# COPY ./src/main/java/com/example/Calculator.java ./com/example/
WORKDIR ./
CMD ["java", "-cp", "./calculator-1.0-SNAPSHOT.jar", "com.example.Main"]