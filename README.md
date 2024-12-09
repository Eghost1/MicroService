# Proyecto de Microservicios para Estrategia de Micronegocios

Este proyecto es una aplicación basada en microservicios diseñada para gestionar estrategias de micronegocios. La aplicación permite la administración de diferentes aspectos de los micronegocios, como situaciones, objetivos, departamentos, cargos, modelos y submodelos.

## Tecnologías Utilizadas

- **Java**: Lenguaje de programación principal.
- **Spring Boot**: Framework para el desarrollo de aplicaciones basadas en microservicios.
- **Spring MVC**: Para la creación de controladores y manejo de rutas.
- **Spring Data JPA**: Para la persistencia de datos.
- **Thymeleaf**: Motor de plantillas para la generación de vistas HTML.
- **Maven**: Herramienta de gestión de dependencias y construcción del proyecto.
- **Eureka**: Para el descubrimiento de servicios.
- **PostgreSQL**: Base de datos relacional.


## Estructura del Proyecto

El proyecto está dividido en varios microservicios, cada uno con su propia responsabilidad:

- **backend/microservice-bff**: Backend for Frontend, maneja la lógica de negocio y la comunicación con otros microservicios.
- **backend/MC_ESTRATEGIA_EST_MODELO**: Microservicio para la gestión de modelos de estrategia.
- **backend/MC_ESTRATEGIA_EST_ORG_DEPTO**: Microservicio para la gestión de departamentos organizacionales.
- **backend/MC_ESTRATEGIA_EST_SUB_MODELO**: Microservicio para la gestión de submodelos de estrategia.
- **backend/MC_ESTRATEGIA_ORG_CARGO**: Microservicio para la gestión de cargos organizacionales.
- **backend/Micro-Negocio**: Microservicio principal para la gestión de micronegocios.
- **backend/microservice-eureka**: Servidor de descubrimiento de servicios.
- **backend/microservice-gateway**: Puerta de enlace para el enrutamiento de solicitudes.

