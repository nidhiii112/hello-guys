//question31
import java.util.Scanner;
public class assign31{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the annual family income and age of the person:");
        int income = obj.nextInt();
        int age = obj.nextInt();
        if ((income>=100000 && income <=200000) && (age>=18 && age<=24))
        System.out.println("Eligible for scholarship");
        else 
        System.out.println("Not eligible for scholarship");
    }
}        