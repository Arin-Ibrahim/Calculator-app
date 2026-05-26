public class CalculatorSystem {

    private InputReader inputReader = new InputReader();
    private OperationFactory factory = new OperationFactory();
    private ResultPrinter printer = new ResultPrinter();

    public void run() {

        NumberPair numbers = inputReader.readNumbers();

        printer.printHeader();

        printer.printResult("Addition",
                factory.createAddition().add(numbers.getFirst(), numbers.getSecond()));

        printer.printResult("Subtraction",
                factory.createSubtraction().subtract(numbers.getFirst(), numbers.getSecond()));

        printer.printResult("Multiplication",
                factory.createMultiplication().multiply(numbers.getFirst(), numbers.getSecond()));

        printer.printResult("Division",
                factory.createDivision().divide(numbers.getFirst(), numbers.getSecond()));
    }
}