package ra.Session01.BTTH02_Student;

import java.security.PublicKey;

public class Students {
    public int studentId;
    public String studentName;
    public boolean sex;
    public String className;
    public int age;
    public String address;

    public void Students(boolean sex, int studentId, String studentName, String className, int age, String address) {
        this.sex = sex;//thuoc tinh cua lop: giá trị
        this.studentId = studentId;
        this.studentName = studentName;
        this.className = className;
        this.age = age;
        this.address = address;
    }

    public String display() {
        return "Student{" + "Student ID: " + studentId + "," +
                 "student Name: " + studentName + "," +
                " Sex: " + sex + "," +
                "class Name: " + className + "," +
                "age: " + age + "," +
                "address: " + address + "}";
    }
}
