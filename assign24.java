//question(24)
import java.util.Scanner;
public class assign24{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the integer:");
        int a= obj.nextInt();
        if(a<5)
        {
            double cube = a*a*a;
            System.out.println("cube of"+a+"is"+cube);
        }
        else
        {
            double square = a*a;
            System.out.println("square of"+a+"is"+square);
        }
    }
}       