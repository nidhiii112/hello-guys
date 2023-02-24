//question(1)..
import java.util.Scanner;
public class assign1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);  
        System.out.println("enter your name :"); 
        String name = input.next();
        System.out.println("enter your course :");
        int course = input.nextInt();
        System.out.println("enter the notes :");
        int notes = input.nextInt();
        System.out.println("name"+name);
        System.out.println("BCA"+course);
    }
}
