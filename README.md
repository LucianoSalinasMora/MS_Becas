# MS_Becas
Administra las asignaciones de ayuda económica, financiamiento estatal o convenios internos aplicados directamente a los aranceles de los estudiantes.

## Especificaciones Técnicas
* **Puerto:** `8008`
* **Base de Datos (Laragon):** `becas_db`
* **Tecnologías:** Spring Boot 4.0.6, CRUD Arquitectura

## Funcionalidades
* Registro de beneficios económicos activos (porcentaje de cobertura o montos fijos).
* Auditoría de vigencia y vencimiento de becas por periodos anuales.

## Endpoints Principales
* `POST /api/v1/becas` - Asignar un beneficio económico a un estudiante.
* `GET /api/v1/becas/estudiante/{rut}` - Consultar las becas vigentes del alumno.
