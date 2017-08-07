package pl.sda.day7.primes;

public abstract class Prime {

    protected int n;

    public Prime(int n) {
        this.n = n;
    }

    public abstract void printPrimes();
}
