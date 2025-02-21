package Array;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entr row of ArrayMatrix: ");
        int rn = sc.nextInt();
        System.out.print("Entr column of ArrayMatrix: ");
        int cn = sc.nextInt();

        int [][] arr2d = new int[rn][cn];

        for (int r = 0; r <rn ; r++) {
            for (int c = 0; c <cn ; c++) {
                System.out.print("Enter ("+r+","+c+") Element: ");
                arr2d[r][c] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------");

        System.out.println("Array 2D:");
        for (int r = 0; r <rn ; r++) {
            for (int c = 0; c <cn ; c++) {
                System.out.print(arr2d[r][c]+" ");
            }
            System.out.println();
        }


    }
}
