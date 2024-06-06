package UngDung;

import java.util.Scanner;

public class BookManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OOP_UD book = new OOP_UD();
        do{
            System.out.println("**************MENU*************");
            System.out.println("1. Nhap thong tin sach");
            System.out.println("2. Hien thi thong tin sach");
            System.out.println("3. Hien thi gia sach");
            System.out.println("4. Cap nhat tac gia sach");
            System.out.println("5. thoat");
            System.out.println("Moi ban nhap cac so tu 1 den 5: ");
            int choise = Integer.parseInt(scanner.nextLine());
            switch (choise) {
                case 1:
                    book.inputData(scanner);
                    break;
                case 2:
                    book.displayData();
                    break;
                case 3:
                    System.out.println("Gia sach:" + book.getBookPrice());
                    break;
                case 4:
                    System.out.printf("Cap nhat tac gia sach %s: ", book.getAuthor());
                    book.setAuthor(scanner.nextLine());
                    System.out.println("Hien thi gia sach:" + book.getAuthor());
                    book.displayData();
                    break;
                case 5:
                    System.out.println("Ban da ket thuc chuong trinh");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Ban nhap vao khong phai nhap tu 1 den 5 moi ban nhap lai !");
                    break;
            }
        } while (true);

    }
}
