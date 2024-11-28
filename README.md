# Aplicación Web de Gestión Institucional

<p align="center">
  <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="Java Logo" width="100" height="100">
  <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/spring/spring-original.svg" alt="Spring Logo" width="100" height="100">
</p>

## Introducción

El Instituto Terciario XYZ requiere una solución web para la gestión de datos de alumnos, profesores, carreras y materias. Este proyecto implementa un sistema de gestión que cumple con los objetivos de registro, consulta, actualización y eliminación de datos, usando un Diseño claro y escalable.

---

## Características

### Gestión de Alumnos
- **Campos**: `id_alumno`, `nombre`, `apellido`, `mail`, `teléfono`.
- **Funcionalidades**: Alta, Baja, Modificación y Consulta.

### Gestión de Profesores
- **Campos**: `id_profesor`, `nombre`, `apellido`, `mail`, `teléfono`.
- **Funcionalidades**: Alta, Baja, Modificación y Consulta.

### Gestión de Carreras
- **Campos**: `id_carrera`, `nombre`, `descripción`.
- **Funcionalidades**: Alta, Baja, Modificación y Consulta.

### Gestión de Materias
- **Campos**: `id_materia`, `nombre`, `id_carrera`, `id_profesor`.
- **Funcionalidades**: Alta, Baja, Modificación y Consulta.

---

## Requisitos Técnicos

### Requisitos Funcionales
- CRUD para alumnos, profesores, carreras y materias.
- Interfaz responsiva y fácil de usar.

### Requisitos No Funcionales
- **Arquitectura**: Patrón MVC.
- **Base de datos**: MySQL.
- **Framework**: Spring Boot.
- **Lenguaje**: Java.

---

## Arquitectura del Proyecto

### Estructura
```estructura
src/ 
└── main/ 
├── java/com/irso/proyecto_crud 
│ ├── controller 
│ ├── entity 
│ ├── repository 
│ ├── service 
│ └── ProyectoCrudApplication.java 
└── resources/ 
├── static/ 
├── templates/ 
└── application.properties 
└── test/ 
├── java/com/irso/proyecto_crud 
│ └── ProyectoCrudApplicationTests.java 
├── README.md
├── .gitignore
└── pom.xml

```

### Componentes

- **Modelo**: Define entidades y relaciones de la base de datos.
- **Vista**: Plantillas HTML (Thymeleaf).
- **Controlador**: Gestiona la lógica entre el modelo y la vista.

---

## Configuración del Proyecto

### Archivo `application.properties`
```properties
spring.application.name=proyecto-crud
spring.datasource.url=jdbc:mysql://localhost:3306/instituto
spring.datasource.username=root
spring.datasource.password= *Tu contraseña*
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```

### Dependencias `pom.xml`

- **Spring Boot Starter Web**
- **Spring Boot Starter Thymeleaf**
- **Spring Boot Starter Data JPA**
- **MySQL Connector**
- **Spring Boot Starter Test**
- **Spring Boot DevTools**:

---

## Pruebas

### Pruebas Unitarias

- **Clases de prueba para los servicios usando JUnit.**

### Pruebas de Integracion

- **Verificación de endpoints con Postman.**

## Conclusión

Este proyecto está diseñado para ser modular, escalable y fácil de mantener. Gracias al patrón MVC, permite una separación clara de responsabilidades, asegurando una experiencia de desarrollo eficiente y adaptable.


---
