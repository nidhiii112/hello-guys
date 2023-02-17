//question38
import java.util.Scanner;
public class assign38{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the age sale made by any person");
        int sale = obj.nextInt();
        double comisn;
        String str;
        str = (sale>2500)?"(sale*5)/100":"(sale*7)/100";
        System.out.println(str);
    }
} 
