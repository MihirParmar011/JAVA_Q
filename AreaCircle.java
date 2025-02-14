import java.util.Scanner;

public class AreaCircle {

    public static double areaOfCircle(double num){

        double Pi= 3.14;

        double ans = Pi*num*num;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the redius: ");
        double n= sc.nextDouble();

        System.out.println("Area Of circle: "+areaOfCircle(n));
    }
}
