[⬅ Volver al índice](../../README.md)

🧒 **Fuerza cambiante:** "Como el sable cambia de color según su dueño, así el patrón State se comporta."
# Patrón State

## Descripción
🚦 **Descripción:** Es como un semáforo. Según el color (estado), su comportamiento cambia. State permite que un objeto actúe diferente según su estado.

## Aplicación
Este patrón se encuentra implementado en contexto de arquitectura Spring Boot.

## 🧪 Ejemplo en código

```java
interface Estado {
    void manejar();
}

class EstadoPaz implements Estado {
    public void manejar() {
        System.out.println("La galaxia está en paz.");
    }
}

class EstadoGuerra implements Estado {
    public void manejar() {
        System.out.println("¡La guerra ha comenzado!");
    }
}

class Galaxia {
    private Estado estado;

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void actuar() {
        estado.manejar();
    }
}

public class Universo {
    public static void main(String[] args) {
        Galaxia galaxia = new Galaxia();
        galaxia.setEstado(new EstadoPaz());
        galaxia.actuar();

        galaxia.setEstado(new EstadoGuerra());
        galaxia.actuar();
    }
}
```
