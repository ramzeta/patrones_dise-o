[⬅ Volver al índice](../../README.md)

🧒 **Lección Jedi:** "Cuando una nave y sus piezas trabajan en armonía, una Abstract Factory es."
# Patrón Abstract Factory

## Descripción
🏭 **Descripción:** Es como una fábrica mágica que crea familias completas de cosas compatibles. Como una cocina que prepara un menú completo: plato, bebida y postre que combinan bien.

## Aplicación
Este patrón se encuentra implementado en contexto de arquitectura Spring Boot.

## 🧪 Ejemplo en código

```java
// Producto abstracto
interface SableLuz {
    void encender();
}

// Producto concreto
class SableAzul implements SableLuz {
    public void encender() {
        System.out.println("Sable azul encendido");
    }
}

// Fábrica abstracta
interface FabricaJedi {
    SableLuz crearSable();
}

// Fábrica concreta
class FabricaPadawan implements FabricaJedi {
    public SableLuz crearSable() {
        return new SableAzul();
    }
}

// Cliente
public class Templo {
    public static void main(String[] args) {
        FabricaJedi fabrica = new FabricaPadawan();
        SableLuz sable = fabrica.crearSable();
        sable.encender();
    }
}
```
