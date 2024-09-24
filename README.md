Getting Started
Set Up MySQL To set up the MySQL database, navigate to the project's root directory where the docker-compose.yml file is located.
Once the application is running, you can enter commands into the console to interact with the university data.

Technologies Used
Java 22
Spring Boot
Spring Data JPA
MySQL

Task:
Create a simple Spring Boot Java project with the console interface for the university, which consists of departments and lectors. The lectors could work in more than one department. A lector could have one degree (assistant, associate professor, professor).

All data is stored in the relational database.  
Please send us a link to the GitHub repository with your version of this project.

The app should implement such commands:

User Input: Who is head of department {department_name}
        Answer: Head of {department_name} department is {head_of_department_name}

User Input: Show {department_name} statistics.
           Answer: assistans - {assistams_count}. 
        associate professors - {associate_professors_count}
        professors -{professors_count}

3. User Input: Show the average salary for the department {department_name}.
            Answer: The average salary of {department_name} is {average_salary}

4. User Input: Show count of employee for {department_name}.
	Answer: {employee_count}

5. User Input: Global search by {template}.   
         Example: Global search by van
	Answer: Ivan Petrenko, Petro Ivanov


Good luck! 🤞, 
BotsCrew
