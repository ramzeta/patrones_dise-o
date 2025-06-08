# Patrón Facade

## Problema
El cliente necesita interactuar con múltiples servicios para completar una tarea.

## Solución
Proporcionar una fachada unificada que simplifique el acceso a subsistemas complejos.

## Ejemplo
Una clase `NotificationFacade` que combina `EmailService` y `ReportService`.

## Cuándo usarlo
- Cuando se quiere simplificar la API para el consumidor
- Para ocultar lógica de integración compleja
