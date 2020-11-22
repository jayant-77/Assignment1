package Assignment1;
import java.util.Scanner;
class prb7
{
    public static void main(String args[])
    {
        double p,q;
        int sum=0;
        int t=500;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a marks of Marathi=");
        int M= sc.nextInt();
        System.out.println("Enter a marks of Hindi=");
        int H= sc.nextInt();
       System.out.println("Enter a marks of English=");
        int E= sc.nextInt();
        //System.out.println("Enter a marks of E=");
         System.out.println("Enter a marks of Maths=");
        int M1= sc.nextInt();
       // System.out.println("Enter a marks of M1=");
       System.out.println("Enter a marks of Science=");
        int S= sc.nextInt();
        //System.out.println("Enter a marks of S=");
        
        sum=M+H+E+M1+S;
        q=(sum*100)/t;
       // p=q*100;
        System.out.println("Percentage Marks="+q);
        
    }
}