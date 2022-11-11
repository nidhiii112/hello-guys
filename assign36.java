//question(36)
import java.util.Scanner;
public class assign36{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the age of the person");
        int a = obj.nextInt();
        String str;
        str = (a>=18)?"adult":"minor";
        System.out.println(str);
    }
}
