package ru.examples.patterns.builder;

import java.awt.*;

public class Vehicle {
    private String name;
    private String engineType;
    private Color color;
    private boolean hasRoof;
    private int numberOfwheels;
    private boolean hasDoors;

    static class BulderVehicle {
        private String name;
        private String engineType;
        private Color color;
        private boolean hasRoof;
        private int numberOfwheels;
        private boolean hasDoors;

        BulderVehicle name(String name) {
            this.name = name;
            return this;
        }

        BulderVehicle engineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        BulderVehicle color(Color color) {
            this.color = color;
            return this;
        }

        BulderVehicle roof(Boolean hasRoof) {
            this.hasRoof = hasRoof;
            return this;
        }

        BulderVehicle doors(Boolean hasDoors) {
            this.hasDoors = hasDoors;
            return this;
        }

        BulderVehicle wheels(int numberOfwheels) {
            this.numberOfwheels = numberOfwheels;
            return this;
        }

        Vehicle build() {
            return new Vehicle(this);
        }
    }

    static BulderVehicle builder() {
        return new BulderVehicle();
    }

    public Vehicle() {

    }

    private Vehicle(BulderVehicle vehicle) {
        this.name = vehicle.name;
        this.engineType = vehicle.engineType;
        this.color =  vehicle.color;
        this.hasDoors = vehicle.hasDoors;
        this.hasRoof = vehicle.hasRoof;
        this.numberOfwheels = vehicle.numberOfwheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isHasRoof() {
        return hasRoof;
    }

    public void setHasRoof(boolean hasRoof) {
        this.hasRoof = hasRoof;
    }

    public int getNumberOfwheels() {
        return numberOfwheels;
    }

    public void setNumberOfwheels(int numberOfwheels) {
        this.numberOfwheels = numberOfwheels;
    }

    public boolean isHasDoors() {
        return hasDoors;
    }

    public void setHasDoors(boolean hasDoors) {
        this.hasDoors = hasDoors;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", engineType='" + engineType + '\'' +
                ", color=" + color +
                ", hasRoof=" + hasRoof +
                ", numberOfwheels=" + numberOfwheels +
                ", hasDoors=" + hasDoors +
                '}';
    }


}
