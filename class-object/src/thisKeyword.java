
class Students
{
   String name;
   int age;
   public void printInfo()
   {
       System.out.println(this.name);
       System.out.println(this.age);
   }
}
 class user
{
    public static void main(String[] args)
    {
        Students s1=new Students();
        Students s2=new Students();
        s1.name="anmol";
        s1.age=21;
        s2.name="raj";
        s2.age=22;
        s1.printInfo();
        s2.printInfo();
    }
}
