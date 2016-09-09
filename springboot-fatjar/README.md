SpringBoot Camel Application
============================

This is an example of a Camel application developped using Spring Boot


Description
-----------
A Spring Boot application is an executable jar or war. <br>
It requires a "main" method that will be used to launch the Spring Boot app --> SpringApplication.run <br>
The executable is build by a maven plugin that requires the spring-boot-starter-actuator dependency. <br>
It's recommended to specify the mainClass in the maven springboot plugin, reponsible for building the executable.

The main class of the Spring Boot application is MySpringBootRoute.java <br>
This class has been turned into a Spring Boot application because it extends fatJarRouter.
fatJarRouter itself extends RouteBuilder and contain a main method to launch the SpringApplication.

The fatjarRouter has to be specified:
 - in the application.yml file
 - in the mainClass of the maven plugin

Once build, the application can be run using:
 - mvn spring-boot:run
 - java -jar target/app.jar

The camel.springboot.main-run-controller property is needed to ensure the camel thread stays alive.


