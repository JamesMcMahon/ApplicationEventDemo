# Spring Application Events Demo

This is a simple demo project to show how to use Spring Application Events.

The event can be tested as either:

* an e2e test in `EventTests`
* by invoking a controller, 
```sh
./gradlew bootrun
curl -X POST http://localhost:8080/trigger
```