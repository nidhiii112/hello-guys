//question(18) ..
import java.util.Scanner;
public class assign18{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("enter the two integer :");
        int a = input.nextInt();
        int b = input.nextInt();
        int c= a/b;
        System.out.println("number of times first integer can be divided by the second int :"+c);
        int r= a%b;
        System.out.println("it will left :"+r);
    }
    
}
