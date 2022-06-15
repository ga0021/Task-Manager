# Steps to run project

1. open terminal/cmd
2. check maven is install or not (mvn -version)
3. java -jar /target/Task-Manager-0.0.1-SNAPSHOT.jar
4. Open the postman and hit below url with payload

	Post:  http://localhost:8080/task

	{
		"title" :"Sale",
		"description" : "Sale Items",
		"flag" : true
	}
	
	Get: http://localhost:8080/task/getAllTasks
	
	(You will get this kind of record->  [{"title":"Sale","description":"Sale Items","flag":true}] )
