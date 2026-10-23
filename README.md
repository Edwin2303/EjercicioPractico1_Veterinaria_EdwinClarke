# Clínica Veterinaria — proyecto de práctica

Tecnologías: Java 21, Spring Boot 3.2, Spring MVC, Spring Data JPA, Thymeleaf, Bootstrap y MySQL.

## Ejecutar
1. En MySQL Workbench, revise `database/veterinaria_citas.sql` y ejecútelo. El script elimina y vuelve a crear la base `veterinaria_citas` si ya existe.
2. Abra como proyecto Maven en NetBeans la carpeta que contiene `pom.xml`.
3. Revise `src/main/resources/application.properties` para confirmar usuario y contraseña MySQL.
4. Ejecute `cr.edwin.veterinaria.VeterinariaApplication`.
5. Abra http://localhost:8086

## Rutas
- `/` Inicio y formulario de consultas
- `/tipos` CRUD de tipos de servicio
- `/servicios` CRUD de servicios veterinarios
- `/citas` listado de solo lectura

Proyecto de práctica: revise y pruebe los flujos y adapte el contenido antes de usarlo.
