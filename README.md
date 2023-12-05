- 👋 Hi, I’m @divyareddy64570
- 👀 I’m interested in ...
- 🌱 I’m currently learning ...
- 💞️ I’m looking to collaborate on ...
- 📫 How to reach me ...

<!---
divyareddy64570/divyareddy64570 is a ✨ special ✨ repository because its `README.md` (this file) appears on your GitHub profile.
You can click the Preview link to take a look at your changes.
--->
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
    
