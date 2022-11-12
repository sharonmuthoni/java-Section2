package javaMethods;

import java.util.Scanner;

public class methods {
   public static void main(String[] args) {

    try(Scanner input = new Scanner(System.in)){
        //declare variable 
        int C1;
        int C2;
        int C3;

        int smallest;
        int largest;

        //ASKING USER FOR INPUT

        System.out.print("Enter 3 Numbers by spaces: ");
        C1 = input.nextInt();
        C2 = input.nextInt();
        C3 = input.nextInt();

        input.close();

        //GETTING THE SMALLEST NUMBER

        smallest = A1;
        if (C2<smallest)
        {
            smallest=A2;
        }
        if(C3<smallest)
        {
            smallest=A3;
        }

        //GETTING THE LARGEST

        largest=A1;
        if (C2>largest)
        {
            largest=A2;
        }
        if (C3>largest)
        {
            largest=C3;
        }

        //PRINTING THE OUTPUT

        System.out.print("The smallest number is\n" + smallest);
        System.out.print("\nThe largest number is\n" + largest+"\n");
        System.out.print(largest + " is your largest number and " 
        + smallest + " is your smallest number\n");
        
        

    }
    
   } 
}
