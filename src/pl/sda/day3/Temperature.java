// zad 2. przeliczanie temperatur
package pl.sda.day3;

public class Temperature {
    private float celcius;

    /*
       public Temperature(float celcius) {
           this.celcius = celcius;
       }
       */
    // ten konstruktor będzie działać tylko w tej klasie
    private Temperature(float celcius) {
        this.celcius = celcius;
    }

    // tworzymy metode statyczną - m.statyczna nie należy do obietu
    // typ. Temperature
    // metoda statyczna - do jej działania nie jest potrzebny obiekt

    // UWAGA ten sposób jest czesto wykorzystywany !

    /*
    public static Temperature fromFahrenheit(float fahrenheit) {
        float celcius = fahrenheitToCelsius(fahrenheit);
        return new Temperature(celcius);
    }

    private static float fahrenheitToCelsius(float fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
*/

    public static Temperature fromCelcius(float celcius) {
        return new Temperature(celcius);
    }

    public static Temperature fromKelvin(float kelvin) {
        float celcius = kelvinToCelsius(kelvin);
        return new Temperature(celcius);
    }

    public static Temperature fromFahrenheit(float fahrenheit) {
        float celcius = fahrenheitToCelsius(fahrenheit);
        return new Temperature(celcius); // zwróć uwagę na słowo "new"
    }

    private static float fahrenheitToCelsius(float fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    private static float kelvinToCelsius(float kelvin) {
        return kelvin - 273;
    }

    // metoda sama przelicza ze stopni Celsius na inne

    public float toFahrenheit() {
        return celcius * 9 / 5 + 32;
    }

    public float toCelcius() {
        return celcius;
    }

    public float toKelvin() {
        return celcius + 273;
    }

    @Override

    public String toString() {
        return "Temperature{" +
                "celcius=" + String.format("%.1f", toCelcius()) + ", " +
                "kelvin=" + String.format("%.1f", toKelvin()) + ", " +
                "Fahrenheit=" + String.format("%.1f", toFahrenheit()) + ", " +
                '}';
    }
}
