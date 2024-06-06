package ra.Session01.BT06;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyClass myClass = new MyClass();

        System.out.printf("Cap nhat my Class %s: ", myClass.getMyString());
        myClass.setMyString(scanner.nextLine());
        System.out.println("Hien thi my Class:" + myClass.getMyString());
        myClass.toString();
    }
}
