//question(22)
import java.util.Scanner;
public class assign22{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter marks in three subject:");
        int a = obj.nextInt();
        int b= obj.nextInt();
        int c = obj.nextInt();
        int average = (a+b+c)/3;
        System.out.println("average"+average);
        if(average>=33)
        System.out.println("pass");
        else
        System.out.println("fail");
    }
}        