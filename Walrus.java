public class Walrus {
    int age;
    double weight ;
    String name;

    Walrus()
    {
       
       
        age = 10;
       weight = 150.6;
       name = "Default" ; 



    }

     Walrus(int age)
    {
     this.age=age;

    }

    // Walrus(String name , double weight)

     public static void main(String[] args)
     {

     Walrus roland = new Walrus();
     Walrus carl = new Walrus(5);
     System.out.println(roland.name + "is " + roland.age + "years old"  + roland.weight);
     System.out.println("Carl is " + carl.age + "   years old");
     }

}
