//question43
import java.util.*;
import java.util.Scanner;
public class assign42{
    public static void main(String[]args) {
        int n1=0,n2=1,n3,i,total=7; //it print 0 and 1
        System.out.print(n1+" "+n2);
        for(i=2;i<=total;++i)
        {
            //now loop print from 2 bcoz 0 and 1 are printed
        n3=n1+n2;
        System.out.print(" "+n3);
        n1=n2;
        n2=n3;
        }


    }
}