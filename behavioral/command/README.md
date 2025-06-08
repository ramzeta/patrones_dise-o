# Patrón Command

## Problema
Encapsular una solicitud como un objeto para parametrizar acciones y soportar operaciones como deshacer.

## Solución
Crear objetos comando que contengan una acción y su receptor.

## Ejemplo
Un control remoto que ejecuta comandos sobre una luz (`LightOnCommand`).

## Cuándo usarlo
- Para colas de tareas
- Implementar undo/redo
- Desacoplar emisores de receptores
