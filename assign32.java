//question32
import java.util.Scanner;
public class assign32{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter marks in three subject:");
        int a = obj.nextInt();
        int b= obj.nextInt();
        int c = obj.nextInt();
        int avg = (a+b+c)/3;
        double division;
        if (avg>=60)
        System.out.println("first division");
        else if (avg>=45 && avg<=60)
        System.out.println("second division");
        else if(avg>=33 && avg<=45)
        System.out.println("third division");
        else 
        System.out.println("fail");
    }
}        