# OAuth2 – Client Credentials Grant: A Proof of Concept

## About
This is a simple proof of concept for an OAuth2 implementation for the client credentials grant in Java Spring Boot using the microservices architecture. There are four servers: an authorization server, a resource server, a gateway server and discovery server. All servers are Eureka clients, except for the discovery server, which is a Eureka server. The gateway is a Zuul gateway.

## Getting Started
Once you cloned the repository, run the following in the terminal, for each project:
```console
$ ./mvnw spring-boot:run
```
You can now test the endpoints using your preferred tool. First make a `POST` request to `localhost:8762/api/auth/oauth/token` with basic auth, use `poc-client` and `poc-secret` as username and password, respectively. Also make sure to add the `grant_type`, `client_credentials` to the request body under `form-data`. Below is an example request:
```console
$ curl -H "Accept: application/json" poc-client:poc-secret@localhost:8762/api/auth/oauth/token -d grant_type=client_credentials
```
You should get an `access_token` in the body of the response.

Now you can make a call to the resource server using the Bearer Token you just recieved from the authorization server `localhost:8762/api/resource/test`. You have to put the Bearer Token in the Authorization header. Below is an example request:
```console
$ curl -H "Authorization: Bearer cf4ca8ee-4722-4860-91ab-43520dd6b98d" localhost:8762/api/resource/test
```
You should recieve `Hello World!` in the body.
