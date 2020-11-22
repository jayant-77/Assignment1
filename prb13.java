package Assignment1;
import java.util.Scanner;
class prb13
{
    public static void main(String []args)
    {
        Scanner fc = new Scanner(System.in);
        System.out.println("Enter a Value Of First No=");
        int a = fc.nextInt();
        System.out.println("Enter a Value Of Second No=");
        int b = fc.nextInt();
        System.out.println("Enter a Value Of Third No=");
        int c = fc.nextInt();
        
        if (a>b && a>c)
        {
            System.out.println("a is greatest number ="+a);
        }
        //else 
       /* {
            System.out.println("b is greatest number ="+b);
        }*/
        System.out.println((b>c)?"b is greatest number "+b:+c+ " c is greatest number ");
    }
}