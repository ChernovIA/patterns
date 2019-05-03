package ru.examples.patterns.delegate;

public class Main {
    public static void main(String[] args) {
        NotificationLevels note = new NotificationLevels(AlertLevels.ALERT);
        note.showMessage("something wrong!");
    }
}
