==> A Spring Boot application to manage employees, projects, their assignments and reporting.  
     This system provides REST APIs and simple frontend integration (AJAX + Bootstrap) to handle employee and project data efficiently.


==> Backend:- 
	-   Java 17+, Spring Boot, Spring Data JPA  
	-   Database: MySQL  
	-   Frontend: HTML, CSS, Bootstrap 5, AJAX  
	-   Build Tool: Maven

==> Clone the repository:-

   	git clone https://github.com/kaushalp8095/Project-Management-System-API.git

==> Employee&ProjectManagementSystem import in eclipse by following Step :-

    	go to File and click on Import and click on Exiting Maven Project 
    	then after select loction for project and select and finish.
    

==>Configure Database.

==>Create a MySQL database.

==>Update application.properties with your DB credentials:-

==>spring.application.name=ProjectManagementSystem

	spring.datasource.url=jdbc:mysql://localhost:3306/employeeDb
	spring.datasource.username=kaushal
	spring.datasource.password=123456
	spring.datasource.driver-class-name=com.mysql.jdbc.Driver

	spring.jpa.hibernate.ddl-auto=update
	spring.jpa.show-sql=true
	spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

==>MySql Database uploaded in Employee&ProjectManagementSystemAPI.

==>Run the project.
