package Assignment1;
import java.util.Scanner;
class prb15
{
    public static void main(String args[])
    {
        //char m,f;
        Scanner fc = new Scanner (System.in);
        System.out.println("Enter a age of Person =");
        int age = fc.nextInt();
        System.out.println("Enter a gender of Person =");
        String gender = fc.next();
        switch(gender)
        {
            
            case "m":
            
               
                if (age>=24)
                    System.out.println("person is eligible for married");
                else
                     System.out.println("person is not eligible for married");
                    break;
            
            case "f":
                
               
                if (age>=18)
                    System.out.println("person is eligible for married");
                else
                     System.out.println("person is not eligible for married");
                    break;
          
            default :
                  
                System.out.println("visit again...!!!");
            }
    }
}
          
                
        
           
          
        
  