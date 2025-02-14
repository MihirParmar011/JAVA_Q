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

    public static void swastika(int rn, int cn){
        for (int r = 1; r <= rn ; r++) {
            for (int c = 1; c <=cn ; c++) {
                if ( r == 1 && c >= (cn/2)+1
                        || c == 1 && r <= (cn/2)+1
                        || r == rn && c <= (rn/2)+1
                        || c == cn && r >= (cn/2)+1
                        || r == (rn/2)+1
                        || c == (cn/2)+1 ) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void swastika0(int rn, int cn){
        for (int r = 1; r <= rn ; r++) {
            for (int c = 1; c <=cn ; c++) {
                if ( r == 1 && c >= (cn/2)+1
                        || c == 1 && r <= (cn/2)+1
                        || r == rn && c <= (rn/2)+1
                        || c == cn && r >= (cn/2)+1
                        || r == (rn/2)+1
                        || c == (cn/2)+1 ) {
                    System.out.print("  ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void fan(int rn, int cn){
        for (int r = 1; r <= rn ; r++) {
            for (int c = 1; c <=cn ; c++) {
                if ( r == 1 && c >= (cn/2)+1
                        || c == 1 && r <= (cn/2)+1
                        || r == rn && c <= (rn/2)+1
                        || c == cn && r >= (cn/2)+1
                        || r == (rn/2)+1
                        || c == (cn/2)+1
                        || r == c
                        || r+c == rn +1 ) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void flagSquare(int rn, int cn){
        for (int r = 1; r <= rn ; r++) {
            for (int c = 1; c <= cn ; c++) {
                 if ( r == 1 || c == 1 || r == rn || c == cn
                        || r == rn/2+1
                        || c == cn/2+1) {
                    System.out.print("  ");
                 } else if ( r == c || r+c == rn+1) {
                         System.out.print("0 ");
                 } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void flagSquare0(int rn, int cn){
        for (int r = 1; r <= rn ; r++) {
            for (int c = 1; c <= cn ; c++) {
                if ( r==rn/2+1 && c==cn/2+1){
                    System.out.print("@ ");
                }
                if ( r == 1 || c == 1 || r == rn || c == cn
                        || r == rn/2+1
                        || c == cn/2+1) {
                    System.out.print("  ");
                } else if ( r == c || r+c == rn+1) {
                    System.out.print("0 ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void flagSquare1(int rn, int cn){
        for (int r = 1; r <= rn ; r++) {
            for (int c = 1; c <= cn ; c++) {
                if (r == c || r+c == rn+1){
                    System.out.print("0 ");
                } else if ( r == 1 || c == 1 || r == rn || c == cn
                        || r == rn/2+1
                        || c == cn/2+1) {
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void tringle(int rn){
        for (int r = 1; r < rn ; r++) {
            for (int s = 1; s <= (rn-r) ; s++) {
                System.out.print("  ");
            }
            for (int c = 1; c <= (2*r)-1 ; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }

//        for (int r = 1; r <= rn ; r++) {
//            System.out.println("  ".repeat(rn-r)+"* ".repeat(2*r-1));
//        }
    }

    public static void hollowTringle(int rn){
        for (int r = 1; r < rn ; r++) {
            for (int s = 1; s <= (rn-r) ; s++) {
                System.out.print("  ");
            }
            for (int c = 1; c <= (2*r)-1 ; c++) {
                if (c == 1 || r == (rn-1) || c == (2*r)-1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void ethereum(int rn){
        for (int r = 1; r <= rn ; r++) {
            System.out.println("  ".repeat(rn-r)+"* ".repeat(2*r-1));
        }
        for (int r = rn-1; r >= 1 ; r--) {
            System.out.println("  ".repeat(rn-r)+"* ".repeat(2*r-1));
        }

    }

    public static void diamond(int rn){
        //first half
        for(int r=12; r<=rn; r++)
        {
            //spaces
            for(int k=1; k<=(rn-r); k++)
            {
                System.out.print("  ");
            }

            //stars
            for(int s=1; s<=(r*2)-1; s++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }

        //2nd half
        for(int r=rn-1; r>=1; r--)
        {
            //spaces
            for(int k=1; k<=(rn-r); k++)
            {
                System.out.print("  ");
            }
            //stars
            for(int s=1; s<=(r*2)-1; s++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void sandClock(int rn){
        for(int r=rn; r>=2; r--) {
            //spaces
            for(int k=1; k<=(rn-r); k++) {
                System.out.print("  ");
            }
            //stars
            for(int s=1; s<=(2*r)-1; ++s) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int r=1; r<=rn; r++) {
            //spaces
            for(int k=1; k<=(rn-r); k++) {
                System.out.print("  ");
            }
            //stars
            for(int s=1; s<=(2*r)-1; ++s) {
                if(s==1 || s== (2*r)-1
                        || r==rn
                        || s==(2*r)/2
                        ||r==(rn-1)) {
                    System.out.print("* ");
                }else {
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

        swastika(rn, cn);
        System.out.println("---------------------------------");

        swastika0(rn, cn);
        System.out.println("---------------------------------");

        fan(rn, cn);
        System.out.println("---------------------------------");

        flagSquare(rn, cn);
        System.out.println("---------------------------------");

        flagSquare0(rn, cn);
        System.out.println("---------------------------------");

        flagSquare1(rn, cn);
        System.out.println("---------------------------------");

        tringle(rn);
        System.out.println("---------------------------------");

        hollowTringle(rn);
        System.out.println("---------------------------------");

        ethereum(rn);
        System.out.println("---------------------------------");

        diamond(rn);
        System.out.println("---------------------------------");

        sandClock(rn);
        System.out.println("---------------------------------");
    }
}
