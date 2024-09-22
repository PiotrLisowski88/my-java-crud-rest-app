Clone the repository to your local machine using the following command:
```
git clone https://github.com/PiotrLisowski88/my-java-crud-rest-app.git
```

## Running the application

1. Create .env file as provided .env.example and fill it with given database credentials. 

To run the application, you need to have Java 17 installed on your machine.
You can download it from [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)

Go to the

`src/main/java/com/codingtree/app/rest/RestApiApplication.java` and run it on IDE or use the following command to run the application.
```
./mvnwclean package 
```

and
```    
.docker-compose up --build  
```
After docker image is built, you can access the application on `http://localhost:8080/`

## API Documentation
API documentation is available below:

Example POST request:
```
localhost:8080/add
{
    "firstName": "New guy in town.",
    "lastName": "Very good student",
    "age": "12"
}
````
Example PUT request:
````
localhost:8080/update/1
{
"firstName": "Dr.",
"lastName": "Dre",
"age": "51"
}
````
Example DELETE request:
````    
localhost:8080/delete/1
````
You Can GET all Students by:
```
localhost:8080/students
```




