package pracaDomowa.day3zalegleDoPrzeanalizowania;

public class Temperature {
    private final float celcius;

    private Temperature(float celcius) {
        this.celcius = celcius;
    }

    public static Temperature fromCelcius(float celcius) {
        return new Temperature(celcius);
    }

    public static Temperature fromKelvin(float kelvin) {
        float celcius = kelvinToCelsius(kelvin);
        return new Temperature(celcius);
    }

    public static Temperature fromFahreinheit(float fahrenheit) {
        float celcius = fahrenheitToCelsius(fahrenheit);
        return new Temperature(celcius);
    }

    private static float kelvinToCelsius(float kelvin) {
        return kelvin - 273;
    }

    private static float fahrenheitToCelsius(float fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }


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
                "celcius=" + String.format("%.1f", celcius) + ", " +
                "kelvin=" + String.format("%.1f", toKelvin()) + ", " +
                "fahrenheit=" + String.format("%.1f", toFahrenheit()) +
                '}';
    }
}
