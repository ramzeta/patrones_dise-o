interface UIFactory {
    Button createButton();
}

interface Button {
    void render();
}

class LightButton implements Button {
    public void render() {
        System.out.println("Renderizando botón claro");
    }
}

class DarkButton implements Button {
    public void render() {
        System.out.println("Renderizando botón oscuro");
    }
}

class LightUIFactory implements UIFactory {
    public Button createButton() {
        return new LightButton();
    }
}

class DarkUIFactory implements UIFactory {
    public Button createButton() {
        return new DarkButton();
    }
}
