import java.util.Scanner;

public class SwastikPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an odd number for the size of the swastik: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n < 5 || n % 2 == 0) {
            System.out.println("Please enter an odd number greater than or equal to 5.");
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (
                        (j == n / 2 && i >= 0) || // Vertical middle line
                        (i == n / 2 && j >= 0) || // Horizontal middle line
                        (j == 0 && i <= n / 2) || // Left vertical top part
                        (i == 0 && j >= n / 2) || // Top horizontal right part
                        (i == n - 1 && j <= n / 2) || // Bottom horizontal left part
                        (j == n - 1 && i >= n / 2) // Right vertical bottom part
                ) { 
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}