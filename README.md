# softtech-benchmark-demo

You can find two different api gateway project, an eureka client register server and a simple rest web api inside of the repository

* Spring Clout Gateway API is hosted port 8081

* Zuul Gateway API is hosted port 8081

* Spring Web API is hosted port 8082

* Eureka Server is hosted port 8761 

# How to run project

Other than Zuul all projects are working well with SDK 19 version. However, since Zuul is a bit deprecated 1.8 SDK is needed.

All of them are maven projects. So that you can just mvn clean compile -DskipTests in order to see the projects.

I prefer run projects before eureka. Then, you can see the instances that are registered in eureka via localhost:8761 like as ZUUL-API-GATEWAY, SPRING-API-GATEWAY etc.

Since it is a clear project. Filters and other types of routing mechanism can be added with implementing necessary Zuul & Spring Cloud Gateway like ZuulConfig etc.

You can see the JMeter Test results by clicking [here](https://github.com/adrionur/softtech-benchmark-demo/blob/main/apache%20jmeter%20result.png)

Any further details please contact:
* [My e-mail](mailto:adrionur@gmail.com)
