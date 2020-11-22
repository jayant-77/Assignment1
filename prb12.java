package Assignment1;
import java.util.Scanner;
class prb12
{
    public static void main (String[]args)
    {
        double HRA=0,DA,GS;
        Scanner fc = new Scanner (System.in);
        System.out.println("Enter a Basic Salary =");
        double basic = fc.nextDouble();
        System.out.println("Enter a Basic Salary type =");
        int type = fc.nextInt();
        switch (type)
        {
            case 1:
                
                      if (basic<10000)
                          HRA=(10*basic)/100;
                          //GS = HRA+basic;
                          DA =(90*basic)/100;
                          GS = HRA+DA+basic;
                          System.out.println("Gross Salary ="+GS);
                          break;
                          
            case 2:
                      
                       if (basic>=10000)
                          HRA=2000;
                          //GS = HRA+basic;
                          DA =(98*basic)/100;
                          GS = HRA+DA+basic;
                          System.out.println("Gross Salary ="+GS);
                          break;
                          
            default :
                        System.out.println("Not Have any Salary Type");
        }
       
    }
}
