package Pattern;

import java.util.Scanner;

public class Patterns {

    public static  void rectangle(int rn, int cn){

        for (int r = 1; r <=rn ; r++) {
            for (int c = 1; c <=cn ; c++) {
                System.out.print(r+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------");

        for (int r = 1; r <=rn ; r++) {
            for (int c = 1; c <=cn ; c++) {
                System.out.print(c+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------");

        for (int r = 1; r <=rn ; r++) {
            for (int c = 1; c <=cn ; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------");
    }

    public static  void hollowRectangle(int rn, int cn){
        for (int r = 1; r <= rn ; r++) {
            for (int c = 1; c <= cn ; c++) {
                if (r == 1 || c == 1 || r == rn || c == cn){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void hollowCrossRec(int rn, int cn){
        for (int r = 1; r <= rn ; r++) {
            for (int c = 1; c <= cn ; c++) {
                if (r == 1 || c == 1 || r == rn || c == cn || r == c ){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void crossingRec(int rn, int cn){
        for (int r = 1; r <= rn ; r++) {
            for (int c = 1; c <= cn ; c++) {
                if (r == 1 || c == 1 || r == rn || c == cn
                           || r == c
                           || r+c == (rn+1) ){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void filledCrossingRec(int rn, int cn){
        for (int r = 1; r <= rn ; r++) {
            for (int c = 1; c <= cn ; c++) {
                if (r == 1 || c == 1 || r == rn || c == cn
                        || r == c
                        || r+c == (rn+1) ){
                    System.out.print("  ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void rightBottomHollowTringle(int rn, int cn){
        for (int r = 1; r <= rn ; r++) {
            for (int c = 1; c <= cn ; c++) {
                if ( (r+c)==rn+1 || r == rn || c == cn){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void rightTopHollowTringle(int rn, int cn){
        for (int r = 1; r <= rn ; r++) {
            for (int c = 1; c <= cn ; c++) {
                if ( r == 1  || r == c || c == cn){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void rightTopTringle(int rn, int cn){
        for (int r = 1; r <= rn ; r++) {
            for (int c = 1; c <= cn ; c++) {
                if ( r <= c){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void rightTop0Tringle(int rn, int cn){
        for (int r = 1; r <= rn ; r++) {
            for (int c = 1; c <= cn ; c++) {
                if ( r == 1 || r == c || c == cn){
                    System.out.print("* ");
                } else if ( r < c ) {
                    System.out.print("0 ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number of Rows: ");
        int rn = sc.nextInt();
        System.out.print("Enter a Number of Columns: ");
        int cn = sc.nextInt();

        rectangle(rn, cn);
        System.out.println("---------------------------------");

        hollowRectangle(rn, cn);
        System.out.println("---------------------------------");

        hollowCrossRec(rn, cn);
        System.out.println("---------------------------------");

        crossingRec(rn, cn);
        System.out.println("---------------------------------");

        filledCrossingRec(rn, cn);
        System.out.println("---------------------------------");

        rightBottomHollowTringle(rn, cn);
        System.out.println("---------------------------------");

        rightTopHollowTringle(rn, cn);
        System.out.println("---------------------------------");

        rightTopTringle(rn, cn);
        System.out.println("---------------------------------");

        rightTop0Tringle(rn, cn);
        System.out.println("---------------------------------");
    }
}
