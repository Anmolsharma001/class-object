//inerface ko define kiya h...jo java me hota haiii...
 interface janwar
{
    int eyes=2;
    void walk();
}
class cat implements janwar
{
  public void walk()
  {
      System.out.println("walks on 4 legs");
  }
}
class oppps
{
    public static void main(String[] args)
    {
       cat c=new cat();
       c.walk();
    }
}