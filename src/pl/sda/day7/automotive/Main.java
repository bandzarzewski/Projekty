package pl.sda.day7.automotive;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Vehicle> list = new ArrayList<>();

        list.add(new Bicycle());
        list.add(new Motorbike());
        list.add(new Car());

        for (Vehicle v : list) {
            System.out.println("\n" + v.getClass().getSimpleName() + ":");
            v.ride();
            v.brake();
        }
    }
}
