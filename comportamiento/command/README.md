[⬅ Volver al índice](../../README.md)

🧒 **Disciplina Jedi:** "Cada misión en un holocrón guardada está. Ejecutar según se ordene, Command es."
# Patrón Command

## Descripción
📜 **Descripción:** Es como tener una lista de órdenes que se pueden ejecutar cuando quieras. Cada orden sabe qué hacer, como los comandos de un videojuego.

## Aplicación
Este patrón se encuentra implementado en contexto de arquitectura Spring Boot.

## 🧪 Ejemplo en código

```java
interface Orden {
    void ejecutar();
}

class ApagarSistema implements Orden {
    public void ejecutar() {
        System.out.println("Sistema apagado.");
    }
}

class Control {
    private Orden orden;

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public void ejecutarOrden() {
        orden.ejecutar();
    }
}

public class Consola {
    public static void main(String[] args) {
        Control control = new Control();
        control.setOrden(new ApagarSistema());
        control.ejecutarOrden();
    }
}
```
