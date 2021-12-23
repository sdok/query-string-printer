The project prints the query string to the console.
You run the project with;
    docker build -t IMAGE_NAME .
    docker run -p 80:8080 IMAGE_NAME

You can send the request like below
    curl -X GET 'localhost:8080/send-message?product=gaming-console'