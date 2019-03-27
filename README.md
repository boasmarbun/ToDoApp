# ToDo Application

This is a ToDo application, an API made with JAVA API that has basic CRUD(Create, Read, Update, Delete). This API is made to fulfill the Jenius apprentice test.


## Prerequisites
1. [Java](https://www.oracle.com/technetwork/java/javase/downloads/index.html) (version 1.6 or later)
2. [Eclipse](https://www.eclipse.org/)
3. API Development Environment e.g. [Postman](https://www.getpostman.com/)

## How to Install
1. Install eclipse
2. Clone the repository and open in eclipse
3. Run the Application (Follow the steps in the picture in the "steps" folder)
4. Use the ToDo Application

## How to Use
Actions URI:

* Get :

  [http://localhost:8080/ToDoApp/to_do/todolist](http://localhost:8080/ToDoApp/to_do/todolist)

  [http://localhost:8080/ToDoApp/to_do/todolist/id](http://localhost:8080/ToDoApp/to_do/todolist/id)


* Post :

	[http://localhost:8080/ToDoApp/to_do/todolist
](http://localhost:8080/ToDoApp/to_do/todolist)

* Put :
	
   [http://localhost:8080/ToDoApp/to_do/todolist/id
](http://localhost:8080/ToDoApp/to_do/todolist/id)

* Delete

	[http://localhost:8080/ToDoApp/to_do/todolist/id](http://localhost:8080/ToDoApp/to_do/todolist/id)



Sample Input Data :

* json
```json
{
      "id": "T004",
      "task": "Create a todoapp",
      "finished": "true"
}
```



***Notes***

Post -> add new data if key doesn't exist, overwrite data if key exist

Put -> update data if key exist

If there is an error, feel free to contact me at boas.marbun@yahoo.com !
