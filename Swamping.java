import java.util.Scanner;

public class Swamping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  Number of A: ");
        int a = sc.nextInt();
        System.out.print("Enter b  Number of b: ");
        int b = sc.nextInt();

         int temp = a;
         a=b;
         b= temp;

        System.out.println("------------------------");
        System.out.println("Number of A: "+a);
        System.out.println("Number of B: "+b);
    }
}
