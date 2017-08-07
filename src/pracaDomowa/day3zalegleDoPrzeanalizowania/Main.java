package pracaDomowa.day3zalegleDoPrzeanalizowania;

public class Main {

    public static void main(String[] args) {
        Temperature t1 = Temperature.fromCelcius(25);
        Temperature t2 = Temperature.fromFahreinheit(105);
        Temperature t3 = Temperature.fromKelvin(1);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        /*System.out.println();
        System.out.println(t1 + " " + t1.toCelcius());
        System.out.println(t2 + " " + t2.toCelcius());
        System.out.println(t3 + " " + t3.toCelcius());
        System.out.println();
        System.out.println(t1 + " " + t1.toKelvin());
        System.out.println(t2 + " " + t2.toKelvin());
        System.out.println(t3 + " " + t3.toKelvin());*/
    }
}
