/*
        Exercise 6: You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000

        Use Custom Exception

*/

/**
 * <p>
 * <i>this is java doc for custom exception</i>
 * </P>
 * 
 * @author Ram awasthi
 * @version 14.23
 * @since 27-07-2022
 * @see <a href =
 *      "https://docs.oracle.com/en/java/javase/18/docs/api/index.html" target=
 *      "_blank">Java
 *      docs ram</a>
 **/
public class custom_calculator {
    /**
     * hello this is a method
     * 
     * @param args this is argument 1 supply
     * @deprecated this method is not in use
     * 
     */
    public static void main(String[] args) throws InvalidInputException {
        calculator c = new calculator();

        c.add(8, 9);
        c.add(9, 2);
    }
}

/**
 * 
 */
class calculator {
    double add(double a, double b) throws InvalidInputException {
        if (a == 8 || b == 9)
            throw new InvalidInputException("Cannot add 8 and 9");
        if (a > 10000 || b > 10000)
            throw new InvalidInputException("max input expection no should be smaller than 10000");
        return a + b;
    }

    /**
     * hello this is a method
     * 
     * @param i this is argument 1 supply
     * @param j this is argument 2 supply
     * @return sum of two no.
     * @throws Exception exeption satement
     * 
     */

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
