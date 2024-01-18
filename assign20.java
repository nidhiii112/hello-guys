//question(20) 

import java.util.Scanner;
public class assign20{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();
        System.out.println("enter two integer:"+a+"&"+b);
        float addition = a+b;
        System.out.println(a+"+"+b+"="+addition);
        float subtraction = a-b;
        System.out.println(a+"-"+b+"="+subtraction);
        float multiplication = a*b;
        System.out.println(a+"*"+b+"="+multiplication);
        float division = a/b;
        System.out.println(a+"/"+b+"="+division);
        float mod = a%b;
        System.out.println(a+"%"+b+"="+mod);
    }
    
}        
