# Aplicación Web de Gestión Institucional

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



