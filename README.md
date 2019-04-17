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