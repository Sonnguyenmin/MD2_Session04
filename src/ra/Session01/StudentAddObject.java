package ra.Session01;

import java.util.Scanner;

class Students{
    public String name;
    public int age;
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public void getInformation( Scanner sc) {
        System.out.println("nhap vao ten cua ban:");
        name = sc.nextLine();
        System.out.println("Nhap vao tuoi cua ban:");
        age = Integer.parseInt(sc.nextLine());
        System.out.println();
    }
}

public class StudentAddObject{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Students stu = new Students();

        stu.getInformation(sc);

        System.out.println("Thong tin ban vua nhap la:");
        stu.display();
        sc.close();

    }

}


//class TestClass {
//    public int numbers = 10;// biến
//    public int numbers2 = 20;
//    public int Sum(int number, int number2){//hàm
//        return number + number2;
//    }
//
//    public void Print(int number, int number2){//hàm
//        System.out.println(Sum(number, number2));
//    }
//}
//
//public class StudentAddObject {
//    public static void main(String[] args) {
//        int number = 2;
//        int number2 = 6;
//        //Khởi tạo 1 object thuộc 1 class
//        TestClass objClass = new TestClass();
//        // đại diện cho 1 class nào đó gọi ra
//        // các thành phần trong class đó thông qua object
//        objClass.Print(number, number2);
//        //objClass.Sum(number, number2);
//    }
//}
