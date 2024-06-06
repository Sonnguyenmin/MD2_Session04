package ra.Session01.BT02_QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c, x1, x2, delta;//thuoc tinh

    //2. constructor
    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c, double x1, double x2, double delta) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.x1 = x1;
        this.x2 = x2;
        this.delta = delta;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }

    public void displayData(Scanner scanner){
        String Ketqua = "";
        do {
            System.out.println("Moi ban nhap a (a # 0) :");
            this.a = Double.parseDouble(scanner.nextLine());

        } while (this.a == 0);
        System.out.println("Moi ban nhap b: ");
        this.b = Double.parseDouble(scanner.nextLine());
        System.out.println("Moi ban nhap c: ");
        this.c = Double.parseDouble(scanner.nextLine());
        System.out.println("Phương trình bậc hai bạn vừa nhập có dạng: "+a+"x^2 + "+b+"x + "+c+" = 0");
        delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            Ketqua = "Phương trình vô nghiệm!";
        } else if (delta == 0) {
            x1 = x2 = -b/ (2*a);
            System.out.println("Phương trinh có nghiệm kép là x1 = x2 = "+x1);
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            Ketqua = "Phương trình có 2 nghiệm x1 = " + x1 + " và x2 = " + x2;
        }
        System.out.println(Ketqua);
    }

    @Override
    public String toString() {
        return "QuadraticEquation{" +
                "Hien thi a=" +this.a +
                ",Hien thi b=" + this.b +
                ",Hien thi c=" + this.c +
                ",Hien thi x1=" + this.x1 +
                ",Hien thi x2=" + this.x2 +
                ",Hien thi delta=" + this.delta +
                '}';
    }
}
