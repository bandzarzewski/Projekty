// zad 3 dzien 5, kalkulator

package pl.sda.day5;

/**
 * Created by RENT on 2017-07-03.
 */
public class Calculator {
    // nie ustawiamy pol
    //char o - operator matematyczny +, -, * ...

    public double eval(double a, double b, Operator o) {

        double result;

        switch (o) {
            case ADD:
                result = a + b;
                break;
            case SUB:
                result = a - b;
                break;
            case MULT:
                result = a * b;
                break;
            case DIV:
                if (b != 0) {
                    result = a / b;
                } else {
                    result = 0.0;
                }
                break;
            case MOD:
                if (b != 0) {
                    result = a % b;
                } else {
                    result = 0.0;
                }
                break;
            case POW:
                result = Math.pow(a, b);
                break;
            default:
                result = 0.0;
        }
        return result;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();

        System.out.println(cal.eval(1, 4, Operator.fromChar('+')));
        System.out.println(cal.eval(1, 4, Operator.fromChar('-')));
        System.out.println(cal.eval(1, 4, Operator.fromChar('*')));
        System.out.println(cal.eval(1, 4, Operator.fromChar('/')));
        System.out.println();
        Operator.ADD.printSign();
        Operator.DIV.printSign();

        for (Operator z : Operator.values()) {
            System.out.println(z);
        }

    }
}
