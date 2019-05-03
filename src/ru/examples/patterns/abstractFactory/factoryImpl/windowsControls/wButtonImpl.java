package ru.examples.patterns.abstractFactory.factoryImpl.windowsControls;

import ru.examples.patterns.abstractFactory.interfaces.controls.ButtonInterface;

public class wButtonImpl implements ButtonInterface {
    @Override
    public void draw() {
        System.out.println("draw Windows button");
    }
}
