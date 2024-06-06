package ra.Session01.BTTH04_Calculator;

public class Calculator {
    double firstNumber;
    double secondNumber;

    public Calculator() {
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public Calculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double add() {
        return firstNumber + secondNumber;
    }

    public double subtract() {
        return firstNumber - secondNumber;
    }

    public double multiply() {
        return firstNumber * secondNumber;
    }

    public double divide() {
        return firstNumber / secondNumber;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "firstNumber=" + this.firstNumber +
                ", secondNumber=" + this.secondNumber +
                '}';
    }
}
