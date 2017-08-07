package pracaDomowa.Exception;

import java.io.IOException;

/**
 * Created by Maciek on 11.07.2017.
 */
public class ExceptionThrowThrows {
    public static void main(String[] args) {

        try {
            dzielenieDwochLiczb(3, 0);
        } catch (ArithmeticException ex) {
            System.out.println("Wyjątek \"" + ex.toString() + "\" został złapany");
        } catch (IOException ex) {
            System.out.println("Błąd wejscia/wyjscia");
        } catch (Exception ex) {
            System.out.println("Dodatkowa obsługa wyjatkow");
        }
    }

    public static double dzielenieDwochLiczb(double a, double b) throws IOException {
        if (b == 0) {
            throw new IOException("Dzielenie przez zero");
        } else {
            return a / b;
        }

    }
}
