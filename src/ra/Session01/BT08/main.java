package ra.Session01.BT08;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[1];

        // Nhập thông tin và tính lương cho các nhân viên
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();
            employees[i].inputData(sc);
            employees[i].calSalary();
        }

        // Hiển thị thông tin các nhân viên
        System.out.println("Thông tin các nhân viên:");
        for (Employee employee : employees) {

            System.out.println(employee.toString());
        }
    }
}
