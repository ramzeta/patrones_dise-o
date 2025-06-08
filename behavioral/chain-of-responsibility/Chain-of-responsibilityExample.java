abstract class Handler {
    protected Handler next;

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    public abstract void handle(String request);
}

class AuthHandler extends Handler {
    public void handle(String request) {
        if (request.contains("auth")) {
            System.out.println("Autenticado");
        } else if (next != null) {
            next.handle(request);
        }
    }
}

class LogHandler extends Handler {
    public void handle(String request) {
        System.out.println("Log: " + request);
        if (next != null) next.handle(request);
    }
}
