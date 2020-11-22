package Assignment1;
import java.util.Scanner;
class prb14
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year =");
        int y = sc.nextInt();
         
        if (y%4==0)
        {
            System.out.println("yaer is leap");
            
            
        }
        else
        {
            System.out.println("yaer is not leap");
        }
    }
}