import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a Number of limit of Fibonacci Series: ");
        int limit = sc.nextInt();

        int n0 = 0;
        int n1 = 1;

        for (int i = 1; i <= limit ; i++) {
            int n2 = n0 + n1;
            System.out.print(n0+" ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();
        System.out.println("-------------------------------------------------------------");
        // try Tribonacci
    }
}
