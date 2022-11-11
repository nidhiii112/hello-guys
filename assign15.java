//question(15)
import java.util.Scanner;
public class assign15{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      System.out.println("Enter the two integer:");
      float a= input.nextFloat();
      float b= input.nextFloat();
      float c = a+b;
      float d = (a+b)/2f;
      System.out.println("sum"+c);
      System.out.println("average"+d);
    }
}        