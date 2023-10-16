package codealongs;

import java.util.Scanner;

public class myMathmethods {

    public static void main( String[] args)
    {
        myMathmethods math = new myMathmethods();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number whose factorial you want ");
        
        System.out.println("the factorial of the number is " +math.calculateFactorial(sc.nextInt())); 
          
        System.out.println("Enter position for Fibonacci series");
        math.calculateFibonacci(sc.nextInt());





    }


    int calculateFactorial(int x)   // factorial
   {

    int factorial = 1; 
      if(x>0) 
      {
        while(x>=1)
        {

        factorial = factorial * x; 
        x=x-1;
       
       }

    }

      return factorial ;
    
}


void calculateFibonacci(int position) 

{  

    int sum =0; 
    int i=0, j= 1; sum =0 ;
    
   if(position ==1)
    { System.out.println(i);}
     



   

   if(position ==2)
   {

 System.out.println(i+j);

   }
  
   else {

    System.out.println(i + "  "  + j);

  for(int count =2 ; count <=position ; count ++)
   
  {

     sum = i+j;
     i=j;
     j=sum;

     System.out.println(sum);

  }
    

   }



}







}



