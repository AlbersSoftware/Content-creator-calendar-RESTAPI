# Content-creator-calendar-RESTAPI

# About This Project

 This project is a REST API content creator template 
made in Maven that can perform CRUD operations 
utilizing a local host connection. I set up an HTTP 
client that can perform GET, POST, PUT, and DELETE 
request and return JSON. I set up a h2 database 
originally but have now created all the configuration 
files needed to use an in memory repository, or a 
JDBC database held up by a docker.yml file. I created 
an SQL schema, and the application is hosted on 
Railway using a Postgres database. Furthermore, I 
have also done dependency injection for these 
database options as well as for spring-data. This 
project uses Jakarda validation for content creation 
and has web binding for any seprate front end 
application by adding Cors cross origin annotation at 
the controller level. This project also implements a 
few filter methods for filtering content. I plan to add 
more in the future.
