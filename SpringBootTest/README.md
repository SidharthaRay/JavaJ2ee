Hello World Program Using Spring Boot
=====================================

How to run the program?
The packaging of all libraries in one jar isn't trivial but Spring Boot offers a nice Maven plugin. All we need to execute is the maven package goal by running mvn package in the shell. The resulting jar file in the target folder has a size of about 4MB and contains all classes and libraries. To execute the jar we need to run the following command: java -jar target/spring-skeleton-0.0.2-SNAPSHOT.jar.


Reference:
http://bits-and-kites.blogspot.in/2014/01/spring-boot-example.html