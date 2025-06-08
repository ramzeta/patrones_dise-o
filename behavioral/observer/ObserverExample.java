import java.util.*;

interface Observer {
    void update(String event);
}

class EventManager {
    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer o) {
        observers.add(o);
    }

    public void notifyAll(String event) {
        for (Observer o : observers) {
            o.update(event);
        }
    }
}

class Logger implements Observer {
    public void update(String event) {
        System.out.println("Logger recibió evento: " + event);
    }
}
