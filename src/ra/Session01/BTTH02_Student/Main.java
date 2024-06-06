package ra.Session01.BTTH02_Student;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap id: ");
        int studentId = Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhập tên học sinh: ");
        String studentName = sc.nextLine();
        System.out.println("Mời bạn nhap gioi tinh: ");
        boolean sex = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Mời bạn nhập ten lop: ");
        String className = sc.nextLine();
        System.out.println("Moi ban nhap tuoi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Moi ban nhap dia chi");
        String address = sc.nextLine();
        Students obj = new Students();
       obj.className = className;
       obj.age = age;
       obj.address = address;
       obj.studentId = studentId;
       obj.sex = sex;
       obj.studentName = studentName;
        System.out.println("Students \n" + obj.display());
    }
}
