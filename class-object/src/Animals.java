//ABSTRACTIONNN
abstract class Animals
{
    abstract void walk();
}
class Horse extends Animals
{
    public void walk()
    {
        System.out.println("walks on 4 legs");
    }
}
class chicken extends Animals
{
    public void walk()
    {
        System.out.println("flying in the sky");
    }
}
class ups
{
    public static void main(String[] args)
    {
       Horse h=new Horse();
       h.walk();
    }
}