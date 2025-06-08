[⬅ Volver al índice](../../README.md)

🧒 **Enseñanza Jedi:** "Un escuadrón o un solo clon pueden recibir órdenes igual. Eso es Composite."
# Patrón Composite

## Descripción
📁 **Descripción:** Es como una carpeta que puede tener archivos y más carpetas dentro. Puedes tratarlas todas igual, sean solas o en grupo.

## Aplicación
Este patrón se encuentra implementado en contexto de arquitectura Spring Boot.

## 🧪 Ejemplo en código

```java
interface Comando {
    void ejecutar();
}

class Soldado implements Comando {
    private String nombre;

    public Soldado(String nombre) {
        this.nombre = nombre;
    }

    public void ejecutar() {
        System.out.println(nombre + " obedece la orden.");
    }
}

class Escuadra implements Comando {
    private List<Comando> miembros = new ArrayList<>();

    public void agregar(Comando c) { miembros.add(c); }

    public void ejecutar() {
        for (Comando c : miembros) c.ejecutar();
    }
}

public class Base {
    public static void main(String[] args) {
        Soldado obi = new Soldado("Obi-Wan");
        Soldado anakin = new Soldado("Anakin");

        Escuadra escuadra = new Escuadra();
        escuadra.agregar(obi);
        escuadra.agregar(anakin);

        escuadra.ejecutar();
    }
}
```
