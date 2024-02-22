 //Question(1) .. 
 
import java.util.Scanner;     
public class assign1 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name :");   
        String name = input.next();
        System.out.println("Enter your course :"); 
        int course = input.nextInt();
        System.out.println("Enter the notes :");
        int notes = input.nextInt();  
        System.out.println("name"+name);    
        System.out.println("BCA"+course);
    }         
} 