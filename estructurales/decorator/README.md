[⬅ Volver al índice](../../README.md)

🧒 **Lección de personalización:** "A tu sable de luz más poder agregar puedes, sin crear uno nuevo. Así es el Decorator."
# Patrón Decorator

## Descripción
🍦 **Descripción:** Es como ponerle toppings a un helado. Puedes añadir chocolate, chispas o frutas sin cambiar el helado original.

## Aplicación
Este patrón se encuentra implementado en contexto de arquitectura Spring Boot.

## 🧪 Ejemplo en código

```java
interface Jedi {
    String entrenar();
}

class Padawan implements Jedi {
    public String entrenar() {
        return "Padawan entrenando";
    }
}

class ConEspada implements Jedi {
    private Jedi base;

    public ConEspada(Jedi base) {
        this.base = base;
    }

    public String entrenar() {
        return base.entrenar() + " con espada láser";
    }
}

public class Entrenamiento {
    public static void main(String[] args) {
        Jedi jedi = new ConEspada(new Padawan());
        System.out.println(jedi.entrenar());
    }
}
```
