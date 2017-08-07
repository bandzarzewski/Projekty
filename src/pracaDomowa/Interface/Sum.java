package pracaDomowa.Interface;

public class Sum implements Computation {

//    double argument1;
//    double argument2;
//
//    public Sum(double argument1, double argument2) {
//        this.argument1 = argument1;
//        this.argument2 = argument2;
//    }

    //  double - LICZBY ZMIENNO PRZECINKOWE

    @Override
    public double compute(double arg1, double arg2) {

        return arg1 + arg2;


//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter first value");
//        double valueOne = input.nextDouble();
//        System.out.println("Enter second value");
//        double valueTwo = input.nextDouble();
//        System.out.println("Your paramters:" + valueOne + ", " + valueTwo);
//        valueOne = argument1;
//        valueTwo = argument2;
//
//        return argument1,argument2;


    }

}
