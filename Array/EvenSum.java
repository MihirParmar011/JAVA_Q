package Array;

import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int [] arr = {21,12,63,85,74,96,6,32,45};   inbuild array
        System.out.print("Enter a length Of Array: ");
        int n = sc.nextInt();

        int[] arr= new int[n];

        // To take input fromuser
        for (int i = 0; i <n  ; i++) {
            System.out.println("Enter "+i+" Element: ");
            arr[i]= sc.nextInt();
        }
        System.out.println("-----------------------");

        int sum = 0;
        for (int i = 0; i <n ; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];

            }
        }
        System.out.println("Sum of even element is "+sum);

        int sum1 = 0;
        for (int i = 0; i <n ; i++) {
            if (arr[i] % 2 != 0) {
                sum1 += arr[i];

            }
        }
        System.out.println("Sum of Odd element is "+sum1);

    }

}
