package ra.Session01.BT01;

import java.util.Scanner;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void inputCircle(Scanner scanner) {
        System.out.println("Moi ban nhap vao ban kinh: ");
        this.radius = Double.parseDouble(scanner.nextLine());
        System.out.println("Moi ban nhap mau sac: ");
        this.color = scanner.nextLine();
    }

    public double ChuVi() {
        return  2 *Math.PI * radius;
    }

    public double DienTich() {
        return Math.PI * Math.pow(radius , 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + this.radius +
                ", color='" + this.color + '\'' +
                '}';
    }
}
