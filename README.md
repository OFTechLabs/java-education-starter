# java-education-starter

Starter for the Java Education exercises

## Project Layout

```
microservice-root
--api                           Jax-RS resources (REST)
--api-integration-test          Integration Tests for Jax-RS resources (REST)
--dao                           Entitymanager/QueryDSL/JPA Services layer                               
--logger                        Logging (No need to modify)
--model                         Entities/JPA models
--resources                     Documentation and SQL scripts
--web                           This is where the artifact is combined and created for deployment
```

## Weblogic Server Setup

Note: the context root in `weblogic.xml` is: `/education` so the URL after deploying locally is: `http://localhost:7001/education`

Tip: Do this part with your coach, because they have done it many times.

### Setup run configuration (Intellij)

1. Open cloned GIt repo in Intellij
1. Click edit configuration (next to run button)
1. Click `+` to add a configuration for the Application Server
1. Add your local WLS doman to the `domainpath` for example: `D:\Oracle\Middleware_*\user_projects\base_domain`
1. Add the username and password for the admin user which was configured during the WLS installation
1. In the deployment tab, click add and add the `web:war`
1. Apply

### Building the starter

To build the starter run `clean install` on the root project through Maven in Intellij, or in the terminal run:

```
mvn clean install -U
```

Make sure the build command is run on the root folder.

### Run

Now run the build deployment using the Run configuration (top right), navigate to:
 
```
http://localhost:7001/education/api/dummy
``` 
in the browser when it is running. You should get the following response:

```
cdi-injected
```

If you get the correct response, feel free to start the exercises, ask your coach to help you with the setup part until you get the correct response. 

### Extra: debug configuration

If you are comfortable using the Java debugger in Intellij, here is how to configure it for the exercises. If you have not used a debugger before, just skip this step for now, it is not essential.

#### JVM arguments

Edit the WLS run configuration with the following VM options:

```
-server -Xrs -Xdebug -Xnoagent -Xrunjdwp:transport=dt_socket,address=3999,server=y,suspend=n -Djava.compiler=NONE
```

#### Debug run configuration

1. Go to the run configuration in the top right (Same as Weblogic)
1. Click `+` and choose `Remote`
1. Give it a name such as `Debug`
1. Change the port to `3999` (same as in VM options)
1. Apply

To debug: select the debug option and click the debug icon (default keyboard shortcut: Shift+F9) 

## JPA Exercies

Hints for the JPA Exercises:

* model/src/main/resources/META-INF/persistence.xml needs to be configured correctly
* Add Entities to the `model` module
* Add the Dao's (exercises related to the EntityManager) to the `dao` module

## REST Endpoint exercises

Hints for the JAX-RS (REST) exercises:

* Add all resources to the `api` module and test them in `api-integration-test`
* Endpoints need to be added to the `ApplicationConfig`

## JSON Parsing (Jackson) exercises

Hints for the JSON parsing exercises:

* Register Jackson with Jax-RS in the `ApplicationConfig`
* Perform the exercises in the `api` module

## Dependency Injection (CDI) exercises

Hints for the CDI exercisees:

* Perform the exercises in the `api` module
* Remember to register the interceptors

## Final exercise

To verify all learning goals have been achieved, a final exercise can determine whether all subjects have been sufficiently mastered. The exercise consists of creating a micro-service from scratch, with a connection to the Database and REST-endpoints to interact with the micro-service.

### Application Requirements

* Connection with a database with several tables
* Entities configured correctly to reflect schema
* EntityManager is used to persist and remove data from the Database
* QueryDsl is used to fetch data from the database
* Rest endpoints are available to receive data from the database in JSON format
* Rest endpoints are available to update data on the database through JSON input
* Rest endpoints validate the incoming JSON input
* Rest endpoints are available to remove data from the database
* Integration tests verify the rest endpoints are working correctly

If an application has been created from scratch which demonstrates above functionality, the basics have been sufficiently mastered.

### Approach 

It is not necessary to complete the final exercise in one go, or in a certain amount of time. Nor is it necessary to complete the assignment completely on your own, feel free to ask your team-members to explain certain parts if you are stuck. Team-members however, cannot write the code for you, they can help and explain but they cannot solve it for you. Pairing is fine as long as you are the one doing the typing and understand what you are typing and why.

Discuss the approach with your coach and team-lead to come up with a personal approach to the final exercise that matches the situation you are in.