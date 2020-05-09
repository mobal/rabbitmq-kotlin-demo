# rabbitmq-kotlin-demo

A Spring application demonstrating RabbitMQ integration.

### Docker

First build and assemble jar using Gradle:

```gradle clean build assemble```

Build image using docker:

```docker build . --build-arg JAR_FILE=./build/libs/rabbitmq-kotlin-demo-0.0.1-SNAPSHOT.jar```

Create a new container and run.
