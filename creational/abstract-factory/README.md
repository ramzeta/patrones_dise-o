# Patrón Abstract Factory

## Problema
Queremos crear familias de objetos relacionados sin acoplar el código a clases concretas.

## Solución
Definir una interfaz de creación para cada tipo de objeto y concretarla según el contexto.

## Ejemplo
Una fábrica que crea botones oscuros o claros según el tema de la UI.

## Cuándo usarlo
- Cuando hay productos relacionados entre sí.
- Para mantener consistencia entre familias de objetos.
