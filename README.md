# Customer Portal

Customer Portal is a web application built to maintain records of different customers in Database. The application is divided into different layers to handle different tasks and to maintain code modularity.
This application is developed using Spring boot framework in Java. Here are different layes of project:

Controller:
---------------
- The controller handels all the requests from user and present view as per request. It also makes use of service to handle functionality.


Service:
---------------
- Service contains the backend logic of application. 

- It contatins features like saving customer, updating customer and deleting customer from list


Model:
---------------

- Model contains the structure for Customer Object.

- It contains properties of Customer


Repository:
---------------

- Repository is used to handle all the database operations.

- Service connects with repository when all DB operation is performed.



1. Save Customer Page

![alt text](https://github.com/Princedeep/SpringBootWebApp/blob/master/new_customer.JPG)


2. View/Update/Delete Customer Page

![alt text](https://github.com/Princedeep/SpringBootWebApp/blob/master/view_update.JPG)




