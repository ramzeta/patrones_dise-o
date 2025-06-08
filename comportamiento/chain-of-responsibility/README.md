[⬅ Volver al índice](../../README.md)

🧒 **Sabiduría Jedi:** "Si un Jedi no puede resolverlo, al siguiente lo pasa. Así fluye la Chain of Responsibility."
# Patrón Chain Of Responsibility

## Descripción
📬 **Descripción:** Como pasar una carta entre varios hasta que alguien decide abrirla. Así funciona este patrón: uno tras otro hasta que alguien se encarga.

## Aplicación
Este patrón se encuentra implementado en contexto de arquitectura Spring Boot.

## 🧪 Ejemplo en código

```java
abstract class MaestroJedi {
    protected MaestroJedi siguiente;

    public void setSiguiente(MaestroJedi siguiente) {
        this.siguiente = siguiente;
    }

    public abstract void manejarPeticion(String asunto);
}

class Yoda extends MaestroJedi {
    public void manejarPeticion(String asunto) {
        if ("sabiduría".equals(asunto)) {
            System.out.println("Yoda responde con sabiduría.");
        } else if (siguiente != null) {
            siguiente.manejarPeticion(asunto);
        }
    }
}

class Windu extends MaestroJedi {
    public void manejarPeticion(String asunto) {
        if ("combate".equals(asunto)) {
            System.out.println("Mace Windu entra en combate.");
        } else if (siguiente != null) {
            siguiente.manejarPeticion(asunto);
        }
    }
}

public class Consejo {
    public static void main(String[] args) {
        MaestroJedi yoda = new Yoda();
        MaestroJedi windu = new Windu();
        yoda.setSiguiente(windu);

        yoda.manejarPeticion("combate");
    }
}
```
