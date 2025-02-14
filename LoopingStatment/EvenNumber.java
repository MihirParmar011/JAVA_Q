package LoopingStatment;

public class EvenNumber {
    public static void main(String[] args) {
        for (int i = 1; i <=20 ; i++) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();

        System.out.println("-------------------------------------------");

        for (int j = 2; j <=20 ; j+=2) {
            System.out.print(j+" ");
        }
        System.out.println();

        System.out.println("-------------------------------------------");

        int k = 2;
        while(k<=10){
            System.out.print(k+" ");
            k+=2;
        }
        System.out.println();

        System.out.println("-------------------------------------------");

        int x = 2;
        while(x<=10){
            if (x % 2 == 0){
                System.out.print(x+" ");
            }
            x++;
        }
    }
}
