package Array;

import java.util.Scanner;

public class FindStringLatter {

    public static void userInput(String str){
        int uCount = 0;
        int lCount = 0;

        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                uCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                lCount++;
            }
        }
        System.out.println("Total Upper case Letters are "+uCount);
        System.out.println("Total Lower case Letters are "+lCount);
    }

    public static void inBuilt(){
        String friend = "Abhi Parth Gnyan RTank Darshan";
        int uCount = 0;
        int lCount = 0;

        for (int i = 0; i <friend.length() ; i++) {
            char ch = friend.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                uCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                lCount++;
            }
        }
        System.out.println("Total Upper case Letters are "+uCount);
        System.out.println("Total Lower case Letters are "+lCount);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        userInput(str);

        inBuilt();
    }
}
