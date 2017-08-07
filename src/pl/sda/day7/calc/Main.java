package pl.sda.day7.calc;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.eval(5.7, Operator.fromChar('+'), 7));
        System.out.println(calc.eval(10, Operator.fromChar('/'), 0));
        System.out.println(calc.eval(10, Operator.fromChar('%'), 3));
        System.out.println(calc.eval(10, Operator.fromChar('*'), 3));
        System.out.println(calc.eval(2, Operator.fromChar('^'), 10));
        System.out.println(calc.eval(2, Operator.fromChar('-'), 10));


        System.out.println(Operator.valueOf("ADD"));
        for (Operator x : Operator.values()) {
            System.out.println(x);
        }


        Operation o1 = new Operation.Modulo();
        System.out.println(o1.eval(10, 3));

    }
}
