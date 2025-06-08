[⬅ Volver al índice](../../README.md)

🧒 **Maestro Jedi dice:** "Distintas formas hay de atacar. Cambiar de estrategia, el patrón Strategy permite."
# Patrón Strategy

## Descripción
🗺️ **Descripción:** Es como elegir diferentes caminos para ir a la escuela. Puedes ir andando, en bici o en autobús. Strategy te deja cambiar cómo haces algo sin cambiar quién lo hace.

## Aplicación
Este patrón se encuentra implementado en contexto de arquitectura Spring Boot.

## 🧪 Ejemplo en código

```java
interface Vuelo {
    void volar();
}

class VueloNormal implements Vuelo {
    public void volar() {
        System.out.println("Volando de forma normal");
    }
}

class VueloHiperespacio implements Vuelo {
    public void volar() {
        System.out.println("¡Activando hiperespacio!");
    }
}

class Nave {
    private Vuelo estrategia;

    public void setEstrategia(Vuelo estrategia) {
        this.estrategia = estrategia;
    }

    public void despegar() {
        estrategia.volar();
    }
}

public class Mision {
    public static void main(String[] args) {
        Nave nave = new Nave();
        nave.setEstrategia(new VueloHiperespacio());
        nave.despegar();
    }
}
```
