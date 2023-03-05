# Springboot-Microservices-Project
In this article series I’m going to explain using order API concept with spring boot based microserices architecture. Initially I’ll develop the core API which will evolve as a full fledged REST API collection until deployments.
# Microservices Inside This Project
Here this project consist of mainly 6 microservices and those are,

- User service (banking-core-user-service) – This service includes all the operations under the User such as registrations and retrieval. Additionally, this API consumes keycloak REST API to register and manage the user base while using the local PostgreSQL database as well.
- Fund transfer service (banking-core-fund-transfer-service) – This is the service that handles all the fund transfers between accounts and this API will push messages to a centralized RabbitMQ queue to use from the Notification service.
- Payment service (banking-core-payments-service) – This service will include all the API endpoints to process Utility payments in this project and that will push notification messages to RabbitMQ as well.
- Notification service – This API is registered under the service registry but consumes all the messages from RabbitMQ and pushes necessary notifications to the end users.
- Banking core service – This is the banking core service that acts as a dummy banking core with accounts, users, transaction details, and processors for banking transactions.
![Screenshot (4)](https://user-images.githubusercontent.com/66633900/221414815-08c2859d-4a54-49ae-a492-258ac0fb492a.png)

