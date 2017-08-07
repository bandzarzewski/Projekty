package pl.sda.day7.automotive;

public abstract class Vehicle {

    private int wheels;

    public Vehicle(int wheels) {
        this.wheels = wheels;
    }

    public final int getWheels() {
        return wheels;
    }

    public abstract void ride();

    public abstract void brake();
}
