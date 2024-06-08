package ra.Session01.BT09;

import java.util.Scanner;

public class Students {

    //1. Fields/ Attributes/ Properties

    private String studentId; //Tinh bao dong
    private String studentName;
    private int age;
    private boolean gender;
    private String address;
    private String phone;

    //2. Constructors

    public Students() {
    }

    public Students(String studentId, String studentName, int age, boolean gender, String address, String phone) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    //3. Method
    //-3.1. getter/ Setter

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    //-3.2. Method behavior
    public void inputData(Scanner scanner) {
        //1. Nhap ma sinh vien: Gom 5 ky tu bat dau la sv, khoong strung lap
//        System.out.print("Enter student ID: ");
//        studentId = scanner.nextLine();
        this.studentId = inputStudentId(scanner);
        //2. Nha ten sinh vien: Phai co tu 6 den 50 ky tu
        System.out.print("Enter student name: ");
        studentName = scanner.nextLine();
        //3. Tuoi sinh vien phai co gia tri lon hon hoac bang 18
        System.out.print("Enter student age: ");
        age = Integer.parseInt(scanner.nextLine());
        //4. Gioi tinh chi nhan true/ false
        System.out.print("Enter student gender: ");
        gender = Boolean.parseBoolean(scanner.nextLine());
        //5. Dia chi: Khong duoc rong
        System.out.print("Enter student address: ");
        address = scanner.nextLine();
        //6. Dien thoai: Gom 10 ky tu bat dau bang ky tu 0
        System.out.print("Enter student phone: ");
        phone = scanner.nextLine();
    }

    public String inputStudentId(Scanner scanner ) {
        System.out.print("Enter student ID: ");
        do {
            String studentId = scanner.nextLine();
            if(studentId.length() == 5) {
                if(studentId.startsWith("SV")) {
//                    return studentId;
                        //Khong trung lap
                    boolean isExit = false; //chua ton tai
                    for (Students student: Main.arrStudents) {
                        if(student.getStudentId().equals(studentId)) {
                            isExit = true;//da ton tai
                            break;
                        }
                    }
                    if(isExit) {
                        System.err.println("Ma sinh vien da ton tai, Vui long nhap lai");
                    }
                    else  {
                        return studentId;
                    }
                }
                else {
                    System.err.println("Ma sinh vien bat dau la sv, vui long nhap lai");
                }
            }
            else  {
                System.err.println("Ma sinh vien gom 5 ky tu, vui long nhap lai");
            }
        }
        while (true);
    }

    public String inputStudentName(Scanner scanner) {
        System.out.println("Nhap vao ten sinh vien: ");
        do {
            String studentName = scanner.nextLine();
            if(studentName.length() >= 6 && studentName.length() <= 50) {
                return studentName;
            }
            else  {
                System.err.println("Ten sinh vien tu 6 - 50 ky tu, vui long nhap lai");
            }
        }
        while (true);
    }

    public int inputAge(Scanner scanner) {
        System.out.println("Nhap vao tuoi sinh vien: ");
        do {
             int age = Integer.parseInt(scanner.nextLine());
             if(age>= 18) {
                 return age;
             }
             else  {
                 System.err.println("Sinh vien phai co do tuoi tu 18 tro len, vui long nhap lai");
             }
        }
        while (true);
    }

    public boolean inputGender(Scanner scanner) {
        System.out.println("Nhap vao gioi tinh sinh vien: ");
        do {
            String gender = scanner.nextLine();
            if(gender.equals("true") || gender.equals("false")) {
                return Boolean.parseBoolean(gender);
            }
            else  {
                System.err.println("Gioi tinh sinh vien chi nhan true | false, Vui long nhap lai");
            }

        }
        while (true);
    }

    public String inputAddress(Scanner scanner) {
        System.out.println("Nhap vao dia chi sinh vien: ");
        do {
            String address = scanner.nextLine();
            if (address.trim().isEmpty()) {
                System.err.println("CHua nhap dia chi, vui long nhap lai");
            }
            else  {
                return address;
            }
        }
        while (true);
    }

    public String inputPhone(Scanner scanner) {
        System.out.println("Nhap vao So dien thoai sinh vien: ");
        do {
            String phone = scanner.nextLine();
            if( phone.charAt(0)== '0') {
                if(phone.length() == 10) {
                    boolean isExit = false;
                    for (Students student : Main.arrStudents) {
//                        if( ) {
//
//                        }
//                        else {
//                            return phone;
//                        }
                    }
                }
                else  {
                    System.err.println("So dien thoai co 10 ky tu, vui long nhap lai");
                }
            }
            else  {
                System.out.println("So dien thoai bat dau la 0, vui long nhap lai");
            }
        }
        while (true);
    }

    public void displayData() {
        System.out.printf("Mã SV: %s - Tên SV: %s - Tuổi: %d - Giới tính: %s\n",
                this.studentId, this.studentName, this.age, this.gender ? "Nam" : "Nữ");
        System.out.printf("Địa chỉ: %s - Số điện thoại: %s\n", this.address, this.phone);
    }
}
