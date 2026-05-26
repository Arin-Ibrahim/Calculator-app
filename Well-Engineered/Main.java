// Made by Arin Ibrahim | ai23019@auis.edu.krd
package lab3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator calc = new Calculator();

        System.out.print("Enter first number: ");
        calc.setA(sc.nextInt());

        System.out.print("Enter second number: ");
        calc.setB(sc.nextInt());

        Operation add = new Add();
        Operation sub = new Subtract();
        Operation mul = new Multiply();
        Operation div = new Devide();

        System.out.println("Sum: " + calc.calculate(add));
        System.out.println("Difference: " + calc.calculate(sub));
        System.out.println("Product: " + calc.calculate(mul));
        System.out.println("Quotient: " + calc.calculate(div));
    }
}