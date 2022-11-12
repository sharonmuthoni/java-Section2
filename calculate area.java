package Calculation;

import java.util.Scanner;

public class Area
{
      //RECTANGLE
      static double Areaofrectangle (double width,double length)
      {
          return (length * width);
      }   
    //TRIANGLE
    public static double AreaofTriangle(double Base, double Height)
    {
        return(Base * Height);
    }
   
   
    public static void main(String[] args)
    {
        try(Scanner input = new Scanner(System.in))
        {
             // triangle both base and height
            System.out.println("Every the base of Triangle");
            double Base= input.nextDouble();
            System.out.println("Every the height of Triangle");
            double Height = input.nextDouble();


             //length of rectangle
             System.out.println("Every the length of Rectangle");
             double length = input.nextDouble();
             //width of rectangle
             System.out.println("Every the width of Rectangle");
             double width = input.nextDouble();
 

            //TOTAL AREA OF A RECTANGLE
            double AreaofRectangle = RectangleArea(width, length);
            System.out.println("Rectangle Area is :" + AreaofRectangle);

            // TOTAL AREA FOR TRIANGLE

            double AreaofTriangle = TriangleArea(Base, Height);
            Systtem.out.println("Triangle Area
 is: " + AreaofTriangle);


        }
    }
}