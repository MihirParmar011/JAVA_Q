import java.util.Scanner;

public class SumNNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter NUmber: ");
        int number = sc.nextInt();

        int  sumNumber = number*(number+1)/2;
        System.out.println("Answer : "+sumNumber);

        System.out.println("---------------------");
        int sum = 0;
        for (int i = 1; i <=number ; i++) {
            sum += i;
        }

        System.out.println("Answer : "+sum);
            
    }
}