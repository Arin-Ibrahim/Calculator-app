public class OperationBundle {

    public Addition addition;
    public Subtraction subtraction;
    public Multiplication multiplication;
    public Division division;
    public Printer printer;

    public OperationBundle() {
        addition = new Addition();
        subtraction = new Subtraction();
        multiplication = new Multiplication();
        division = new Division();
        printer = new Printer();
    }
}