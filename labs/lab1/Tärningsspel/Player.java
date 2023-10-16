package labs.lab1.Tärningsspel;

public class Player {

    String name;
    int point=0;
    Die dice = new Die(point); 

    public Player( String name)
    {
     
      this.name = name;

    }
    public String getName()
    {
      return name; 

    }

    public void setPoint(int newpoint)

    {

      point = newpoint;

    }
    
    public int getPoint()
    {
      return point; 

    }
    
    public void rollDice()

    {
        dice.roll(); 

    }

    public int getDieValue()

    {

      return dice.getNuvarde(); 
    }


    public void increaseScore()

    {
       point++; 

       setPoint(point);

    }


    public void addDie(int numberOfsides)

    {
        
      dice = new Die(numberOfsides);


    }
}
