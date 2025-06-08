[⬅ Volver al índice](../../README.md)

🧒 **Atención joven Jedi:** "Cuando una alarma suena en el templo, todos los padawan actúan. Observer lo explica."
# Patrón Observer

## Descripción
📢 **Descripción:** Cuando alguien grita ¡sorpresa!, todos reaccionan. Observer permite que muchas cosas escuchen a una sola fuente y reaccionen si cambia.

## Aplicación
Este patrón se encuentra implementado en contexto de arquitectura Spring Boot.


## 🧪 Ejemplo en código

```java
// Observador
interface Observador {
    void actualizar(String mensaje);
}

// Sujeto observado
class Sujeto {
    private List<Observador> observadores = new ArrayList<>();

    public void agregar(Observador o) {
        observadores.add(o);
    }

    public void notificar(String mensaje) {
        for (Observador o : observadores) {
            o.actualizar(mensaje);
        }
    }
}

// Implementación concreta del observador
class Padawan implements Observador {
    private String nombre;

    public Padawan(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println(nombre + " recibió el mensaje: " + mensaje);
    }
}

// Cliente
public class TemploJedi {
    public static void main(String[] args) {
        Sujeto templo = new Sujeto();

        Padawan luke = new Padawan("Luke");
        Padawan leia = new Padawan("Leia");

        templo.agregar(luke);
        templo.agregar(leia);

        templo.notificar("¡Entrenamiento Jedi comienza ahora!");
    }
}

```