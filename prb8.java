package Assignment1;
import java.util.Scanner;
class prb8
{
    public static void main(String args[])
    {
        double si;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value of principle amount=");
        int p = sc.nextInt();
        System.out.println("Enter a value of rate of intrest=");
        float r = sc.nextFloat();
        System.out.println("Enter a value of time=");
        double t = sc.nextDouble();
        
        si = (p*r*t)/100;
        System.out.println("simple inrest ="+si);
    }
}
