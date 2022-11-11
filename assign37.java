//question(37)
import java.util.Scanner;
public class assign37{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter any integer");
        int i = obj.nextInt();
        String str;
        str = (i%2==0)?"even":"odd";
        System.out.println(str);
    }
}