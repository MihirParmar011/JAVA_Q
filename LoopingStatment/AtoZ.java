package LoopingStatment;

public class AtoZ {
    public static void main(String[] args) {
        for (char ch = 'A'; ch <= 'Z' ; ch++) {
            System.out.print(ch+" ");
        }
        System.out.println();
        System.out.println("-----------------------------------------");

        for (int i = 65; i<=90; i++){
            System.out.println(i+" -----> "+(char)i);
        }
        System.out.println("-----------------------------------------");

        for (int j = 1, k = 65; (j <= 26 && k <= 90); j++, k++){
            System.out.println(j +" "+ (char)k +" -----> "+ k );
        }
    }
}
