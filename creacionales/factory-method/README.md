[⬅ Volver al índice](../../README.md)

🧒 **Consejo Jedi:** "No todas las naves se crean igual. Algunas nacen con la Fuerza... otras con el método Factory."

# Patrón Factory Method

## Descripción
🏭 **Descripción:** Este patrón permite delegar la creación de objetos a subclases. Imagina que el Templo Jedi tiene diferentes hangares, y cada hangar sabe construir solo un tipo de nave: X-Wing, Ala-Y, o un Halcón Milenario. El Factory Method deja que cada hangar construya la nave adecuada.

## Aplicación
Este patrón es útil cuando una clase no sabe exactamente qué objetos debe crear. En Spring Boot, esto se asemeja al uso de beans personalizados o estrategias instanciadas dinámicamente.

## 🧪 Ejemplo en código

```java
// Producto abstracto
interface Nave {
    void despegar();
}

// Productos concretos
class XWing implements Nave {
    public void despegar() {
        System.out.println("🛫 X-Wing despegando al hiperespacio...");
    }
}

class AlaY implements Nave {
    public void despegar() {
        System.out.println("🛫 Ala-Y lista para el combate.");
    }
}

// Creador abstracto
abstract class Hangar {
    public abstract Nave crearNave();

    public void lanzarNave() {
        Nave nave = crearNave();
        nave.despegar();
    }
}

// Creadores concretos
class HangarXWing extends Hangar {
    public Nave crearNave() {
        return new XWing();
    }
}

class HangarAlaY extends Hangar {
    public Nave crearNave() {
        return new AlaY();
    }
}

// Cliente
public class BaseRebelde {
    public static void main(String[] args) {
        Hangar hangarX = new HangarXWing();
        Hangar hangarY = new HangarAlaY();

        hangarX.lanzarNave();  // 🛫 X-Wing despegando al hiperespacio...
        hangarY.lanzarNave();  // 🛫 Ala-Y lista para el combate.
    }
}
