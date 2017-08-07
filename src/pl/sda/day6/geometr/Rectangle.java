package pl.sda.day6.geometr;

/**
 * Created by RENT on 2017-07-04.
 */
public class Rectangle extends Parallelogram {

    public Rectangle(double a, double b) {
        super(a, b, b);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "a=" + a + "b=" + h + "}";
    }
}
