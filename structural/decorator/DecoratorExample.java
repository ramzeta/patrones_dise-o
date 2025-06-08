interface Notifier {
    void send(String message);
}

class BasicNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Enviando: " + message);
    }
}

class NotifierDecorator implements Notifier {
    protected Notifier wrappee;

    public NotifierDecorator(Notifier notifier) {
        this.wrappee = notifier;
    }

    public void send(String message) {
        wrappee.send(message);
    }
}

class SMSDecorator extends NotifierDecorator {
    public SMSDecorator(Notifier notifier) {
        super(notifier);
    }

    public void send(String message) {
        super.send(message);
        System.out.println("Enviando SMS adicional: " + message);
    }
}
