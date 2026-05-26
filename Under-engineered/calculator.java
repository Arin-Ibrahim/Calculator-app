import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("Sum: " + (a+b) + "\nDifference: " + (a-b) + "\nProduct: " + (a*b) + "\nQuotient: " + ((float)a/b));
    }
}


