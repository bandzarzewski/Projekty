package pl.sda.day6.geometr;

/**
 * Created by RENT on 2017-07-04.
 */

// trapez równoramieny

public class Trapeze extends Quadrangle {
    protected double a;
    private double b;
    protected double h;

    public Trapeze(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double getArea() {
        return (a + b) / 2 * h;
    }

    @Override
    public double getPerimeter() {
        double c = Math.abs(a - b) / 2;
        return a + b + 2 * Math.sqrt(h * h + c * c);
    }
}
