package pl.sda.day14.Algorithms;


public class Zad3_Obzartuchy {
    public static void main(String[] args) {
        String[] input = new String[]{"2", "10", "3600", "1800"};
        int liczbaOsob = Integer.parseInt(input[0]);
        int LiczbaCiastekWPudełku = Integer.parseInt(input[1]);
        int Czas1osoby = Integer.parseInt(input[2]);
        int Czas2osoby = Integer.parseInt(input[3]);

        int CzasWsekundachDoba = 60 * 60 * 24;

//        System.out.println(CzasWsekundachDoba);

        // Ile ciastek zje jedna osoba w ciagu 24h
        int CiastkaOsoba1Doba = (CzasWsekundachDoba / Czas1osoby) / 10;
        int CiastkaOsoba2Doba = (CzasWsekundachDoba / Czas2osoby) / 10;

        System.out.println(CiastkaOsoba1Doba);
        System.out.println(CiastkaOsoba2Doba);
//

    }
}
