package pl.sda.day7.automotive;

public class Bicycle extends Vehicle {

    public Bicycle() {
        super(2);
    }

    @Override
    public void ride() {
        System.out.println("I ride bicycle");
    }

    @Override
    public void brake() {
        System.out.println("I brake my bicycle");
    }
}
