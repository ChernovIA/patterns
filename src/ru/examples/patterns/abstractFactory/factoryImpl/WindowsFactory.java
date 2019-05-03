package ru.examples.patterns.abstractFactory.factoryImpl;

import ru.examples.patterns.abstractFactory.factoryImpl.windowsControls.wButtonImpl;
import ru.examples.patterns.abstractFactory.factoryImpl.windowsControls.wPanelImpl;
import ru.examples.patterns.abstractFactory.interfaces.ControlsFactoryInterface;
import ru.examples.patterns.abstractFactory.interfaces.controls.ButtonInterface;
import ru.examples.patterns.abstractFactory.interfaces.controls.PanelInterface;

public class WindowsFactory implements ControlsFactoryInterface {

    @Override
    public ButtonInterface getButton() {
        return new wButtonImpl();
    }

    @Override
    public PanelInterface getPanel() {
        return new wPanelImpl();
    }
}
