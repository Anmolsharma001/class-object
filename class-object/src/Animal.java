//MULTILEVEL INHERITANCE....
public class Animal
{
    void eat()
    {
        System.out.println("Eating");
    }
}
class Dog extends Animal
{
   void bark()
   {
       System.out.println("barking");
   }
}
class BabyDog extends Dog
{
  void weep()
  {
      System.out.println("weeping");
  }
}
class Animal2
{
    public static void main(String[] args)
    {
      BabyDog A=new BabyDog ();
      A.eat();
      A.bark();
      A.weep();
    }
}
