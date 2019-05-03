package ru.examples.patterns.abstractFactory.factoryImpl;

import ru.examples.patterns.abstractFactory.factoryImpl.linuxControls.lButtonImpl;
import ru.examples.patterns.abstractFactory.factoryImpl.linuxControls.lPanelImpl;
import ru.examples.patterns.abstractFactory.interfaces.ControlsFactoryInterface;
import ru.examples.patterns.abstractFactory.interfaces.controls.ButtonInterface;
import ru.examples.patterns.abstractFactory.interfaces.controls.PanelInterface;

public class LinuxFactory implements ControlsFactoryInterface {

    @Override
    public ButtonInterface getButton() {
        return new lButtonImpl();
    }

    @Override
    public PanelInterface getPanel() {
        return new lPanelImpl();
    }
}
