package ra.Session01.BTTH04_Calculator;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator calc = new Calculator();
        System.out.println("Enter the first number: ");
        calc.firstNumber = Double.parseDouble(sc.nextLine());
        System.out.println("Enter the second number: ");
        calc.secondNumber = Double.parseDouble(sc.nextLine());

        calc.setFirstNumber(calc.firstNumber);
        calc.setSecondNumber(calc.secondNumber);

        System.out.println("Tong 2 so la : " + calc.add());
        System.out.println("Hieu 2 so la : " + calc.subtract());
        System.out.println("Tich 2 so la : " + calc.multiply());
        System.out.println("Thuong 2 so la : " + calc.divide());
    }
}
