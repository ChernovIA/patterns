package ru.examples.patterns.abstractFactory;

import ru.examples.patterns.abstractFactory.factoryImpl.LinuxFactory;
import ru.examples.patterns.abstractFactory.factoryImpl.WindowsFactory;
import ru.examples.patterns.abstractFactory.interfaces.ControlsFactoryInterface;

public class Main {
    public static void main(String[] args) {

        if (isWindows()) {
            ControlsFactoryInterface windows = new WindowsFactory();
            windows.getButton().draw();
            windows.getPanel().draw();
        }
        else if (isNix()) {
            ControlsFactoryInterface linux = new LinuxFactory();
            linux.getButton().draw();
            linux.getPanel().draw();
        }
        else  if (isMac()){
            System.out.println("Controls for Mac OS is under constructions");
        }
    }

    private static boolean isWindows(){
        return System.getProperty("os.name").toLowerCase().contains("win");
    }

    private static boolean isMac(){
        return System.getProperty("os.name").toLowerCase().contains("mac");
    }

    private static boolean isNix(){
        return System.getProperty("os.name").toLowerCase().contains("nix")
                || System.getProperty("os.name").toLowerCase().contains("nux");
    }

}
