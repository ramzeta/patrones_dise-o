![Categorías de Patrones](./docs/categorias-patrones.png)

# Patrones de Diseño en Arquitectura Spring Boot

## 💡 Lema
**Soluciones reutilizables y probadas que ayudan a solucionar problemas comunes**

## 🎯 Objetivo
Este repositorio contiene implementaciones reales de los principales **patrones de diseño**, enfocados en aplicaciones backend utilizando **Spring Boot** bajo principios SOLID y arquitectura hexagonal.

Cada patrón está explicado con:
- 📘 Documentación clara del problema y la solución
- 🧱 Código de ejemplo real en Java
- 🧪 Pruebas unitarias
- 🔁 Casos de uso reales en microservicios, servicios REST, factories, DTOs, etc.

---

## 🧩 Patrones incluidos (progresivamente)

### 🔨 Creacionales
- [Builder](./creacionales/builder/README.md)
- [Factory Method](./src/creacionales/factory-method/README.md)
- [Abstract Factory](./src/creacionales/abstract-factory/README.md)
- [Prototype](./src/creacionales/prototype/README.md)
- [Singleton](./src/creacionales/singleton/README.md)
- [Factory Function](./src/creacionales/factory-function/README.md)

### 🧱 Estructurales
- [Adapter](./src/structural/adapter/README.md)
- [Facade](./src/structural/facade/README.md)
- [Decorator](./src/structural/decorator/README.md)
- [Composite](./src/structural/composite/README.md)

### 🔁 Comportamiento
- [Strategy](./src/comportamiento/strategy/README.md)
- [Command](./src/comportamiento/command/README.md)
- [Observer](./src/comportamiento/observer/README.md)
- [Chain of Responsibility](./src/comportamiento/chain-of-responsibility/README.md)
- [Template Method](./src/comportamiento/template-method/README.md)
- [State](./src/comportamiento/state/README.md)

---

## 🧭 Aplicabilidad de Patrones de Diseño

A continuación se muestra una tabla que resume qué tan comunes son los patrones de diseño según el tipo de arquitectura. Aunque todos pueden usarse tanto en backend como frontend, algunos tienen aplicaciones más frecuentes en un contexto específico.

| Patrón                      | Backend (Spring Boot)       | Frontend (Angular, etc.)  | Comentario breve                              |
| --------------------------- | --------------------------- | ------------------------- | --------------------------------------------- |
| **Builder**                 | ✅ Muy común                 | 🔸 Opcional               | Construcción paso a paso de objetos complejos |
| **Factory / Abstract**      | ✅ Muy útil                  | 🔸 A veces útil           | Creación dinámica de objetos / servicios      |
| **Singleton**               | ✅ (Spring beans)            | 🔸 Servicios globales     | Instancia única por contexto                  |
| **Prototype**               | ✅ Poco común                | 🔸 Rara vez               | Clonar objetos configurados                   |
| **Factory Function**        | ✅ Sí                        | ✅ Componentes dinámicos   | Generación flexible en tiempo de ejecución    |
| **Adapter**                 | ✅ Muy común                 | 🔸 A veces                | Adaptar interfaces incompatibles              |
| **Bridge**                  | ✅ En capas                  | 🔸 Poco frecuente         | Separar abstracción de implementación         |
| **Composite**               | ✅ Árboles, validaciones     | ✅ Componentes anidados    | Estructuras jerárquicas reutilizables         |
| **Decorator**               | ✅ Muy útil                  | ✅ Decoradores Angular     | Añadir funcionalidad sin alterar el original  |
| **Facade**                  | ✅ Agrupar servicios         | ✅ Simplificar lógica      | Ocultar complejidad tras una interfaz clara   |
| **Proxy**                   | ✅ Seguridad, logging        | 🔸 Poco común             | Interceptar operaciones                       |
| **Flyweight**               | 🔸 Raro pero válido         | 🔸 Raro                   | Optimización de uso de objetos                |
| **Chain of Responsibility** | ✅ Validaciones              | 🔸 Flujo de eventos       | Procesamiento en cascada                      |
| **Command**                 | ✅ CQRS, eventos             | 🔸 Acciones encapsuladas  | Encapsular comportamiento como objeto         |
| **Strategy**                | ✅ Muy común                 | ✅ UI dinámica             | Algoritmos intercambiables                    |
| **Observer**                | ✅ Eventos Spring            | ✅ RxJS, Forms             | Notificación de cambios                       |
| **State**                   | ✅ Máquinas de estados       | ✅ Store, UI               | Cambios de comportamiento por estado          |
| **Template Method**         | ✅ Clases base               | 🔸 Poca necesidad directa | Definir estructura y permitir extensiones     |
| **Visitor**                 | 🔸 Procesadores             | 🔸 Muy raro               | Ejecutar lógica sobre estructuras distintas   |
| **Mediator**                | 🔸 Coordinador de servicios | ✅ Servicios compartidos   | Comunicar sin acoplamiento directo            |

**Leyenda**:
✅ Muy utilizado
🔸 Aplicable pero menos frecuente

---