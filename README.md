1. Todo application
Tech : spring boot, spring web, thymeleaf, lombok, jpa, h2, bootstrap
CSS: <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
Access : http://localhost:8080/
Description: You can add the tasks. You can toggle and delete the task as well.

3. Real Time chat application
Tech: Spring boot, spring websocket, spring messaging (STOMP protocol), Thymeleaf
CSS: <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
SOCKETJS : <script src="https://cdn.jsdelivr.net/npm/sockjs-client@1/dist/sockjs.min.js"></script>
STOMP.JS: <script src="https://cdnjs.cloudflare.com/ajax/libs/stomp.js/2.3.1/stomp.min.js"></script>
Frontend : Thymeleaf, javascript (ES6), SockJS, STOMP.js, HTML/CSS, Bootstrap
https://github.com/sockjs/sockjs-client - sockjs
https://github.com/stomp-js/stompjs - stompjs

Access: http://localhost:8080/chat

Description: The websocket connection will be created when /chat endpoints hits, if someone hits the message who ever connected to topic or broker all will get message

3.  invoice : it is crud app

4.  Ecommerce Backend,
Tech: Spring web, JPA, lombok

EcommerceFrontEnd
Tech: vite, react-bootstrap, react

Description: It will have the products which you can search by categories, by character and ascending to descending.

steps involved:
npm create vite@latest ecommercebackend
npm run dev
npm install bootstrap react-bootstrap


5. Process csv data to DB using spring batch
Tech: Spring web, batch, JPA, hibernate

Link: http://localhost:8080/jobs/importCustomers


Working:

	JobLauncher -> Job -> Step -> ItemReader    source (csv)
	                           -> ItemProcesser
				   -> ItemWriter    destination (database)
		|
		|
	JobRepository
		|
		|
	Database


 6. github-outh:

    This is the web application where using github for authorization

    Steps:
    
# In github developer settings -> oath2 app -> new oauth, add the following callback URL
# Authorization callback URL : http://localhost:8000/login/oauth2/code/github
#Homepage url : http://localhost:8000
#application name : any name
#description : any description
#you will get client-id and client-secret
# add the client secret and id in application.properties

When you hit the http://localhost:8000 it will go to github and ask to enter username and password and ask for authentication and authorization. Once you allow, it will ask route to Homepage URL.
	


