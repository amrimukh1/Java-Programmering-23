package codealongs.Bicycle;

public class Bicycle {
    private int gear =1 ;

    public void setGear(int gear)
    {
        this.gear = gear;

    }

    public int getGear()
    {
      return gear;

    }

    void gearUp()
    
    {
gear++;
 System.out.println( "Gear up " + gear);

    }

    void gearDown()
    {
gear--;
System.out.println(" Gear down " + gear);

    }

    public static void main( String[] args)
    {
 Bicycle bike = new Bicycle();
 bike.setGear(5);
 
 bike.gearUp();
 bike.gearUp();
 bike.gearDown();
 System.out.println(bike.getGear());

}
}
