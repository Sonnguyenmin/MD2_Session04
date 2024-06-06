package ra.Session01.BTTH03_ProductClass;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Category category1 = new Category(1, "Quan");
        Category category2 = new Category(2, "Ao");
        Category category3 = new Category(3, "Giay");

        Product product1 = new Product( 1, "Quan au", 250000, category1);
        Product product2 = new Product( 2, "Quan jean", 250000, category2);
        Product product3 = new Product( 3, "Giay jean", 250000, category3);

        System.out.println("tất cả các sản phẩm");
        product1.displayProduct();
        product2.displayProduct();
        product3.displayProduct();
        sc.close();
    }
}
