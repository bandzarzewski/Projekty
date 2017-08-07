package pracaDomowa.Exception;

/**
 * Created by Maciek on 11.07.2017.
 */
public class ExceptionTryCatchFinally {
    public static void main(String[] args) {

        try {
            int a = 10 / 0;
        } catch (NullPointerException ex) { // ex - to jest referencja do wyjątku
            System.out.println("Wyjątek " + ex.toString() + " został złapany");
        } finally {
            System.out.println("Uwaga wprowadziłeś nie poprawne dane");
        }

    }
}
