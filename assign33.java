//question(33)
import java.util.Scanner;
public class assign33{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the sale made by the salesman:");
        int sale = obj.nextInt();
        double comisn;
        if(sale>25000)
        {
            comisn =(sale*5)/100;
            System.out.println("the commission is:"+comisn);
        }
        else if (sale>25001 && sale<50000)
        {
            comisn = (sale*7)/100;
            System.out.println("the commission is:"+comisn);
        }
        else if (sale> 50001 && sale<75000)
        {
            comisn = (sale*8)/100;
            System.out.println("the commission is :"+comisn);
        }
        else 
        {
            comisn = (sale*10)/100;
            System.out.println("the commision is :"+comisn);
        }
    }
}        