interface Command {
    void execute();
}

class Light {
    public void turnOn() {
        System.out.println("Luz encendida");
    }
    public void turnOff() {
        System.out.println("Luz apagada");
    }
}

class LightOnCommand implements Command {
    private Light light;
    public LightOnCommand(Light light) {
        this.light = light;
    }
    public void execute() {
        light.turnOn();
    }
}

class RemoteControl {
    private Command command;
    public void setCommand(Command command) {
        this.command = command;
    }
    public void pressButton() {
        command.execute();
    }
}
