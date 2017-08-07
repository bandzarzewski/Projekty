package pl.sda.day1;

/**
 * Created by Maciek on 27.06.2017.
 */
public class Uczestnik {
    private String imie;
    private boolean obecny;
    private int wiek;

    // konstruktor
    public Uczestnik(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
        // System.out.println(obecny()); to zwróci True
    }

    // metody
    public boolean obecny() {
        return obecny;
    }

    // druga metoda nic nie zwraca
    public void ustawObecnosc() {
        obecny = true;
    }

    // Wygenerowaliśmy toString
    // Nadpisujemy, metoda toString wypisze nam liste uczestników w normalnej wersji
    @Override
    public String toString() {
        return "Uczestnik{" +
                "imie='" + imie + '\'' +
                ", obecny=" + obecny +
                ", wiek=" + wiek +
                '}';
    }
}
//
