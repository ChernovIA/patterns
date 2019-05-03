package ru.examples.patterns.abstractFactory.factoryImpl.windowsControls;

import ru.examples.patterns.abstractFactory.interfaces.controls.PanelInterface;

public class wPanelImpl implements PanelInterface {
    @Override
    public void draw() {
        System.out.println("draw Windows panel");
    }
}
