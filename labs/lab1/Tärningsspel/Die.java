package labs.lab1.Tärningsspel;

import java.util.Random;

public class Die {

    int nuvarde ;
    int antal_sidor;
    private Random slumpgenerator = new Random(); 
    

    public Die( int antal_sidor)
    {
     // this.nuvarde = nuvarde ;
      this.antal_sidor = antal_sidor;

    }

    public int getAntalSidor()
    {
      return antal_sidor; 

    }

    public int getNuvarde()
    {
      return nuvarde; 

    }

    public void roll() {
        nuvarde = slumpgenerator.nextInt(antal_sidor) + 1; // We are adding 1 because nextInt gives value from 0 to maxvalue
    }
}
