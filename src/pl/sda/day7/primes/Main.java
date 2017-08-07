package pl.sda.day7.primes;

public class Main {

    public static void main(String[] args) {
        Prime p = new ESieve(100);

        p.printPrimes();
    }
}
