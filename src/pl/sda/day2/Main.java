package pl.sda.day2;

import java.util.logging.Logger;

public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    // metoda

    public static void main(String[] args) {

        // deklaracja zmiennej
        // pierwszy konstruktor // inaczej obiekt
        Exams exams = new Exams();
        //  log.info(exams.toString()); // wyświetlenie wynku

        //ustawienie ocen
        exams.setMath(3.0F);
        exams.setPhysics(3.0F);
        exams.setPolish(4.0F);


        // przykład użycia gettera

        exams.getMath();
        exams.getPolish();
        exams.getPhysics();

        log.info("" + exams.getMath());


        //log.info(exams.toString());

        // drugi konstruktor // innaczej obiekt
        Exams exams2;
        exams2 = new Exams(2, 3.5F, 5.5F);
        // log.info(exams2.toString());

        // obliczenie średniej

        // Srednia: %.2f" - to jest zaokrąglenie do 2 miejca po przecinku
    /*    log.info(String.format("Srednia: %.2f", exams2.avg()));

        log.info("Passed: exams: " + exams.passed());
        log.info("Passed: exams: " + exams2.passed());
*/

        // tworzymy zmienną

        int numOfExams = 4;

        // tworzymy tablice
        Exams[] list = new Exams[numOfExams];
        // przypisanie wartosci do tablicy
        list[0] = new Exams(2, 4, 5);
        list[1] = new Exams(4.5F, 5, 3);
        list[2] = new Exams(3, 3.5F, 3);
        list[3] = new Exams(2, 4, 5.5F);

        // petla for each
// to sprawdzamy kto zaliczył

        log.info("Passed: ");
        for (Exams ex : list) // literujemy po liscie "list"
        {
            if (ex.passed()) {
                log.info(ex.toString());
            }
        }
// tu zaprzeczylimsy warunek czyli "!" zeby sprawdzić kto nie zdał
        // petla for zwykłą

        log.info("Failed:  ");
        for (int i = 0; i < list.length; i++) {
            if (!list[i].passed()) {      // ! odwrócenie warunku
                log.info(list[i].toString());

                list[i].retestAll();
                if (list[i].passed()) {
                    log.info("Retest passed");
                }
            }
        }
    }


}
/*
   log.info("Passed: ");
        for (Exams ex : list) // literujemy po liscie "list"
        {
            if (ex.passed()) {
                log.info(ex.toString());
            }
        }
// tu zaprzeczylimsy warunek czyli "!" zeby sprawdzić kto nie zdał
        // petla for zwykłą

        log.info("Failed:  ");
        for (int i = 0; i < list.length; i++) {
            if (!list[i].passed()) {      // ! odwrócenie warunku
                log.info(list[i].toString());
            }
        }*/


