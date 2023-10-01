import java.util.*;
import java.text.DecimalFormat;

//Start of the class Calculate_shapes

public class Int_Shapes {

   public static void main(String[] args) {
   
      //Declaring the variables
   int triangle_side1, triangle_side2,triangle_side3; //for the triangle
   int length, width; //for the rectangle
   int side; //for the square
   int rectangle_circumference = 0, triangle_circumference = 0, square_circumference = 0;

      //creating an object sc of Scanner class
      Scanner sc = new Scanner(System.in);


   //Input statement
   System.out.println("1. Calculate the circumference for triangle-- Type 1 ");
   System.out.println("2. Calculate the circumference for square -- Type 2");
   System.out.println("3. Calculate the circumference for rectangle -- Type 3 ");
   int choice; //t choose friom the menu , type 1, 2 or 3

   System.out.print("Please enter your choice: ");
   choice = sc.nextInt();

   // Calculating the circumference for the triangle

   switch(choice){
   case 1:

   System.out.print("Side 1 = ");
   triangle_side1 = sc.nextInt();

   System.out.print("Side 2 = ");
   triangle_side2 = sc.nextInt();

   System.out.print("Side 3 = ");
   triangle_side3 = sc.nextInt();

   //The process

   triangle_circumference = triangle_side1 + triangle_side2 + triangle_side3;

   //Displaying the results for the triangle
   System.out.println("The Triangle Circumference: " + triangle_circumference);
    break;

   // Calculating the circumference for the square
   case 2: 


   System.out.print("The Square Side = ");
   side = sc.nextInt();

   //The process
   square_circumference = 4 * side;

   //Displaying the results for the square
   System.out.println("The Square Circumference: " + square_circumference);

   break;

   // Calculating the circumference for the rectangle
   case 3: 


   System.out.print("The Rectangle Length = ");

   length = sc.nextInt();

   System.out.print("The Rectangle Width = ");
   width = sc.nextInt();

   rectangle_circumference = 2*length + 2*width;

   //Displaying the results for the rectangle
   System.out.println("The Rectangle Circumference: " + rectangle_circumference);

   break;
   default:

   System.out.println("Invalid Choice");
   break;



         }
   
       }
     }
