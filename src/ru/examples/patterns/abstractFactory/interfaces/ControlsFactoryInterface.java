package ru.examples.patterns.abstractFactory.interfaces;

import ru.examples.patterns.abstractFactory.interfaces.controls.ButtonInterface;
import ru.examples.patterns.abstractFactory.interfaces.controls.PanelInterface;

public interface ControlsFactoryInterface {
    ButtonInterface getButton();
    PanelInterface getPanel();
}
