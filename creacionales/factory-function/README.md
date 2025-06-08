[⬅ Volver al índice](../../README.md)

🧒 **Padawan escucha:** "Según las órdenes de la República, el arma correcta se crea. Así actúa el Factory Function."
# Patrón Factory Function

## Descripción
🍳 **Descripción:** Es como una receta de cocina que puede cambiar según los ingredientes. El patrón elige qué objeto crear sin que tú te preocupes por los detalles.

## Aplicación
Este patrón se encuentra implementado en contexto de arquitectura Spring Boot.

## 🧪 Ejemplo en código

```java
interface Nave {
    void despegar();
}

class XWing implements Nave {
    public void despegar() {
        System.out.println("X-Wing despegando...");
    }
}

class NaveFactory {
    public static Nave crear(String tipo) {
        if ("xwing".equalsIgnoreCase(tipo)) return new XWing();
        return null;
    }
}

public class Batalla {
    public static void main(String[] args) {
        Nave nave = NaveFactory.crear("xwing");
        nave.despegar();
    }
}
```
