FROM java:8
WORKDIR /
ADD target/*.jar factoryPattern.jar
EXPOSE 8088
CMD java -jar factoryPattern.jar
