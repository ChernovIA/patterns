package ru.examples.patterns.delegate;

public class NotificationLevels {

    private Notification notification = Notification.getInstance();
    private AlertLevels level;

    public NotificationLevels(AlertLevels alertLevels){
        this.level = alertLevels;
    }

    public void showMessage(String name){
        notification.Notify(level.toString() + ": " + name);
    }
}
