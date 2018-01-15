# spring-jpa-querydsl-example
Spring boot jpa querydsl REST API example

##
### Prerequisites
- JDK 1.8
- Maven 3 or later (3.5)
  - https://maven.apache.org/install.html
- GIT
  - https://git-scm.com/downloads 
  
## Quick Start

### Clone source
```
git clone https://github.com/jeonguk/spring-jpa-querydsl-example.git
cd spring-jpa-querydsl-example
mvn clean install
mvn spring-boot:run
```

### Visit
- http://localhost:80080/

### TEST URL
- http://localhost:8080/api/myusers?search=lastName:doe,age>25

### H2 DB console
- http://localhost:8080/console


---
##
### Reference 
- http://www.baeldung.com/rest-api-search-language-spring-data-querydsl
- https://github.com/eugenp/tutorials/tree/master/spring-rest-query-language
