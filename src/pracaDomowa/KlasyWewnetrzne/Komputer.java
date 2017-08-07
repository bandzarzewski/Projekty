package pracaDomowa.KlasyWewnetrzne;

public class Komputer {

    private int uzytkownik;

    public class KartaSieciowa {
        public void ustanowPolaczenie() {
            System.out.println("Uzytkownik nr " + uzytkownik + " ustanowil polaczenie.");
        }
    }

    public Komputer(int uzytkownik) {
        this.uzytkownik = uzytkownik;
    }

    public void uruchom() {

        UPS ups = new UPS();
        ups.naladuj();

        System.out.println("Witaj uzytkowniku nr " + uzytkownik);

        KartaSieciowa kartaSieciowa = new KartaSieciowa();
        kartaSieciowa.ustanowPolaczenie();
    }

    public KartaSieciowa utworzKarteSieciowa() {
        KartaSieciowa kartaSieciowa = new KartaSieciowa();
        return kartaSieciowa;
    }
}

class UPS {
    public void naladuj() {
        System.out.println("UPS jest naladowany.");
    }
}
