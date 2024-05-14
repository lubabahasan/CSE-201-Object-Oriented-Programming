
import java.util.*;

class InvalidWeightRangeException extends Exception {

    public InvalidWeightRangeException(int minWeight, int maxWeight) {
        super("Weight should be between " + minWeight + " and " + maxWeight + " kgs.");
    }
}

class InvalidValueException extends Exception {

    public InvalidValueException() {
        super("Number should be greater than 0");
    }
}

/*
public class TestException {

    public static void squareRoot(int temp) throws InvalidValueException {
        if (temp < 0) {
            throw new InvalidValueException();
        } else {
            System.out.println("Valid Value");
        }
    }

    public static void main(String[] args) {
        try {
            squareRoot(-1);
        } catch (InvalidValueException e) {
            System.out.println(e.getMessage());
        }
    }
}*/

class TestException {

    public static void main(String[] args) {
        try {
            System.out.println("Inside Try.");
            int i = Integer.parseInt("X");
            System.out.println(1);
        } catch (ArithmeticException e) {
            System.out.println("Inside Catch 1.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inside Catch 2.");
        } finally {
            System.out.println("Inside Finally");
        }
        System.out.println("End.");
    }
}
