//question(21)
import java.util.Scanner;
public class assign21{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the age of the person:");
        int age = obj.nextInt();
        if(age>=18)
        System.out.println("you are adult");
        else
        System.out.println("you are minor");
    }
}        
        
