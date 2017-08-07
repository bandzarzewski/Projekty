package pl.sda.day7.primes;

public class ESieve extends Prime {

    private boolean[] sieve;

    public ESieve(int n) {
        super(n);
        generateSieve();
        generatePrimes();
    }

    private void generateSieve() {
        this.sieve = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            sieve[i] = true;
        }
    }

    private void generatePrimes() {
        for (int i = 2; i <= Math.sqrt(n) + 2; i++) {
            if (sieve[i]) {
                for (int j = 2 * i; j <= n; j = j + i) {
                    sieve[j] = false;
                }
            }
        }
    }

    @Override
    public void printPrimes() {
        for (int i = 2; i <= n; i++) {
            if (sieve[i]) {
                System.out.println(i);
            }
        }
    }
}
