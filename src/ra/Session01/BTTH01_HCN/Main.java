package ra.Session01.BTTH01_HCN;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        Rectangle obj = new Rectangle();
        obj.Rectangle(width, height);
        System.out.println("Your Rectangle \n" + obj.display());
        System.out.println("Perimeter of the Rectangle: "+ obj.getPerimeter());
        System.out.println("Area of the Rectangle: "+ obj.getArea());
    }
}
