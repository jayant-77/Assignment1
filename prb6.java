package Assignment1;
import java.util.Scanner;

class prb6
{
    public static void main (String args[])
    {
        double a,c;
             double pi=3.14D;
        Scanner rc = new Scanner(System.in);
                 System.out.println("Radius of circle =");

        float r = rc.nextFloat();
        
        a = pi*r*r;
         c= 2*pi*r;
         System.out.println("Area of circle ="+a);
         System.out.println("Circumference of circle ="+c);
      }
}