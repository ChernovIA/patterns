package ru.examples.patterns.delegate;

public final class Notification {

    private static Notification instance;

    public static Notification getInstance() {
        if (instance == null) {
            instance = new Notification();
        }
        return instance;
    }

    private Notification() {

    }

    public void Notify(String notification) {
        System.out.println(notification);
    }
}
