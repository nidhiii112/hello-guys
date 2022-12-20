//question(27)
import java.util.Scanner;
public class assign27{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any integer :");
        int i = obj.nextInt();
        if(i<0)
        System.out.println("negative integer");
        else if (i >0)
        System.out.println("positive integer");
        else 
        System.out.println("zero integer");
    }
    
}        
