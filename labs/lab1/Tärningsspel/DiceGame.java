package labs.lab1.Tärningsspel;

import java.util.Scanner;

public class DiceGame {
    /**
     * @param args
     */
    public static void main ( String[] args)

   {

    Scanner scanner = new Scanner(System.in);
    int times = 1; 

    System.out.println("How many times you want to play" );
     int numberOftimes = scanner.nextInt(); 

     System.out.println("How many sides of dice , do you want ? ");

       int numberOfsides = scanner.nextInt(); 

     //  Die dice = new Die(numberOfsides); 

   


    System.out.println(" Name of the player");

     String name = scanner.next(); 

   
    
    
    

    Player player1 = new Player(name);

    player1.addDie(numberOfsides);

    while ( times <= numberOftimes)
    {

     System.out.println(" Guess a number ?");
     int guess = scanner.nextInt(); 
    
    System.out.println(" We are rolling the dice ");

     player1. rollDice();

     System.out.println(" The Die value is " + player1.getDieValue());   
     
     

    if( guess == player1.getDieValue())
    {
       player1.increaseScore();
       System.out.println(" Your point is " + player1.getPoint() );
    
   }
   else
   System.out.println(" Number did not match  ");

   

    times++ ; 
    }
  

  System.out.println(" ************** " + name + " Your Point is : " + player1.getPoint()+ " *****************  "); 





}
}
