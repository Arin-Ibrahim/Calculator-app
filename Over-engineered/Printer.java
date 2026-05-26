public class Printer {

    public void printAll(Addition addition, Subtraction subtraction,
        Multiplication multiplication, Division division,
        int first, int second) {

        System.out.println("\nResults:");
        System.out.println("Addition: " + addition.add(first, second));
        System.out.println("Subtraction: " + subtraction.subtract(first, second));
        System.out.println("Multiplication: " + multiplication.multiply(first, second));
        System.out.println("Division: " + division.divide(first, second));
    }
}