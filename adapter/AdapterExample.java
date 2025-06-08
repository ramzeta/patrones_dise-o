interface OldSystem {
    void oldRequest();
}

class OldSystemImpl implements OldSystem {
    public void oldRequest() {
        System.out.println("Llamada al sistema antiguo");
    }
}

interface NewSystem {
    void newRequest();
}

class Adapter implements NewSystem {
    private OldSystem oldSystem;

    public Adapter(OldSystem oldSystem) {
        this.oldSystem = oldSystem;
    }

    public void newRequest() {
        oldSystem.oldRequest();
    }
}
