import java.util.Scanner;

public class SwapWithout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  value of A: ");
        int a = sc.nextInt();
        System.out.print("Enter b  Value of b: ");
        int b = sc.nextInt();

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("------------------------");
        System.out.println("A value is: "+a);
        System.out.println("B value is: "+b);
    }
}
