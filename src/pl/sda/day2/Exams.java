package pl.sda.day2;

import java.util.Random;

public class Exams {
    private float math; // zmienne zaczyna sie od małej litery
    private float physics;
    private float polish;

    // final - nie możemy tego pola zmienić
    // static

    private static final Random rand = new Random(); // losujemy liczbe    // to trzeba jeszcze przeanalizować !

    /*
        // deklaracja konstruktora / w tym miejscu nie będzimy ich używać
        public Exams() {
        }
    */


    // pierwszy konstruktor
    public Exams() {
    }

    // drugi konstruktor

    public Exams(float math, float physics, float polish) { // konstruktor przyj. argumenty.
// this - ustalamy pole danego obiektu
        this.math = math;
        this.physics = physics;
        this.polish = polish;
    }


    // metody //
    // to są setery - zapisujemy coś

    public void setMath(float grade) // dopisz wpisaną ocene do pola math
    {
        math = grade;
    }

    public void setPhysics(float grade) // dopisz wpisaną ocene do pola physics
    {
        physics = grade;
    }

    public void setPolish(float grade) //dopisz wpisaną ocene do pola polish
    {
        polish = grade;
    }

    // metoda obliczy srednia
    public float avg() {
        return (math + physics + polish) / 3;
    }

    // sprawdzamy czy egazmin został zdany
    public boolean passed() {
        return (math > 2.0) && (physics > 2.0) && (polish > 2.0);  // użyliśmy to zamiast if ( nasz warunek) return
        // treu else
        // return false
    }

    // metoda prawa przedmioty ktorych nie zdalismy

    public void retestAll() {
        if (math < 3) {
            math = retest();    // jesli math <3 to ją sprobuj poprawic
        }
        if (physics < 3) {
            physics = retest();
        }
        if (polish < 3) {
            polish = retest();
        }
    }

    // to jest metoda prywatna i będzie uzyta tylko w tej klasie

    private float retest() {
        if (rand.nextBoolean()) {
            return 3;
        } else {
            return 2;
        }
    }

    // gettery - coś pobierajamy // wypisujemy np. na konsole


    public float getMath() {
        return math;
    }

    public float getPhysics() {
        return physics;
    }

    public float getPolish() {
        return polish;
    }


    // to jest tekstowa reprezentacja wyniku
    @Override
    public String toString() {
        return "Exams{" +
                "math=" + math +
                ", physics=" + physics +
                ", average=" + String.format("%.2f", avg()) +
                ", passed=" + passed() +
                '}';
    }
}
// Zad dom. przerobić przerobić na jedno wywoałenie String.format( np. "",argument, "" ...
// bedzie 5 argumentów/
// wszystko przerboić na %f i %d  ...