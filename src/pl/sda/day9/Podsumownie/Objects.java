package pl.sda.day9.Podsumownie;

/**
 * Created by sp0rk on 07/07/17.
 */
public class Objects {

    public static class X {
        int a;

        public void f() {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        X x = new X(); // tworzenie nowego obiektu
        x.a = 5; // przypisanie wartości
        x.f(); // wywołanie funkcji
    }
}
