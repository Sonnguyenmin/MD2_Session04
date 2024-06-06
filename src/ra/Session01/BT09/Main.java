package ra.Session01.BT09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         final int MAX_STUDENTS = 10;
         Students[] students = new Students[MAX_STUDENTS];
         int numStudents = 0;
        do{
            System.out.println("**********MENU**************");
            System.out.println("1. Nhap thong tin danh sach hoc sinh");
            System.out.println("2. Hien thi thong tin hoc sinh");
            System.out.println("3. Them moi thong tin hoc sinh");
            System.out.println("4. Sua thong tin dua vao ma hoc sinh");
            System.out.println("5. Xoa Hoc sinh theo Id");
            System.out.println("6. Thoat");
            System.out.println("Moi ban nhap cac so tu 1 den 5: ");
            int choie = Integer.parseInt(scanner.nextLine());
            switch (choie) {
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Ban da ket thuc chuong trinh");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Ban nhap vao khong phai nhap tu 1 den 5 moi ban nhap lai !");
                    break;
            }
        }while (true);
    }
}
