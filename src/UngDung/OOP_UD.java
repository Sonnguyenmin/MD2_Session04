package UngDung;

import java.util.Scanner;

public class OOP_UD {
    /*
    * xây dựng lớp book có cac thanh phan sau:
    * 1. Thuộc tính : Mã sách, tên sách, giá sách, nhà xuất bản, tên tác giả, mô tả, trạng thái
    * 2. có 2 constructor: default và khởi tạo tất cả thông tin đối tượng
    * 3. Có các phương thức getter/ setter cho các thuộc tính
    * 4. có các phương thức:
    * + inputData(Scanner scanner): Nhập thông tin đối tượng
    * + displayData(): hiển thị thong tin doi tuong
    * Xay dung lop BookManagement: in menu va thuc hien cac chuc năng sau :
    * *************************************Menu*****************
    * 1. NHap thong tin sach
    * 2. hien thi thong tin sách
    * 3. Hien thi gia sach
    * 4. cap nhat tac gia sách
    * 5. thoát
    * */
    private String bookId;
    private String bookName;
    private float bookPrice;
    private String publishing;
    private  String author;
    private  String description;
    private  boolean status;

    public OOP_UD() {
    }

    public OOP_UD(String bookId, String bookName, float bookPrice, String publishing, String author, String description, boolean status) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.publishing = publishing;
        this.author = author;
        this.description = description;
        this.status = status;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public float getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(float bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    public void inputData(Scanner scanner) {
        System.out.println("Enter Book ID: ");
        this.bookId = scanner.nextLine();
        System.out.println("Enter Book Name: ");
        this.bookName = scanner.nextLine();
        System.out.println("Enter Book Price: ");
        this.bookPrice = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter Publishing: ");
        this.publishing = scanner.nextLine();
        System.out.println("Enter Author: ");
        this.author = scanner.nextLine();
        System.out.println("Enter Description: ");
        this.description = scanner.nextLine();
        System.out.println("Enter Status: ");
        boolean isExit = true;
        do {
            System.out.println("1. con hang");
            System.out.println("2. Het hang");
            System.out.println("Lua chon cua ban");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    this.status = true;
                    isExit = false;
                    break;
                case 2:
                    this.status = false;
                    isExit = false;
                    break;
                default:
                    System.out.println("Vui long chon 1 va 2");
            }
        } while (isExit);

    }

    public void displayData() {
//        return "Book{" + "Book ID: " + this.bookId + "," +
//                "Book Name: " + this.bookName + "," +
//                " book Price: " + this.bookPrice + "," +
//                "Nha xuat ban: " + this.publishing + "," +
//                "outhor: " + this.author + "," +
//                "description: " + this.description + "," +
//                "status: " + this.status + '}';
        System.out.printf("Ma sach: %s\n", this.bookId);
        System.out.printf("Ten sach: %s\n", this.bookName);
        System.out.printf("Nha xuat ban: %s\n", this.publishing);
        System.out.printf("Gia sach: %s\n", this.bookPrice);
        System.out.printf("Ten tac gia: %s\n", this.author);
        System.out.printf("Mo ta: %s\n", this.description);
        System.out.printf("Trang thai: %s\n", this.status);
    }
}
