[⬅ Volver al índice](../../README.md)

🧒 **Sabiduría Jedi:** "Un solo panel controla toda la nave. Así simplifica el patrón Facade."
# Patrón Facade

## Descripción
🎮 **Descripción:** Es como un mando de consola que te deja controlar todo con pocos botones. Detrás pasan muchas cosas, pero tú solo usas una interfaz fácil.

## Aplicación
Este patrón se encuentra implementado en contexto de arquitectura Spring Boot.

## 🧪 Ejemplo en código

```java
class Energía {
    public void encender() { System.out.println("Energía activada"); }
}

class Nave {
    public void preparar() { System.out.println("Nave lista"); }
}

class Lanzador {
    private Energía energía = new Energía();
    private Nave nave = new Nave();

    public void lanzar() {
        energía.encender();
        nave.preparar();
        System.out.println("Despegue!");
    }
}

public class Batalla {
    public static void main(String[] args) {
        new Lanzador().lanzar();
    }
}
```
