package DataType;

import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = sc.next();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Gender: ");
        String gender = sc.next();

        System.out.println("--------------------------------");

        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
        System.out.println("Gender is "+gender);

        System.out.println("--------------------------------");
    }
}
