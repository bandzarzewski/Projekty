package pl.sda.day3;


public class Main {
    public static void main(String[] args) {
//        Temperature t1 = new Temperature(24);

// to są nowe obiekty słow new znajduje się w metodzie
        Temperature t1 = Temperature.fromCelcius(25);
        Temperature t2 = Temperature.fromFahrenheit(108);
        Temperature t3 = Temperature.fromKelvin(100);


        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
//        System.out.println(t1 + "toCelcius " + t1.toCelcius());
//        System.out.println(t1 + "toKelvin " + t1.toKelvin());
//

    }
}
