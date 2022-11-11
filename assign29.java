//question29
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class assign29{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the code :");
        int code = obj.nextInt();
        if(code == 5 || code == 7|| code == 11 || code ==24)
        System.out.println("Right code");
        else 
        System.out.println("Wrong code");
    }
}        