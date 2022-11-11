//question39
import java.util.Scanner;
public class assign39{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter any integer from 1-3");
        int a = obj.nextInt();
        if(a==1)
        System.out.println("one");
        else if (a==2)
        System.out.println("two");
        else if (a==3)
        System.out.println("three");
        else 
        System.out.println("it gives mgs out of range");
    }
}