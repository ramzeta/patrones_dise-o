[⬅ Volver al índice](../../README.md)

🧒 **Maestro Jedi susurra:** "Solo un consejo Jedi hay. Solo una instancia tendrás, joven aprendiz."
# Patrón Singleton

## Descripción
👑 **Descripción:** Como un rey en un reino, solo puede haber uno. Singleton asegura que solo exista una única instancia de algo, como un único centro de control en una nave.

## Aplicación
Este patrón se encuentra implementado en contexto de arquitectura Spring Boot.

## 🧪 Ejemplo en código

```java
class ConsejoJedi {
    private static ConsejoJedi instancia;

    private ConsejoJedi() {}

    public static ConsejoJedi obtenerInstancia() {
        if (instancia == null) {
            instancia = new ConsejoJedi();
        }
        return instancia;
    }

    public void hablar() {
        System.out.println("Solo uno gobierna este consejo.");
    }
}

public class Templo {
    public static void main(String[] args) {
        ConsejoJedi consejo = ConsejoJedi.obtenerInstancia();
        consejo.hablar();
    }
}
```
