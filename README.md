# OAuth2: A Proof of Concept

## About
This is a simple proof of concept for an OAuth2 implementation in Java Spring Boot using the microservices architecture. There are two services: an authorization server and a resource server.

## Getting Started
Once you cloned the repository run the following in the terminal, for each project:
```console
$ ./mvnw spring-boot:run
```
You can now test the endpoints using your preffered tool. First make a `POST` request to `localhost:9050/oauth/token` with basic auth, use `poc-client` and `poc-secret` as username and password, respectively. Also make sure to add the `grant_type`, `client_credentials` to the request body under `form-data`. Below is an example request:
```console
$ curl -H "Accept: application/json" poc-client:poc-secret@localhost:9050/oauth/token -d grant_type=client_credentials
```
You should get an `access_token` in the body of the response.

Now you can make a call to the resource server using the Bearer Token you just recieved from the authorization server `localhost:9051/test`. Below is an example request:
```console
$ curl -H "Authorization: Bearer 4710a0f8-1362-4ed1-beea-95cd385fe6d4" localhost:9051/test
```
You should recieve `Hello World` in the body.
