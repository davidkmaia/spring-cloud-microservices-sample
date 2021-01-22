
This is a proof of concept to demonstrate Spring Cloud and microservices. The goal is to build some microservices so that they are fully integrated, with guaranteed transactions and traceable.

# Business model

<h1 align="left">
  <img alt="NextLevelWeek" title="#NextLevelWeek" src="./resources/images/businessModel.png" />
</h1>

# About each module

## Store Flow Service Module

The store represents a florist, who knows all suppliers in each region or state. That is, after an online purchase in a specific region, the store will consult with suppliers in that region.

The source code is located in "store-ms".

## Supplier Flow Service Module

The supplier is responsible for receiving orders from the store and will inform you how long orders will be ready.

The source code is located in "supplier-ms".


# How to build

```bash
mvn clean install
```

# How to run the store service

```bash
mvn spring-boot:run -f store-ms
```

# How to run the supplier service

```bash
mvn spring-boot:run -f supplier-ms
```

# To do list

- [x] Build a store sample service
- [x] Build a supplier sample service
- [ ] Add tests for store service
- [ ] Add tests for supplier service
- [ ] Enable distributed tracing with spring sleuth