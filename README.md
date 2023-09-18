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
more in the future.(https://content-creator-calendar-restapi-production.up.railway.app/)

![content-creator-json-data](https://github.com/AlbersSoftware/Content-creator-calendar-RESTAPI/assets/65799182/db1160a3-8026-4d85-9297-f17a58774cbb)

# Hosting
As mentioned above this application is hosted on 
Railway using a Postgres database. The data consist of blogs, videos, and articles. 
(https://content-creator-calendar-restapi-production.up.railway.app/)

[![Deploy on Railway](https://railway.app/button.svg)](https://railway.app/new/template/ZweBXA)

Railway has many DB options and is able to connect directly to a github repository.

![railwayimage](https://github.com/AlbersSoftware/Content-creator-calendar-RESTAPI/assets/65799182/7bb33f22-b03f-4152-97ff-4ce6e19b65a9)

# Future Changes
In the future I would like to add a front end to this application using Vite, Angular, or somthing similar. This project is mainly to showcase my Springboot 3 skills using REST API's, database connections, data validation, dependency injection, and hosting. 
