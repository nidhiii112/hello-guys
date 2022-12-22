//QUESTION35
import java.util.Scanner;
public class assign35{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any character :");
        char i = obj.nextLine().charAt(0);
        if (i>='A'&& i<='Z')
        System.out.println("the character is capital alphabet");
        else if ( i>='a' && i <= 'z')
        System.out.println("the character is small alphabet");
        else 
        System.out.println("the character is digit or any other char");
 
    }
    
}
