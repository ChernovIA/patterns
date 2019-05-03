package ru.examples.patterns.abstractFactory.factoryImpl.linuxControls;

import ru.examples.patterns.abstractFactory.interfaces.controls.ButtonInterface;

public class lButtonImpl implements ButtonInterface {
    @Override
    public void draw() {
        System.out.println("draw Linux button");
    }
}
