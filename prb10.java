package Assignment1;
import java.util.Scanner;
class prb10
{
    public static void main(String args[])
    {
         double c;
        Scanner fc = new Scanner(System.in);
        System.out.println("enter a value of deFahrenheit=");
        float f = fc.nextFloat();
        
        c = 5*(f-32)/9;
        System.out.println("celcius ="+c);
        
        
    }
}