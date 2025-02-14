package LoopingStatment;

public class divide3 {
    public static void main(String[] args) {
        int x = 90;
        while (x>=70){
            System.out.print(x+" ");
            x-=3;
        }
        System.out.println();
        System.out.println("------------------------------------------");

        int y = 90;
        while (y >= 70){
            if (y % 3 == 0 ) {
                System.out.print(y + " ");
            }
            y--;
        }
    }
}
