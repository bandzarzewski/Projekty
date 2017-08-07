package pracaDomowa.KlasyWewnetrzne;

public class KlasyWewnetrzne {

    public static void main(String[] args) {

        Komputer komputer = new Komputer(10);
        komputer.uruchom();
        Komputer.KartaSieciowa kartaSieciowa = komputer.utworzKarteSieciowa();
        kartaSieciowa.ustanowPolaczenie();

        Komputer.KartaSieciowa kartaSieciowa_2 = komputer.new KartaSieciowa();
        Komputer.KartaSieciowa kartaSieciowa_3 = new Komputer(5).new KartaSieciowa();
        kartaSieciowa_3.ustanowPolaczenie();
    }
}
