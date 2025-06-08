abstract class Notification {
    public abstract void notifyUser();
}

class EmailNotification extends Notification {
    public void notifyUser() {
        System.out.println("Notificación por correo electrónico.");
    }
}

class SMSNotification extends Notification {
    public void notifyUser() {
        System.out.println("Notificación por SMS.");
    }
}

class NotificationFactory {
    public static Notification createNotification(String type) {
        if ("EMAIL".equalsIgnoreCase(type)) {
            return new EmailNotification();
        } else if ("SMS".equalsIgnoreCase(type)) {
            return new SMSNotification();
        }
        throw new IllegalArgumentException("Tipo no soportado");
    }
}
