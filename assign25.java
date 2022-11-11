//question(25)
import java.util.Scanner;
public class assign25{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the sales :");
        int sale = obj.nextInt();
        double comisn;
        if(sale>=25000)
        {
            comisn = (sale*5)/100;
            System.out.println("commission ="+comisn+"Rs.");

        }
        else 
        {
            comisn = (sale*7)/100;
            System.out.println("commission ="+comisn+"Rs.");
        }
    }
}        