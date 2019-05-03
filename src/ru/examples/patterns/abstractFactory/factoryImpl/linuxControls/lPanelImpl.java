package ru.examples.patterns.abstractFactory.factoryImpl.linuxControls;

import ru.examples.patterns.abstractFactory.interfaces.controls.PanelInterface;

public class lPanelImpl implements PanelInterface {
    @Override
    public void draw() {
        System.out.println("draw Linux panel");
    }
}
