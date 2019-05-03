package ru.examples.patterns.builder;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Vehicle newCar = Vehicle.builder()
                .name("Ferrary")
                .engineType("benzin")
                .color(Color.RED)
                .doors(true)
                .roof(false)
                .wheels(4)
                .build();

        Vehicle newMotoBike = Vehicle.builder()
                .name("Ducato")
                .engineType("benzin")
                .color(Color.WHITE)
                .doors(false)
                .roof(false)
                .wheels(2)
                .build();

        System.out.println(newCar);
        System.out.println(newMotoBike);
    }
}
