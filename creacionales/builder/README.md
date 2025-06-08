[⬅ Volver al índice](../../README.md)

🧒 **Maestro Jedi dice a su padawan:** "Padawan, construir un sable de luz paso a paso debes. Así funciona el patrón Builder."
# Patrón Builder

## Descripción
🧱 **Descripción:** Es como construir con bloques LEGO. Puedes hacer un castillo o un coche con las mismas piezas, solo necesitas seguir diferentes instrucciones. Builder ayuda a crear cosas paso a paso con libertad.

## Aplicación
Este patrón se encuentra implementado en contexto de arquitectura Spring Boot.

## 🧪 Ejemplo en código

```java
// Producto
class NaveEspacial {
    private String tipoMotor;
    private String armamento;
    private int capacidadPasajeros;

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public void setArmamento(String armamento) {
        this.armamento = armamento;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public String toString() {
        return "🚀 Nave Espacial [Motor: " + tipoMotor + ", Armamento: " + armamento +
               ", Pasajeros: " + capacidadPasajeros + "]";
    }
}

// Builder
class NaveBuilder {
    private NaveEspacial nave;

    public NaveBuilder() {
        nave = new NaveEspacial();
    }

    public NaveBuilder motorIonico() {
        nave.setTipoMotor("Motor Iónico");
        return this;
    }

    public NaveBuilder conBlasters() {
        nave.setArmamento("Blasters Dobles");
        return this;
    }

    public NaveBuilder paraDosPasajeros() {
        nave.setCapacidadPasajeros(2);
        return this;
    }

    public NaveEspacial build() {
        return nave;
    }
}

// Cliente
public class Hangar {
    public static void main(String[] args) {
        NaveEspacial xwing = new NaveBuilder()
                                .motorIonico()
                                .conBlasters()
                                .paraDosPasajeros()
                                .build();

        System.out.println(xwing);
    }
}

```
Este ejemplo crea una nave X-Wing de manera flexible con pasos encadenados, tal como un Maestro Jedi prepara su sable láser. ⚔️
