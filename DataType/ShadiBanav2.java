package DataType;

import java.util.Scanner;

public class ShadiBanav2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Gender: ");
        char gender = sc.next().charAt(0);
        System.out.print("Enter Marital status: ");
        boolean maritalStatus = sc.nextBoolean();
        System.out.print("Enter your Zodiac Signs: ");
        String zodiacSigns = sc.next();
        System.out.print("Enter Height: ");
        float height = sc.nextFloat();
        System.out.print("Enter Weight: ");
        float weight = sc.nextFloat();
        System.out.print("What is your Blood Group: ");
        String bloodGroup = sc.next();
        System.out.print("Enter number: ");
        long  phone = sc.nextLong(10);
        System.out.print("Which Degree: ");
        String degree = sc.next();
        System.out.println("what's your Occupation: ");
        String occupation = sc.next();
        System.out.println("Enter Bank Balance: ");
        double bankBalance = sc.nextDouble();
        System.out.println("Enter Your Address: ");
        String address = sc.next();


        System.out.println( "--------------------------------" );
        System.out.println( "Name: " + name );
        System.out.println( "Age: " + age );
        System.out.println( "Gender: " + gender );
        System.out.println( "Marital Status: " + maritalStatus );
        System.out.println( "Zodiac Signs: " + zodiacSigns );
        System.out.println( "Height: " + height );
        System.out.println( "Weight: " + weight );
        System.out.println( "Blood Group: " + bloodGroup );
        System.out.println( "Phone: " + phone );
        System.out.println( "Degree: " + degree );
        System.out.println( "Occupation: " + occupation );
        System.out.println( "Bank Balance: " + bankBalance );
        System.out.println( "Address: " + address );

        System.out.println( "--------------------------------" );
    }
}
