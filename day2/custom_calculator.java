public class custom_calculator {
    public static void main(String[] args) throws InvalidInputException {
        calculator c = new calculator();

        c.add(8, 9);
        c.add(9, 2);
    }
}

class calculator {
    double add(double a, double b) throws InvalidInputException {
        if (a == 8 || b == 9)
            throw new InvalidInputException("Cannot add 8 and 9");
        if (a > 10000 || b > 10000)
            throw new InvalidInputException("max input expection no should be smaller than 10000");
        return a + b;
    }

    double subtraction(double a, double b) throws InvalidInputException {
        if (a > 10000 || b > 10000)
            throw new InvalidInputException("max input expection no should be smaller than 10000");
        return a - b;
    }

    double multiply(double a, double b) throws InvalidInputException {
        if (a > 10000 || b > 10000)
            throw new InvalidInputException("max input expection no should be smaller than 10000");
        if (a > 7000 || b > 7000)
            throw new InvalidInputException("greather than  7000 is not a valid input for multiplicaton");
        return a * b;
    }

    double divide(double a, double b) throws InvalidInputException {
        if (b == 0) {
            throw new InvalidInputException(" you can'nt divide any number by zero");
        }
        return a / b;
    }

}

class InvalidInputException extends Exception {
    private String a;

    InvalidInputException(String a) {
        super(a);
        this.a = a;
    };

    /*
     * @Override
     * public String toString() {
     * return a;
     * }
     */

    /*
     * @Override
     * public String getMessage() {
     * return a;
     * }
     */
}
