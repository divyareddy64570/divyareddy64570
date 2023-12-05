//program to check wheter a given number is an even or an add number

import java.util.Scanner

public class EvenOdd
{
   public static void main(string args[])
     {
         System.out.print("enter a nymber;");
         Scanner reader = new Scanne(System.in);           //Object creation
         int num = reader.nextInt();           //reading the integer number
         reader.close();
         if(num % 2 == 0)
           {
               system.out.print("\nEntered number" +num " is an Even number.");
           }
          else
           {
               System.out.print("\nEntered number" +num " is an Odd number.");
           }
    }
}    
