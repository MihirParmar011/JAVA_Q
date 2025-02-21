package Array;

import java.util.Scanner;

public class arrayUSerInput {
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

        for (int j = 0; j <n ; j++) {
            System.out.println(j+" Element is "+arr[j]);
        }
    }
}
