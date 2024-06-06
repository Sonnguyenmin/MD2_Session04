package ra.Session01.BT08;

import java.util.Scanner;

public class Employee {
    private String employeeId;
    private String employeeName;
    private int age;
    private double rate;
    private double salary;

    public Employee() {
    }

    public Employee(String employeeId, String employeeName, int age, double rate, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.rate = rate;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void inputData(Scanner scanner) {
        System.out.print("Nhập mã nhân viên: ");
        this.employeeId = scanner.nextLine();
        System.out.print("Nhập tên nhân viên: ");
        this.employeeName = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap he so luong: ");
        this.rate = Double.parseDouble(scanner.nextLine());

    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + this.employeeId + '\'' +
                ", employeeName='" + this.employeeName + '\'' +
                ", age=" + this.age +
                ", rate=" + this.rate +
                ", salary=" + this.salary +
                '}';
    }

    public double calSalary() {
        return  this.salary = this.rate * 1.3 * 1000000;
    }
}
