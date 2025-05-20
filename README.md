# Backend para Aplicación de Registro de Proyectos
Proyecto generado usando [Spring Initializr](https://start.spring.io/)

Backend para la aplicación web de un hotel, el frontend está desarrollado en Angular.

Este proyecto es desarrollado como parte del curso <b>Soluciones Web y Aplicaciones Distribuidas</b> con <b>NRC 7383</b>, correspondiente al <b>período UPN 2025-1</b>

- ARQUITECTURA: n-capas
## Versiones
- Project: Maven
- Language: Java
- Spring Boot: 3.4.4
- Packaging: jar
- Java: 21

## Documentación
La API debe evolucionar según el modelo de madurez de Richardson, revise la documentación de [Richardson Maturity Model](https://martinfowler.com/articles/richardsonMaturityModel.html) según Martin Fowler

### DTO's
Transformar objetos a DTO y de DTO's a objetos
- [Model Mapper](https://modelmapper.org/)
- [MapStruct](https://mapstruct.org/)

Para incluir model mapper consulte [MVN Repository](https://mvnrepository.com/artifact/org.modelmapper/modelmapper), seleccione la versión de interés y agregue la dependencia en el archivo ```pom.xml```
```
    <dependency>
        <groupId>org.modelmapper</groupId>
        <artifactId>modelmapper</artifactId>
        <version>3.2.3</version>
    </dependency>
```
### Hateoas
Nivel 3 - Modelo de madurez de Richarson
Hateoas
```
    <dependency>
        <groupId>org.springframework.hateoas</groupId>
        <artifactId>spring-hateoas</artifactId>
        <version>2.4.1</version>
    </dependency>
```

### Jakarta Validation
Para hacer validaciones
```
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-validation</artifactId>
        <version>3.4.5</version>
    </dependency>
```
## Base de datos
Revise el motor de base de datos y la cadena de conexión a su base de datos en el archivo ```application.properties``` y actualízelo según corresponda. El proyecto está configurado para trabajar con MySQL, para cambiar de motor de base de datos actualice el archivo ```pom.xml``` 
