//question30
import java.util.Scanner;
public class assign30{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any integer code ");
        int i = obj.nextInt();
        if(i>=5 && i<=24)
        System.out.println("Right code");
        else 
        System.out.println("Wrong code");
    }
    
}        
