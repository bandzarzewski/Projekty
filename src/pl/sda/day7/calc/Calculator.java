package pl.sda.day7.calc;

public class Calculator {

    //char o - operator +, -, *, /, %, ^
    public double eval(double a, Operator o, double b) {
        return o.eval(a, b);
    }

}
