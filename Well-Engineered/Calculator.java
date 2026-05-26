package lab3;

public class Calculator {
    private BaseCalculator base;

    public Calculator() {
        base = new BaseCalculator();
    }

    public void setA(int a) {
        base.setA(a);
    }

    public void setB(int b) {
        base.setB(b);
    }

    public double calculate(Operation op) {
        return base.compute(op);
    }
}
