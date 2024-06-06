package ra.Session01.BT01;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        circle.inputCircle(scanner);
        System.out.printf("Dien tich của hình tròn la %.1f\n", circle.DienTich());
        System.out.printf("Chu vi cua hinh tron la %.1f \n", circle.ChuVi());
    }
}
