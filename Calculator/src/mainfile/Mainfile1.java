package mainfile;

import calculator.BasicCalculator;  // import class from calculator package

public class Mainfile1 {
    public static void main(String[] args) {
        BasicCalculator calc = new BasicCalculator();

        int a = 20, b = 10;

        System.out.println("Addition: " + calc.add(a, b));
        System.out.println("Subtraction: " + calc.subtract(a, b));
        System.out.println("Multiplication: " + calc.multiply(a, b));
        System.out.println("Division: " + calc.divide(a, b));
    }
}
