[⬅ Volver al índice](../../README.md)

🧒 **Consejo Jedi:** "Cuando un droide habla idioma antiguo, un traductor debes usar. Así trabaja el Adapter."

# Patrón Adapter

## Descripción
🔌 **Descripción:** Este patrón actúa como un traductor universal. Si tienes un droide viejo que solo entiende binario, y tu nave moderna habla en protocolos nuevos, necesitas un adaptador para que se entiendan. En programación, permite que dos interfaces incompatibles trabajen juntas.

## Aplicación
En Spring Boot o Java, este patrón es útil cuando necesitas integrar una librería externa que no cumple con tu interfaz esperada, o al migrar código legacy. Se puede usar para adaptar DTOs, APIs, o clientes externos.

## 🧪 Ejemplo en código

```java
// Interfaz que el cliente espera
public interface EnchufeEuropeo {
    void conectar();
}

// Clase incompatible que queremos usar
public class EnchufeAmericano {
    public void plugIn() {
        System.out.println("🔌 Conectado usando enchufe americano.");
    }
}

// Adaptador que permite que EnchufeAmericano se use como EnchufeEuropeo
public class AdaptadorAmericano implements EnchufeEuropeo {
    private EnchufeAmericano americano;

    public AdaptadorAmericano(EnchufeAmericano americano) {
        this.americano = americano;
    }

    @Override
    public void conectar() {
        americano.plugIn();
    }
}

// Cliente Jedi
public class CargadorDeSable {
    public static void main(String[] args) {
        EnchufeAmericano viejo = new EnchufeAmericano();
        EnchufeEuropeo adaptado = new AdaptadorAmericano(viejo);
        adaptado.conectar(); // 🔌 Conectado usando enchufe americano.
    }
}
