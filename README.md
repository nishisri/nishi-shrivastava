# API Automation 

This project is aimed to test the services of the **_Pet Store_** application 

## Getting Started
In order to setup this project, run the below commands:

- git clone https://github.com/nishishri/nishi-shrivastava.git
- Import the dependencies
### Prerequisites

- Run the **_pet_store_** application on local machine by running below commands. <br>
 Below will host the pet store application at [http://localhost:8080](http://localhost:8080)

- ```
  git clone https://github.com/swagger-api/swagger-petstore
  cd swagger-petstore
  mvn package jetty:run
  ```
 
- [Install](https://gradle.org/install/) gradle & set it to env variable


## Tools Technologies
- Rest Assured using Java
- JUnit 5.3.1

## Running the tests

- After starting the pet store application The test can be run by running following command
```
cd (to this directory)
gradle clean build test
```
