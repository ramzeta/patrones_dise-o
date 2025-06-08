[⬅ Volver al índice](../../README.md)

🧒 **Maestro Yoda enseña:** "Un plan general sigues, pero pequeños pasos cambias. El camino del Template Method es."
# Patrón Template Method

## Descripción
📖 **Descripción:** Es como una receta con pasos fijos. Siempre se sigue el mismo esquema, pero puedes cambiar pequeños ingredientes.

## Aplicación
Este patrón se encuentra implementado en contexto de arquitectura Spring Boot.

## 🧪 Ejemplo en código

```java
abstract class Entrenamiento {
    public final void entrenar() {
        saludar();
        practicar();
        despedirse();
    }

    protected abstract void practicar();

    protected void saludar() {
        System.out.println("¡Que la fuerza te acompañe!");
    }

    protected void despedirse() {
        System.out.println("Entrenamiento finalizado.");
    }
}

class EntrenamientoEspada extends Entrenamiento {
    protected void practicar() {
        System.out.println("Practicando combate con sable.");
    }
}

public class Aula {
    public static void main(String[] args) {
        Entrenamiento entrenamiento = new EntrenamientoEspada();
        entrenamiento.entrenar();
    }
}
```
