[⬅ Volver al índice](../../README.md)

🧒 **Palabras del maestro:** "Copiar una nave ya construida para otra misión, el camino del Prototype es."
# Patrón Prototype

## Descripción
📋 **Descripción:** Cuando haces una copia de tu dibujo favorito para compartir con tus amigos, usas el patrón Prototype. Es hacer clones rápidos sin tener que empezar desde cero.

## Aplicación
Este patrón se encuentra implementado en contexto de arquitectura Spring Boot.

## 🧪 Ejemplo en código

```java
abstract class Droid implements Cloneable {
    public abstract void hablar();

    public Droid clonar() throws CloneNotSupportedException {
        return (Droid) super.clone();
    }
}

class R2D2 extends Droid {
    public void hablar() {
        System.out.println("Beep boop!");
    }
}

public class FabricaDroides {
    public static void main(String[] args) throws Exception {
        R2D2 original = new R2D2();
        Droid clon = original.clonar();

        original.hablar();
        clon.hablar();
    }
}
```
