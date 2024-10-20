public class Kalkulator {

    private double operand1;
    private double operand2;

    public double add(double operand1, double operand2) {
        return operand1 + operand2;
    }

    public double sub(double operand1, double operand2) {
        return operand1 - operand2;
    }

    public double mul(double operand1, double operand2) {
        return operand1 * operand2;
    }

    public double div(double operand1, double operand2) {
        return operand1 / operand2;
    }


    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public double getOperand1() {
        return operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }
}
