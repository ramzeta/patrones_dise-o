# Patrón Factory Method

## Problema
Necesitamos crear objetos sin especificar su clase exacta.

## Solución
Usar un método que devuelva una subclase según el tipo solicitado.

## Ejemplo
Una fábrica que devuelve notificaciones por correo o SMS según un string.

## Cuándo usarlo
- Cuando se necesita una lógica de creación controlada.
- Cuando el tipo de objeto se decide en tiempo de ejecución.
