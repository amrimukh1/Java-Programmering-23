package codealongs;

import java.util.Scanner;





   
  public class GeometryTester {


public static void main( String[] args ) 

{
    
  
Scanner sc= new Scanner(System.in);

    Circle new_circle = new Circle();
    System.out.println(" Enter radius of circle ");
    double  radius= sc.nextDouble(); 
    System.out.println(" Area of circle is " + new_circle.computeArea(radius) );
    System.out.println(" Circumference of circle is "  + new_circle.computeCircumference(radius));
   
    Rectangle new_Rectangle = new Rectangle();
     System.out.println("enter length and bredth of triangle");
    int length = sc.nextInt();
     int breadth = sc.nextInt(); 
     System.out.println(" Area od rectangle is " + new_Rectangle.computeArea(length, breadth));
    
    




}

    
}

class Circle{

    double radius; 

   public double computeArea(double radius)

   {

    
     this.radius = radius; 
    double area = 3.14 * radius * radius; 
     return area; 

   }
   

   public double computeCircumference(double radius)
   {

    double circum = 2* 4.13* radius;
    return circum; 


   }



  }


class Rectangle

{
int length ;
int bredth ; 
public double computeArea(int length, int bredth)
{
  

this.length = length ;
this.bredth = bredth ; 

double area = length * bredth ; 

return area; 



}



}
