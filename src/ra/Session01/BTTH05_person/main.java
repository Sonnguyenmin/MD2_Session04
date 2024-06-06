package ra.Session01.BTTH05_person;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person1 = new Person( "Join", "Carter", 22, true);
        Person person2 = new Person( "May", "leona", 19, false);

        System.out.println(person1.getFirstName());

//        System.out.println(person1.fisrtName());

    }
}
