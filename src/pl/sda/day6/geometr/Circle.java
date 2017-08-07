package pl.sda.day6.geometr;

/**
 * Created by RENT on 2017-07-04.
 */
public class Circle extends Figure {

    private double r;


    public Circle(double r) {
        this.r = r;
    }

    // implementujemy
    @Override

    public double getArea() {
        return Math.PI * Math.pow(r, 2);

    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public String toString() {
        return "Circle{r=" + r + "}";
    }
}
