This is a very small JPA example with one entity.

**dependencies**

- The project was created with Spring Initializr with the following dependencies
- Spring Data JPA
- H2 Database
- PostgreSQL Driver
- 
  **src/main**

- The main application uses a PostgreSQL database on AWS
- The schema is created automatically in this example based on JPA annotations

**src/test**

- the tests run on an embedded H2 database
- the schema is created automatically based on the JPA annotations
- a data.sql file in src/test/resources is executed automatically
