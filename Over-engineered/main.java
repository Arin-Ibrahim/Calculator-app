import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int first = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int second = scanner.nextInt();
        OperationBundle bundle = new OperationBundle();
        bundle.printer.printAll(bundle.addition, bundle.subtraction, bundle.multiplication, bundle.division, first, second);
    }


    }

