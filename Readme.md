<b>Spring Boot</b>

Spring is a web application development framework based on Java. On the other hand Spring
Boot is an extension of the spring framework which eliminated the boilerplate configuration
required for setup a Spring application.


It is a Spring module that offers Rapid Application Development to Spring framework. Spring
module is used to create an application based on Spring framework which requires to configure
few Spring files.

To Run Spring Application: java -jar path

To Stop Spring Application: ctrl + C

<b>Advantages of Spring Boot</b>

Here are some major advantages of using spring-boot:
- Helps you to create a stand-alone application, which can be started using java.jar.
- It offers pinpointed‘started' POMs to Maven configuration.
- Allows you to Embed Undertow, Tomcat, or Jetty directly.
- Helps you to configure spring whenever possible automatically.

<b>Features of Spring Boot</b>
- Starter Dependency
- Auto-Configuration
- Spring Initializer [It is a web tool provided by Spring on its official website. However, you can also create Spring
  Boot project by entering project details.]

<b>Essential Component of Spring Boot</b>
- Spring Boot Starter
- Spring Boot autoconfiguration
- Spring Boot Actuator [Spring Boot Actuator allows you to monitor and manage your application when you want to push
  it for the production. It helps you to control your application by using HTTP endpoints. 
  A shutdown is an endpoint that helps application to be shut down properly. This feature is not
  enabled by default.
  However, you can use it by setting command: management.endpoint.shutdown.enabled=true in
  your application.properties file.
  ]
- Spring Boot CLI [Spring CLI is used for writing in Groovy Spring Boot application, which helps you to concise code.]


<b>RAD Model - Rapid Application Development</b>

RAD or Rapid Application Development process is an adoption of the waterfall model; it targets
developing software in a short period. RAD follow the iterative approach.

SDLC RAD model has the following phases:
- Business Modeling: 
  Based on the flow of information and distribution between various
  business channels, the product is designed.
- Data Modeling: 
  The information collected from business modeling is refined into a set of
  data objects that are significant for the business.
- Process Modeling
- Application Generation: 
  Automated tools are used for the construction of the software, to
  convert process and data models into prototypes
- Testing and Turnover

<b>Spring Boot Starter</b>

Spring Boot has many starters. They are a set of convenient dependency descriptors. Starter
allows you to include these descriptors in your pom.xml.
For example, If you want to work with Spring MVC, you can include “spring–boot–starter–web” as
a dependency in pom.xml.