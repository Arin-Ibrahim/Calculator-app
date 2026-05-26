public class Division {

    private DivisionValidator validator;
    private DivisionCalculator calculator;

    public Division() {
        validator = new DivisionValidator();
        calculator = new DivisionCalculator();
    }

    public double divide(int a, int b) {

        validator.validate(b);          
        return (double) calculator.performDivision(a, b);
    }
}