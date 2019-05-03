package ru.examples.patterns.singleton;

public final class Singleton {
    private static volatile Singleton instance;

    public static Singleton getInstance(){
        Singleton localInstance = instance;
        if (localInstance == null){
            synchronized (Singleton.class){
                Singleton local = instance;
                if (local == null){
                    localInstance = new Singleton();
                    instance = localInstance;
                }
            }
        }
        return localInstance;
    }

    private Singleton(){
        //todo
    }
}
