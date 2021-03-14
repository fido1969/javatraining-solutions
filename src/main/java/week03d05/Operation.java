package week03d05;

public class Operation {

    private int leftOperand;
    private int rightOperand;

    public Operation(String text) {
        this.leftOperand = Integer.parseInt(text.substring(0, text.indexOf("+")).trim());
        this.rightOperand = Integer.parseInt(text.substring(text.indexOf("+") + 1).trim());
    }

    public int getLeftOperand() {
        return leftOperand;
    }

    public int getRightOperand() {
        return rightOperand;
    }

    public int getResult() {
        return getLeftOperand() + getRightOperand();
    }
}
