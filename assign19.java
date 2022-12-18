//question(19)
import java.util.Scanner;
public class assign19{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principle ammount :");
        float p = input.nextFloat();
        int r = 15;
        int t =2;
        float si = (p*r*t)/100;
        System.out.println("simple interest"+si);

    }
    
}        
