package pl.sda.day7.calc;

public interface Operation {

    default double eval(double a, double b) {
        return 0;
    }


    class Add implements Operation {
        @Override
        public double eval(double a, double b) {
            return a + b;
        }
    }

    class Subtract implements Operation {
        @Override
        public double eval(double a, double b) {
            return a - b;
        }
    }

    class Multiply implements Operation {
        @Override
        public double eval(double a, double b) {
            return a * b;
        }
    }

    class Divide implements Operation {
        @Override
        public double eval(double a, double b) {
            if (b != 0) {
                return a / b;
            } else {
                return 0;
            }
        }
    }

    class Modulo implements Operation {
        @Override
        public double eval(double a, double b) {
            if (b == 0) {
                return 0;
            }
            return a % b;
        }
    }

    class Power implements Operation {
        @Override
        public double eval(double a, double b) {
            return Math.pow(a, b);
        }
    }

    class None implements Operation {
    }
}
